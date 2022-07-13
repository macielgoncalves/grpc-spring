package br.com.macielgoncalves.grpc.resources;

import br.com.macielgoncalves.grpc.ProductResponse;
import br.com.macielgoncalves.grpc.ProductResquet;
import br.com.macielgoncalves.grpc.ProductServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@DirtiesContext
public class ProductResourceIntegrationTest {

    @GrpcClient("inProcess")
    private ProductServiceGrpc.ProductServiceBlockingStub serviceBlockingStub;

    @Test
    public void createProductSuccessTest() {
        ProductResquet productResquet = ProductResquet.newBuilder()
                .setName("Produto 01")
                .setPrice(10.00)
                .setQuantityInStock(100)
                .build();

        ProductResponse responde = serviceBlockingStub.create(productResquet);

        Assertions.assertThat(productResquet)
                .usingRecursiveComparison()
                .comparingOnlyFields("name", "price", "quantity_in_stock")
                .isEqualTo(responde);
    }
}
