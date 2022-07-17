package br.com.macielgoncalves.grpc.service.impl;

import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;
import br.com.macielgoncalves.grpc.exception.ProductAlreadyExistsException;
import br.com.macielgoncalves.grpc.exception.ProductNotFoundException;
import br.com.macielgoncalves.grpc.repository.ProductRepository;
import br.com.macielgoncalves.grpc.service.IProductService;
import br.com.macielgoncalves.grpc.util.ProductConverterUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductOutputDTO create(ProductInputDTO inputDTO) {
        checkDuplicity(inputDTO.getName());
        var product = ProductConverterUtil.productInputDtoToProduct(inputDTO);
        var productCreated = productRepository.save(product);
        return ProductConverterUtil.productToProductOutputDto(productCreated);
    }

    @Override
    public ProductOutputDTO findById(Long id) {
        var product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        return ProductConverterUtil.productToProductOutputDto(product);
    }

    @Override
    public void delete(Long id) {
        var product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
        productRepository.delete(product);
    }

    @Override
    public List<ProductOutputDTO> findAll() {
        return null;
    }

    private void checkDuplicity(String name) {
        productRepository.findByNameIgnoreCase(name).ifPresent(e -> {
            throw new ProductAlreadyExistsException(name);
        });
    }
}
