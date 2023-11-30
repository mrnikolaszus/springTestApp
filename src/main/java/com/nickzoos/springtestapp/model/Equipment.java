package com.nickzoos.springtestapp.model;

import com.nickzoos.springtestapp.model.enums.Discount;
import com.nickzoos.springtestapp.model.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column
    private Integer age;
    @Enumerated
    private Status status;
    @Enumerated
    private Discount discount;


}
