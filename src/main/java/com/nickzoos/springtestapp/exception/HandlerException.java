package com.nickzoos.springtestapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class HandlerException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler
    public ResponseEntity<Object> handlerEntityNotFoundException(final EntityNotFoundException e){
        final ExceptionDTO response = ExceptionDTO.builder()
                .error("EntityNotFoundException")
                .message(e.getEntityClass() +" with id: " + e.getEntityId() + " not found")
                .status(HttpStatus.NOT_FOUND)
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler
    public ResponseEntity<Object> handlerSaveEntityException(final SaveEntityException e){
        final ExceptionDTO response = ExceptionDTO.builder()
                .error("SaveEntityException")
                .message(e.getMessage())
                .status(HttpStatus.BAD_GATEWAY)
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_GATEWAY);
    }
}
