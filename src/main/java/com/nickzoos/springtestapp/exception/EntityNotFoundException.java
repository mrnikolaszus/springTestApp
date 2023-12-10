package com.nickzoos.springtestapp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EntityNotFoundException extends RuntimeException {
    private Integer entityId;
    private String entityClass;

}
