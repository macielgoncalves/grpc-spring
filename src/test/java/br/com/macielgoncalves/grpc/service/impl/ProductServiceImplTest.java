package br.com.macielgoncalves.grpc.service.impl;

import br.com.macielgoncalves.grpc.domain.Product;
import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;
import br.com.macielgoncalves.grpc.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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
}
