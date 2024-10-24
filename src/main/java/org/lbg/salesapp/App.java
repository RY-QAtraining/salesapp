package org.lbg.salesapp;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner costInput = new Scanner(System.in);
        System.out.println("Enter the cost of your item: ");
        double cost =costInput.nextDouble();

        Scanner vatInput = new Scanner(System.in);
        System.out.println("Enter the VAT rate of this item: ");
        double vat = costInput.nextDouble();

        double res = finalCost (cost,vat);
        System.out.println("The final cost of your item is:"+ res);
    }

    public static double finalCost(double c, double v){
        return c*v/100+c;
    }
}
