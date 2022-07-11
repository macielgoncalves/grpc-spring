package br.com.macielgoncalves.grpc.service.impl;

import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;
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
        var product = ProductConverterUtil.productInputDtoToProduct(inputDTO);
        var productCreated = productRepository.save(product);
        return ProductConverterUtil.productToProductOutputDto(productCreated);
    }

    @Override
    public ProductOutputDTO findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<ProductOutputDTO> findAll() {
        return null;
    }
}
