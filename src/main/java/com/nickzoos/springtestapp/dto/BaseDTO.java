package com.nickzoos.springtestapp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseDTO {

    @NotNull
    private Integer id;
}
