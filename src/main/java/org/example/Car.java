package org.example;

public class Car implements Comparable<Car> {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}
