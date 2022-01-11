package ru.mtuci.fooddeliveryapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.fooddeliveryapi.model.OrderInfo;
import ru.mtuci.fooddeliveryapi.service.OrderService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = OrderController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    public static final String REST_URL = "api/v1/order";

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //Take product by Id
    @GetMapping(value = "/{id}")
    public OrderInfo get(@PathVariable("id") Long id) {
        log.info("get" + id);
        return orderService.get(id);
    }
    //Take all Id
    @GetMapping
    public List<OrderInfo> getAll() {
        log.info("getAllId");
        return orderService.getAll();
    }
    //Insert new raw in DB
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderInfo save(@RequestBody OrderInfo orderInfo) {
        log.info("New product saved");
        return orderService.save(orderInfo);
    }
    //Delete by Id
    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        log.info("delete " + id);
        orderService.delete(id);
    }
    //Product update by id
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderInfo update(@PathVariable("id") Long id, @RequestBody OrderInfo orderInfo) {
        log.info("updated " + orderInfo);
        OrderInfo oldOrder = orderService.get(id);
        if (oldOrder != null) {
            return orderService.update(oldOrder, orderInfo);
        } else {
            return null;
        }
    }
}
