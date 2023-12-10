package com.nickzoos.springtestapp.mapper;

import com.nickzoos.springtestapp.dto.BaseDTO;
import com.nickzoos.springtestapp.model.BaseEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;


public abstract class BaseMapper<E extends BaseEntity, D extends BaseDTO> {

    @Autowired
    ModelMapper modelMapper;

    private final Class<E> entityClass;

    private final Class<D> dtoClass;

    public BaseMapper(Class<E> entityClass, Class<D> dtoClass) {
        this.entityClass = entityClass;
        this.dtoClass = dtoClass;
    }

//    public BaseMapper(Class<E> entityClass, Class<D> dtoClass) {
//        this.entityClass = entityClass;
//        this.dtoClass = dtoClass;
//    }


    public E toEntity(D dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, entityClass);
    }

    public D toDto(E entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, dtoClass);
    }
}
