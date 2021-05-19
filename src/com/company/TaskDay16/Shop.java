package com.company.TaskDay15;

import java.util.Scanner;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    int priceForProduct;
    double shopBalance;

    public Shop(String name, String address, int countOfProduct, int priceForProduct, double shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }
    int calculateOrder(){
        return priceForProduct = countOfProduct * priceForProduct;
    }
    void addToShopBalance(){
        shopBalance = priceForProduct;
    }
    void checkOrder(int n){
        if (countOfProduct == n){
            System.out.println("If you want to buy it, Please press 1 , if you don’t want to buy it press any bottom");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if(input == 1){
                System.out.println("Success count of products");
                System.out.println(calculateOrder());
            }else {
                 System.out.println("Now we don’t have so much product,sorry");
            }
        }
    }

}
