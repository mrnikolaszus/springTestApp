package com.nickzoos.springtestapp.repository;

import com.nickzoos.springtestapp.model.Equipment;
import com.nickzoos.springtestapp.model.Order;
import com.nickzoos.springtestapp.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends BaseRepository<Order> {

    Page<Order> findOrderByDateOfOrderBetween(LocalDate startDate,
                                                 LocalDate endDate,
                                                 Pageable pageable);

    Integer countOrderByEquipment(Equipment equipment, Pageable pageable);

    List<Order> findOrderByEquipmentAndUser(Equipment equipment, User user);
}
