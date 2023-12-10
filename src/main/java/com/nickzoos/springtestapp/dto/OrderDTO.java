package com.nickzoos.springtestapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
public class OrderDTO extends BaseDTO{

    @NotNull
    private LocalDate dateOfOrder;

    @NotNull
    private Integer userId;

    @NotNull
    private Integer equipmentId;

    @NotNull
    @Positive
    private BigDecimal price;

    private Integer weight;

    private Set<Integer> paymentsId;
}
