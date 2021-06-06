/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How many people? ");
        String totalPeopleS = in.nextLine();
        int totalPeopleI = Integer.parseInt(totalPeopleS);

        Scanner in2 = new Scanner(System.in);
        System.out.print("How many pizzas do you have? ");
        String totalPizzaS = in2.nextLine();
        int totalPizzaI = Integer.parseInt(totalPizzaS);

        Scanner in3 = new Scanner(System.in);
        System.out.print("How many slices per pizza? ");
        String pizzaSlicesS = in3.nextLine();
        int pizzaSlicesI = Integer.parseInt(pizzaSlicesS);

        int totalSlices = totalPizzaI * pizzaSlicesI;


        String outputString = totalPeopleS + " people with " + totalPizzaS + " pizzas (" + totalSlices + " slices)";
        System.out.println(outputString);

        int slicesPerson = totalSlices / totalPeopleI;
        int leftover = totalSlices % totalPizzaI;

        String outputString2 = "Each person gets " + slicesPerson + " pieces of pizza.\nThere are " + leftover + " leftover pieces.";
        System.out.println(outputString2);
    }
}