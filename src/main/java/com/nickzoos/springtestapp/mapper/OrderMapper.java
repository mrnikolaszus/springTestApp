package com.nickzoos.springtestapp.mapper;

import com.nickzoos.springtestapp.dto.OrderDTO;
import com.nickzoos.springtestapp.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper extends BaseMapper<Order, OrderDTO> {

    @Autowired
    public OrderMapper() {
        super(Order.class, OrderDTO.class);
    }

     @Override
    public OrderDTO toDto(Order entity) {
        OrderDTO orderDTO = super.toDto(entity);
        orderDTO.setEquipmentId(entity.getEquipment().getId());
        orderDTO.setUserId(entity.getUser().getId());
        return orderDTO;
    }
}
