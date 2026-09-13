package ru.maxim.lambda_agregation;

import java.util.List;

public class Lambda_Agregation {

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Alice", "Moscow", 1500.0, true,  List.of("Book", "Pen")),
                new Order("Bob",   "SPb",    3200.0, false, List.of("Laptop")),
                new Order("Alice", "Moscow", 800.0,  true,  List.of("Notebook")),
                new Order("Carol", "Kazan",  5000.0, true,  List.of("Phone", "Case", "Charger")),
                new Order("Bob",   "SPb",    1200.0, true,  List.of("Mouse")),
                new Order("Dave",  "Moscow", 250.0,  false, List.of("Pen", "Pencil"))
        );

        double result = totalDeliveredAmount(orders);

        System.out.println("Сумма доставленных заказов: " + result);
    }

    public static double totalDeliveredAmount(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.isDelivered())
                .mapToDouble(order -> order.getAmount())
                .sum();
    }
}
