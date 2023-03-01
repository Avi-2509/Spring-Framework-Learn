package com.springcore.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Samosa(){
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Initializing-------");
    }
    public void destroy(){
        System.out.println("Destroying------");
    }
}
