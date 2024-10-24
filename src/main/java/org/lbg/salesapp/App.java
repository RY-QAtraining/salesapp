package org.lbg.salesapp;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner vatInput = new Scanner(System.in);
            System.out.println("Enter the VAT rate of this item: ");
            double vat = vatInput.nextDouble();

            double total =0;
            while (true) {
                Scanner costInput = new Scanner(System.in);
                System.out.println("Enter the cost of your item: ");
                double cost = costInput.nextDouble();
                if (cost == 0)
                    break;
                else total += cost;

            }

            double res = finalCost(total, vat);
            System.out.println("The final cost of your item is:" + res);

            System.out.println("To perform another calculation, press enter; else type QUIT to exit: ");
            Scanner userInput = new Scanner(System.in);
            String user = userInput.nextLine();
            if ("quit".equalsIgnoreCase(user)){
                break;
            }
        }
    }

    public static double finalCost(double c, double v){
        return c*v/100+c;
    }
}
