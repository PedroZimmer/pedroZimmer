package Aula152.entities;

import Aula146.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;

    private OrderStatus status;

    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();


    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }


    public void removeItems(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {

        double sum = 0.0;

        for (OrderItem item : orderItems) {
            sum += item.subTotal();
        }

        return sum;
    }

}
