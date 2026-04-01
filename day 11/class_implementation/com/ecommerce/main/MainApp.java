package com.ecommerce.main;
import java.util.*;
import com.ecommerce.model.Product;
import com.ecommerce.service.CarService;
import com.ecommerce.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of products : ");
        int n=sc.nextInt();
        CarService cart=new CarService();
        for(int i=0;i<n;i++){
            
        }
        // Product p1= new Product(1,"iphone",DiscountUtil.applyDiscount(170000));
        // Product p2= new Product(2,"redmi",DiscountUtil.applyDiscount(17000));
        // cart.addProduct(p1);
        // cart.addProduct(p2);
        cart.showCart();
        int totalAmount=cart.calculateTotal();
        System.out.println("Total amount: $"+totalAmount);
    }
}
