package br.com.macielgoncalves.grpc.resources;

import br.com.macielgoncalves.grpc.HelloReq;
import br.com.macielgoncalves.grpc.HelloRes;
import br.com.macielgoncalves.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloResource extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloReq request, StreamObserver<HelloRes> responseObserver) {
        HelloRes response = HelloRes.newBuilder()
                .setMsg(request.getMsg())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
