package dev.Ningappa.EcommProductService.exception;

public class CartNotFoundException extends RuntimeException{

    public CartNotFoundException() {
    }

    public CartNotFoundException(String message) {
        super(message);
    }

}
