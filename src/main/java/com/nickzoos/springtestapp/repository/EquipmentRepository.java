package com.nickzoos.springtestapp.repository;

import com.nickzoos.springtestapp.model.Equipment;
import com.nickzoos.springtestapp.model.enums.Dimensions;
import com.nickzoos.springtestapp.model.enums.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EquipmentRepository extends BaseRepository<Equipment> {

    Page<Equipment> findEquipmentByName(String name, Pageable pageable);
    Page<Equipment> findEquipmentByDimensions(Dimensions dims, Pageable pageable);
    Page<Equipment> findEquipmentByDimensionsIsNot(Dimensions dims, Pageable pageable);
    Page<Equipment> findEquipmentByDimensionsIsNull(Pageable pageable);
    Integer countEquipmentByTypeStartingWith(Type type);
    Page<Equipment> findEquipmentByAgeGreaterThan(Integer age);
}
