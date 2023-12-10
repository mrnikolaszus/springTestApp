package com.nickzoos.springtestapp.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class ExceptionDTO {
    private String error;
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;
}
