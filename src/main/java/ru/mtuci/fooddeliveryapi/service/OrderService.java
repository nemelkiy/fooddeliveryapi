package ru.mtuci.fooddeliveryapi.service;

import ru.mtuci.fooddeliveryapi.model.OrderInfo;

import java.util.List;

public interface OrderService {
    OrderInfo get(Long id);
    List<OrderInfo> getAll();
    OrderInfo save(OrderInfo orderInfo);
    OrderInfo update(OrderInfo orderInfo, OrderInfo updatedOrderInfo);
    void delete(Long id);
}
