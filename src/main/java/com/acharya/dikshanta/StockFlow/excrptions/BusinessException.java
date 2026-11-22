package com.acharya.dikshanta.StockFlow.excrptions;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
