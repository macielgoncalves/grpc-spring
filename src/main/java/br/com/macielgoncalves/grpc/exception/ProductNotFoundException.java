    package br.com.macielgoncalves.grpc.exception;

import io.grpc.Status;

public class ProductNotFoundException extends BaseBusinessException {

    private static final String ERROR_MESSAGE = "Produto ID %s não encontrado.";
    private final Long id;

    public ProductNotFoundException(Long id) {
        super(String.format(ERROR_MESSAGE, id));
        this.id = id;
    }

    @Override
    public Status getStatusCode() {
        return Status.NOT_FOUND;
    }

    @Override
    public String getErroMessage() {
        return String.format(ERROR_MESSAGE, id);
    }
}
