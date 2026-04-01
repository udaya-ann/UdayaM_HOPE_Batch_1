package com.ecommerce.model;

public class Product {
    private int id;
    private String name;
    private int price;
    public Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    public void display(){
        System.out.println("ID: "+this.id+" Name: "+this.name+" Price: "+this.price+"$");
    }
}
