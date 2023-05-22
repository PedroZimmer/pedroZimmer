package Aula152.entities;

public class OrderItem {

    private Integer quantity;

    private Double price;


    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Double subTotal(Integer quantity, Double price) {
        return quantity * price;
    }


    }

}
