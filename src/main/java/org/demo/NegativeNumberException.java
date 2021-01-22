package org.demo;

public class NegativeNumberException extends RuntimeException{
    private String exMsg;

    NegativeNumberException(String exMsg) {
        super(exMsg);
        this.exMsg = exMsg;
    }

    public String getExMsg() {
        return exMsg;
    }
}
