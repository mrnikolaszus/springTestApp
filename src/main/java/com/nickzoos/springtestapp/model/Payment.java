package com.nickzoos.springtestapp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class Payment extends BaseEntity{

    @Column(nullable = false)
    private LocalDate dateOfPayment;

    @Column
    private String bankData;

    @Column
    private BigDecimal paymentAmount;

    @ManyToMany
    @JoinTable(name = "payment_order",
                joinColumns = @JoinColumn(name = "payment_id"),
                inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Order> orders;
}
