package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices {
    @Autowired
    OrdersRepository orderrepos;

    @Transactional
    // anytime you are saving, transactional
    @Override public Order save(Order order)
    {
        return orderrepos.save(order);
    }

    @Override
    public Order findOrderById(long ordnum) {
        return orderrepos.findById(ordnum)
        .orElseThrow(() -> new EntityNotFoundException("Order #" + ordnum + " not found!"));
    }
}
