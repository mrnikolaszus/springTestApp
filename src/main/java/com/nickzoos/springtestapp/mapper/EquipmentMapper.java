package com.nickzoos.springtestapp.mapper;

import com.nickzoos.springtestapp.dto.EquipmentDTO;
import com.nickzoos.springtestapp.model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EquipmentMapper extends BaseMapper<Equipment, EquipmentDTO> {

    @Autowired
    public EquipmentMapper(){
        super(Equipment.class, EquipmentDTO.class);
    }
}
