package com.nickzoos.springtestapp.model;

import com.nickzoos.springtestapp.model.enums.Dimensions;
import com.nickzoos.springtestapp.model.enums.Type;
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
@Table(name = "equipment")
public class Equipment extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column
    private Integer age;
    @Enumerated
    private Type type;
    @Enumerated
    private Dimensions dimensions;


}
