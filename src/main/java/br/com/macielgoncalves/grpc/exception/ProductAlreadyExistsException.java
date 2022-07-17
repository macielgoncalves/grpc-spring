package br.com.macielgoncalves.grpc.exception;

import io.grpc.Status;

public class ProductAlreadyExistsException extends BaseBusinessException {

    private static final String ERROR_MESSAGE = "Produto %s já cadastrado no Sistema";
    private final String name;

    public ProductAlreadyExistsException(String name) {
        super(String.format(ERROR_MESSAGE, name));
        this.name = name;
    }

    @Override
    public Status getStatusCode() {
        return Status.ALREADY_EXISTS;
    }

    @Override
    public String getErroMessage() {
        return String.format(ERROR_MESSAGE, name);
    }
}
