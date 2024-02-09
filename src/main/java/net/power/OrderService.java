package net.power;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope

public class OrderService {
    public OrderService(OrderService orderService) {
    }
    private final List<Integer> ids = new ArrayList<Integer>();

    public void addOrder(List<Integer> id) {
        ids.addAll(id);
    }

    public List<Integer> getOrder() {
        return ids;
    }
}
