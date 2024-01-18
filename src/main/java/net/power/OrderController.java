package net.power;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")

public class OrderController {
    private final OrderService orderService;
    public OrderController (OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public void addOrder (@RequestParam("id") int id) {
        orderService.addOrder(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> getOrder() {
        return orderService.getOrder();
    }
}
