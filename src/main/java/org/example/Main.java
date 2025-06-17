package org.example;
import java.util.*;

class Product {
    long productId;
    String name;
    double price;

    public Product(long productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}

class Order {
    long orderId;
    long productId;
    int quantity;

    public Order(long orderId, long productId, int quantity) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
    }
}

class OrderSummary {
    long orderId;
    String productName;
    double pricePerUnit;
    int quantity;
    double totalPrice;

    public OrderSummary(long orderId, String productName, double pricePerUnit, int quantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        this.totalPrice = pricePerUnit * quantity;
    }

    @Override
    public String toString() {
        return "OrderSummary{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(101, "Wireless Mouse", 25.99),
                new Product(102, "Mechanical Keyboard", 59.99),
                new Product(103, "HD Monitor", 199.99),
                new Product(104, "USB-C Hub", 35.50)
        );

        List<Order> orders = List.of(
                new Order(5001, 101, 2),
                new Order(5002, 102, 1),
                new Order(5003, 103, 3),
                new Order(5004, 105, 1) // Invalid productId
        );

        /* write code to print order summary */

    }
}

