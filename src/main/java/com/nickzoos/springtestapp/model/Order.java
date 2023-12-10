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
@Table(name = "orders")
public class Order extends BaseEntity {
    @Column(nullable = false)
    private LocalDate dateOfOrder;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name ="equipment_id")
    private Equipment equipment;

    @Column(nullable = false)
    private BigDecimal price;
    @Column
    private Integer weight;

    @ManyToMany(mappedBy = "orders")
    private Set<Payment> payments;
}
