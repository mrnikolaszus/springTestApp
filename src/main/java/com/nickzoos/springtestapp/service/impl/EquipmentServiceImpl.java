package com.nickzoos.springtestapp.service.impl;

import com.nickzoos.springtestapp.model.Equipment;
import com.nickzoos.springtestapp.repository.EquipmentRepository;
import com.nickzoos.springtestapp.service.EquipmentService;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl extends CrudServiceImpl<Equipment, EquipmentRepository> implements EquipmentService {
    protected EquipmentServiceImpl(EquipmentRepository repository, Class<Equipment> genericType) {
        super(repository, genericType);
    }
}
