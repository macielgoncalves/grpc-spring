package br.com.macielgoncalves.grpc.util;

import br.com.macielgoncalves.grpc.domain.Product;
import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductConverterUtilTest {

    @Test
    public void productToProductOutputDtoTest() {
        var product = new Product(1L, "Product Name", 10.00, 10);
        var productOutputDTO = ProductConverterUtil.productToProductOutputDto(product);

        Assertions.assertThat(product)
                .usingRecursiveComparison()
                .isEqualTo(productOutputDTO);
    }

    @Test
    public void productInputToProductTest() {
        var productInput = new ProductInputDTO("Product Name", 10.00, 10);
        var product = ProductConverterUtil.productInputDtoToProduct(productInput);

        Assertions.assertThat(productInput)
                .usingRecursiveComparison()
                .isEqualTo(product);
    }
}
