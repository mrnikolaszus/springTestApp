package com.nickzoos.springtestapp.service.impl;

import com.nickzoos.springtestapp.exception.EntityNotFoundException;
import com.nickzoos.springtestapp.exception.SaveEntityException;
import com.nickzoos.springtestapp.model.BaseEntity;
import com.nickzoos.springtestapp.repository.BaseRepository;
import com.nickzoos.springtestapp.service.CrudService;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public abstract class CrudServiceImpl<E extends BaseEntity, R extends BaseRepository<E>>
    implements CrudService<E> {

    final R repository;
    final Class<E> genericType;

    protected CrudServiceImpl(R repository, Class<E> genericType) {
        this.repository = repository;
        this.genericType = genericType;
    }

    @Override
    public E save(E e) {
        try {
            var save = this.repository.save(e);
            log.info(this.genericType.getSimpleName() + " save, id: " + e.getId());
            return save;
        } catch (Exception ex){
            log.error(this.genericType.getSimpleName() + " wasn't save, id: " +
                    e.getId());
            throw new SaveEntityException(this.genericType.getSimpleName());
        }
    }

    @Override
    public E getById(Integer id) {
        Optional<E> entity = this.repository.findById(id);
        if(entity.isPresent()){
            log.info(this.genericType.getSimpleName() + " get, id: " + id);
            return entity.get();
        }
        log.error(this.genericType.getSimpleName() + " no entity with id: " + id);
        throw new EntityNotFoundException(id, this.genericType.getSimpleName());
    }

    @Override
    public void delete(Integer id) {
        try {
            this.repository.deleteById(id);
            log.info(this.genericType.getSimpleName() + " deleted entity with id: " + id);
        } catch (Exception ex) {
            log.error(this.genericType.getSimpleName() + " no entity with id: " + id);
            throw new EntityNotFoundException(id, this.genericType.getSimpleName());
        }
    }

    @Override
    public E update(Integer id, E e) {
        try{
            this.repository.findById(id).ifPresent(a -> save(e));
            log.info(e + " updated");
            return e;
        } catch (Exception ex){
            log.error(e + " error in updating");
            throw new SaveEntityException(this.genericType.getSimpleName());
        }
    }
}
