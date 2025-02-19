package com.jsondata.practiceproblems.objecttojson;

public class Car {
  private  String name;
   private double price ;
   private int model;

    public Car(String name, double price, int model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
