package br.com.macielgoncalves.grpc.resources;

import br.com.macielgoncalves.grpc.*;
import br.com.macielgoncalves.grpc.dto.ProductInputDTO;
import br.com.macielgoncalves.grpc.dto.ProductOutputDTO;
import br.com.macielgoncalves.grpc.service.IProductService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ProductResource extends ProductServiceGrpc.ProductServiceImplBase {

    private final IProductService productService;

    public ProductResource(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public void create(ProductResquet request, StreamObserver<ProductResponse> responseObserver) {
        ProductInputDTO inputDTO = new ProductInputDTO(
                request.getName(),
                request.getPrice(),
                request.getQuantityInStock()
        );

        ProductOutputDTO outputDTO = productService.create(inputDTO);

        ProductResponse response = ProductResponse.newBuilder()
                .setId(outputDTO.getId())
                .setName(outputDTO.getName())
                .setPrice(outputDTO.getPrice())
                .setQuantityInStock(outputDTO.getQuantityInStock())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(RequestById request, StreamObserver<ProductResponse> responseObserver) {
        ProductOutputDTO outputDTO = productService.findById(request.getId());
        ProductResponse response = ProductResponse.newBuilder()
                .setId(outputDTO.getId())
                .setName(outputDTO.getName())
                .setPrice(outputDTO.getPrice())
                .setQuantityInStock(outputDTO.getQuantityInStock())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(RequestById request, StreamObserver<EmptyResponse> responseObserver) {
        productService.delete(request.getId());
        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(EmptyRequesty request, StreamObserver<ProductResponseList> responseObserver) {
        List<ProductOutputDTO> outputDTOList = productService.findAll();
        List<ProductResponse> productResposeList = outputDTOList.stream()
                .map(outputDTO -> ProductResponse.newBuilder()
                        .setId(outputDTO.getId())
                        .setName(outputDTO.getName())
                        .setPrice(outputDTO.getPrice())
                        .setQuantityInStock(outputDTO.getQuantityInStock())
                        .build())
                .collect(Collectors.toList());

        ProductResponseList response = ProductResponseList.newBuilder().addAllProducts(productResposeList).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
