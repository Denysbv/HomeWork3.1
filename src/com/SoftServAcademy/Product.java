package com.SoftServAcademy;

import java.util.Objects;

public class Product {
    public String name;
    public int price;
    public int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void mostExpensive (Product... p) {
        int topPrice = 0;
        for (Product product : p) {
            if (topPrice < product.getPrice()) {
                topPrice = product.getPrice();
            }
        } System.out.println(topPrice);
        for (Product product : p) {
            if (product.getPrice() == topPrice) {
                System.out.println("Most expensive product is " + product.getName() +
                        "\nCurrently " + product.getQuantity() + " items available");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0;
    }
}
