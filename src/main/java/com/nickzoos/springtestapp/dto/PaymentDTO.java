package com.nickzoos.springtestapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
public class PaymentDTO {


    private LocalDate dateOfPayment;

    private String bankData;


    private Set<Integer> ordersId;
}
