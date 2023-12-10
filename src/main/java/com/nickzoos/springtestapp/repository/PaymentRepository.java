package com.nickzoos.springtestapp.repository;

import com.nickzoos.springtestapp.model.Payment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface PaymentRepository extends BaseRepository<Payment> {

    Page<Payment> findPaymentByDateOfPaymentBefore(LocalDate date, Pageable page);
    Page<Payment> findPaymentByDateOfPaymentAfter(LocalDate date, Pageable page);
}
