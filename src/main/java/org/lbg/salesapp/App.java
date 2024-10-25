package org.lbg.salesapp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public static void run(){
        double[] costs = new double[0];
        int counter = 0;

        while (true)
        {
            //vat
            Scanner vatInput = new Scanner(System.in);
            System.out.println("Enter the VAT rate of this item: ");
            double vat = vatInput.nextDouble();

            while (true)
            {
                Scanner costInput = new Scanner(System.in);
                System.out.println("Enter the cost of your item: ");
                double cost = costInput.nextDouble();
                if (cost == 0)
                    break;
                else {
                    if (counter >= costs.length)
                        costs = Arrays.copyOf(costs, costs.length + 1);

                    costs[counter] = finalCost(cost, vat);
                    counter++;
                }
            }
            Arrays.sort(costs);
            System.out.println(Arrays.toString(costs));


            System.out.println("To perform another calculation, press enter; else type QUIT to exit: ");
            Scanner userInput = new Scanner(System.in);
            String user = userInput.nextLine();
            if ("quit".equalsIgnoreCase(user)) {
                break;
            }
        }
    }

    public static double finalCost(double c, double v){
        return c*v/100+c;
    }
}
