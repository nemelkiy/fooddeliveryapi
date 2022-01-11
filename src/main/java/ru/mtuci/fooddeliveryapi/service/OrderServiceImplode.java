package ru.mtuci.fooddeliveryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.fooddeliveryapi.dao.OrderRepo;
import ru.mtuci.fooddeliveryapi.model.OrderInfo;

import java.util.List;

@Service
public class OrderServiceImplode implements OrderService{
    private final OrderRepo orderRepo;

    @Autowired
    public OrderServiceImplode(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public OrderInfo get(Long id) {
        return orderRepo.findById(id).orElse(null);
    }

    @Override
    public List<OrderInfo> getAll() {
        return orderRepo.findAll();
    }

    @Override
    public OrderInfo save(OrderInfo orderInfo) {
        return orderRepo.save(orderInfo);
    }

    @Override
    public OrderInfo update(OrderInfo orderInfo, OrderInfo updatedOrderInfo) {
        orderInfo.setName(updatedOrderInfo.getName());
        orderInfo.setEmail(updatedOrderInfo.getEmail());
        orderInfo.setPhone(updatedOrderInfo.getPhone());
        orderInfo.setCity(updatedOrderInfo.getCity());
        orderInfo.setStreet(updatedOrderInfo.getStreet());
        orderInfo.setHome(updatedOrderInfo.getHome());
        orderInfo.setFlat(updatedOrderInfo.getFlat());
        orderInfo.setFloor(updatedOrderInfo.getFloor());

        return orderRepo.save(orderInfo);
    }

    @Override
    public void delete(Long id) {
        orderRepo.deleteById(id);
    }
}
