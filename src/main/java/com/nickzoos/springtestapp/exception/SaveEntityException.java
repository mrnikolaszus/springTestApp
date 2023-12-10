package com.nickzoos.springtestapp.exception;

public class SaveEntityException extends RuntimeException {

    public SaveEntityException(final String entityType){
        super("The " + entityType + "wasn't save in database");
    }
}
