package com.nickzoos.springtestapp.service;

import com.nickzoos.springtestapp.model.BaseEntity;

public interface CrudService <E extends BaseEntity> {

    E getById(Integer id);
    E save (E e);

    void delete(Integer id);
    E update(Integer id, E entity);
}
