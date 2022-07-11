package br.com.macielgoncalves.grpc.util;

import br.com.macielgoncalves.grpc.domain.Product;
import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;

public class ProductConverterUtil {

    public static ProductOutputDTO productToProductOutputDto(Product product) {
        return new ProductOutputDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getQuantityInStock()
        );
    }

    public static Product productInputDtoToProduct(ProductInputDTO inputDTO) {
        return new Product(
                null,
                inputDTO.getName(),
                inputDTO.getPrice(),
                inputDTO.getQuantityInStock()
        );
    }
}
