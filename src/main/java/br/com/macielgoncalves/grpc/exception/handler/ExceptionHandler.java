package br.com.macielgoncalves.grpc.exception.handler;

import br.com.macielgoncalves.grpc.exception.BaseBusinessException;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
public class ExceptionHandler {

    @GrpcExceptionHandler(BaseBusinessException.class)
    public StatusRuntimeException handleBaseException(BaseBusinessException e) {
        return e.getStatusCode()
                .withCause(e.getCause())
                .withDescription(e.getMessage())
                .asRuntimeException();
    }
}
