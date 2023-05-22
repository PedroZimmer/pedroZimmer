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

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(moment);
        sb.append("\nOrder status: ");
        sb.append(status);
        sb.append("\nClient: ");
        sb.append(client);
        sb.append("\nOrder items: \n");
        for (OrderItem item : orderItems) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
