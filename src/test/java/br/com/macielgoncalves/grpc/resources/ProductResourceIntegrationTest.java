package br.com.macielgoncalves.grpc.resources;

import br.com.macielgoncalves.grpc.ProductResponse;
import br.com.macielgoncalves.grpc.ProductResquet;
import br.com.macielgoncalves.grpc.ProductServiceGrpc;
import br.com.macielgoncalves.grpc.RequestById;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.assertj.core.api.Assertions;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
@DirtiesContext
public class ProductResourceIntegrationTest {

    @GrpcClient("inProcess")
    private ProductServiceGrpc.ProductServiceBlockingStub serviceBlockingStub;

    @Autowired
    private Flyway flyway;

    @BeforeEach
    public void setUp() {
        flyway.clean();
        flyway.migrate();
    }

    @Test
    @DisplayName("when create method is call with valid id success")
    public void createProductSuccessTest() {
        ProductResquet productRequest = ProductResquet.newBuilder()
                .setName("Produto 01")
                .setPrice(10.00)
                .setQuantityInStock(100)
                .build();

        ProductResponse responde = serviceBlockingStub.create(productRequest);

        Assertions.assertThat(productRequest)
                .usingRecursiveComparison()
                .comparingOnlyFields("name", "price", "quantity_in_stock")
                .isEqualTo(responde);
    }

    @Test
    @DisplayName("when create method is call with an id exists throws AlreadyExistsEception")
    public void createProductAlreadyExistsExceptionTest() {
        ProductResquet productResquet = ProductResquet.newBuilder()
                .setName("Product A")
                .setPrice(10.00)
                .setQuantityInStock(100)
                .build();

        Assertions.assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> serviceBlockingStub.create(productResquet))
                .withMessage("ALREADY_EXISTS: Produto Product A já cadastrado no Sistema");
    }

    @Test
    @DisplayName("when findById method is call with id valid a product is returned")
    public void findByIdSuccessTest() {
        RequestById request = RequestById.newBuilder().setId(1L).build();

        ProductResponse responde = serviceBlockingStub.findById(request);

        Assertions.assertThat(responde.getId()).isEqualTo(request.getId());
        Assertions.assertThat(responde.getName()).isEqualTo("Product A");
    }

    @Test
    @DisplayName("when findById method is call with id invalid throws ProductNotFoundException")
    public void findByIdExceptionTest() {
        RequestById request = RequestById.newBuilder().setId(100L).build();

        Assertions.assertThatExceptionOfType(StatusRuntimeException.class)
                .isThrownBy(() -> serviceBlockingStub.findById(request))
                .withMessage("NOT_FOUND: Produto ID 100 não encontrado.");
    }

    @Test
    @DisplayName("when delete method is call with id valid does not throws")
    public void delteSuccessTest() {
        RequestById request = RequestById.newBuilder().setId(1L).build();

        Assertions.assertThatNoException().isThrownBy(() -> serviceBlockingStub.delete(request));
    }
}
