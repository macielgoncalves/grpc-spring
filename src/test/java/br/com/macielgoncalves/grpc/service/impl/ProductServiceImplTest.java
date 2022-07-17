package br.com.macielgoncalves.grpc.service.impl;

import br.com.macielgoncalves.grpc.domain.Product;
import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;
import br.com.macielgoncalves.grpc.exception.ProductAlreadyExistsException;
import br.com.macielgoncalves.grpc.exception.ProductNotFoundException;
import br.com.macielgoncalves.grpc.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @Test
    @DisplayName("when create product service is call with valid data a product is returned")
    public void createProductSuccessTest() {
        Product product = new Product(1L, "Product Name", 10.00, 10);
        Mockito.when(productRepository.save(Mockito.any())).thenReturn(product);

        ProductInputDTO inputDTO = new ProductInputDTO("Product Name", 10.00, 10);
        ProductOutputDTO outputDTO = productService.create(inputDTO);

        Assertions.assertThat(outputDTO)
                .usingRecursiveComparison()
                .isEqualTo(product);
    }

    @Test
    @DisplayName("when create product is call with duplicated name, throw ProductAlreadyExistsException")
    public void createProductExceptionTest() {
        Product product = new Product(1L, "Product Name", 10.00, 10);
        Mockito.when(productRepository.findByNameIgnoreCase(Mockito.any())).thenReturn(Optional.of(product));

        ProductInputDTO inputDTO = new ProductInputDTO("Product Name", 10.00, 10);

        Assertions.assertThatExceptionOfType(ProductAlreadyExistsException.class)
                .isThrownBy(() -> productService.create(inputDTO));
    }

    @Test
    @DisplayName("when findById product is call with valid id a product is returned")
    public void findByIdSuccessTest() {
        Long id = 1L;
        Product product = new Product(1L, "Product Name", 10.00, 10);
        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.of(product));

        ProductOutputDTO outputDTO = productService.findById(id);

        Assertions.assertThat(outputDTO)
                .usingRecursiveComparison()
                .isEqualTo(product);
    }

    @Test
    @DisplayName("when findById product is call with invalid id throws ProductNotFoundException")
    public void findByIdExceptionTest() {
        Long id = 1L;
        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.empty());

        Assertions.assertThatExceptionOfType(ProductNotFoundException.class)
                .isThrownBy(() -> productService.findById(id));
    }

    @Test
    @DisplayName("when delete product is call with valid id does not throws is returned")
    public void deleteSuccessTest() {
        Long id = 1L;
        Product product = new Product(1L, "Product Name", 10.00, 10);

        Mockito.doNothing().when(productRepository).delete(Mockito.any());
        Mockito.when(productRepository.findById(Mockito.any())).thenReturn(Optional.of(product));

        Assertions.assertThatNoException().isThrownBy(() -> productService.delete(id));
    }

    @Test
    @DisplayName("when delete product is call with valid id does not throws is returned")
    public void deleteExceptionTest() {
        Long id = 1L;

        Mockito.when(productRepository.findById(id)).thenReturn(Optional.empty());

        Assertions.assertThatExceptionOfType(ProductNotFoundException.class)
                .isThrownBy(() -> productService.delete(id));
    }
}
