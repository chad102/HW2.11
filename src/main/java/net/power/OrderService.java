package net.power;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope

public class OrderService {
    private final OrderService orderService;
    public OrderService(OrderService orderService) {
        this.orderService = orderService;
    }
    private final List<Integer> ids = new ArrayList<>();

    public void addOrder(int id) {
        ids.add(id);
    }

    public List<Integer> getOrder() {
        return ids;
    }
}
