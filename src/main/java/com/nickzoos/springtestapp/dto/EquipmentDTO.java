package com.nickzoos.springtestapp.dto;


import com.nickzoos.springtestapp.model.enums.Dimensions;
import com.nickzoos.springtestapp.model.enums.Type;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EquipmentDTO extends BaseDTO {

    @Size(max = 100)
    @NotBlank
    private String name;

    @Positive
    private Integer age;

    private Type type;

    private Dimensions dimensions;
}
