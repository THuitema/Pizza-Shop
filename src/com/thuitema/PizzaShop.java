package com.thuitema;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaShop {
    // Fields
    private String name;
    private double cheeseCost;
    private double pepperoniCost;
    private double sausageCost;
    private double veggieCost;
    private Pizza[] pizzas;

    Scanner scanner = new Scanner(System.in);

    // Non-default constructor
    public PizzaShop(String name, double cheeseCost, double pepperoniCost, double sausageCost, double veggieCost) {
        this.name = name;
        this.cheeseCost = cheeseCost;
        this.pepperoniCost = pepperoniCost;
        this.sausageCost = sausageCost;
        this.veggieCost = veggieCost;
        createPizzas();
    }

    // Creates Pizza objects, amount determined by user, adds each new object to pizzas array
    private void createPizzas() {
        System.out.print("How many pizzas would you like to create? ");
        int count = scanner.nextInt();
        pizzas = new Pizza[count];

        // Pizza object creation loop
        for (int i = 0; i < count; i++) {
            System.out.println("Pizza " + (i + 1) + ":"); // Add 1 to i to start at 1 instead of 0
            pizzas[i] = new Pizza();
            pizzas[i].calcCost(cheeseCost, pepperoniCost, sausageCost, veggieCost);
            System.out.println();
        }
    }

    // toString method
    public String toString() {
        String pizzaDetails = "";

        // Gets name of each Pizza object and puts it in pizzaNames String
        for (int i = 0; i < pizzas.length; i++) {
            pizzaDetails += "\n" + pizzas[i];
        }

        return "Pizza Shop Name: " + name + "\n"
                + "Cheese Cost: " + cheeseCost + "\n"
                + "Pepperoni Cost: " + pepperoniCost + "\n"
                + "Sausage Cost: " + sausageCost + "\n"
                + "Veggie Cost: " + veggieCost + "\n"
                + pizzaDetails + "\n";
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCheeseCost() {
        return cheeseCost;
    }

    public void setCheeseCost(double cheeseCost) {
        this.cheeseCost = cheeseCost;
    }

    public double getPepperoniCost() {
        return pepperoniCost;
    }

    public void setPepperoniCost(double pepperoniCost) {
        this.pepperoniCost = pepperoniCost;
    }

    public double getSausageCost() {
        return sausageCost;
    }

    public void setSausageCost(double sausageCost) {
        this.sausageCost = sausageCost;
    }

    public double getVeggieCost() {
        return veggieCost;
    }

    public void setVeggieCost(double veggieCost) {
        this.veggieCost = veggieCost;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }
}
