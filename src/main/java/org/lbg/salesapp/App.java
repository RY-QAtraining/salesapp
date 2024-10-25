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

    public void run(){
        double[] costs = new double[1];
        int counter = 1;
        Scanner userInput = new Scanner(System.in);

        while (true)
        {
            //vat
            System.out.println("Enter the VAT rate of this item: ");
            double vat = userInput.nextDouble();

            while (true)
            {
                double cost = readUser(userInput);
                if (cost == 0)
                    break;
                else {
                    if (counter >= costs.length)
                        costs = Arrays.copyOf(costs, costs.length + 1);

                    costs[counter] = cost;
                    counter++;
                }
            }
            Arrays.sort(costs);
            System.out.println(Arrays.toString(costs));
            double total = finalCost(costs,vat);
            System.out.println("The total cost of all your items are: "+total);


            System.out.println("To perform another calculation, press enter; else type QUIT to exit: ");
            String user = userInput.nextLine();
            if (user.equalsIgnoreCase("quit"))
                break;
        }
    }

    public static double finalCost(double[] costs, double v){
        double total = 0;
        for (double c: costs){
            total += (c+c*v/100);
        }
        return total;
    }

    public boolean prompt(){
        System.out.println("Enter the cost of your item: ");
        return true;
    }

    public boolean promptQuit(){
        System.out.println("To perform another calculation, press enter; else type QUIT to exit: ");
        return true;
    }

    public double readUser(Scanner scanner){
        prompt();
        return scanner.nextDouble();

    }
}
