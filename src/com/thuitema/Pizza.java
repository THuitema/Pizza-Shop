package com.thuitema;

import java.util.Scanner;

public class Pizza {
    private String name;
    private double smallCost;
    private double mediumCost;
    private double largeCost;

    // Topping fields
    private int cheeseCount;
    private int pepperoniCount;
    private int sausageCount;
    private int veggieCount;
    private final double CHEESE_COST = 1.5;

    Scanner scanner = new Scanner(System.in);

    public Pizza() {
        System.out.print("Enter pizza name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter cheese count: ");
        this.cheeseCount = scanner.nextInt();

        System.out.print("Enter pepperoni count: ");
        this.pepperoniCount = scanner.nextInt();

        System.out.print("Enter sausage count: ");
        this.sausageCount = scanner.nextInt();

        System.out.print("Enter veggie count: ");
        this.veggieCount = scanner.nextInt();
    }

    // Calculates price for each size: small, medium, and large
    public void calcCost(double cheeseCost, double pepperoniCost, double sausageCost, double veggieCost) {
        double base = (cheeseCount * cheeseCost + pepperoniCount * pepperoniCost + sausageCount * sausageCost + veggieCount * veggieCost) * 2;

        largeCost = base + 10;
        mediumCost = base + 8;
        smallCost = base + 6;
    }

    // toString method
    public String toString() {
        return "Pizza name: " + name + "\n"
                + "  Small Cost: $" + smallCost + "\n"
                + "  Medium Cost: $" + mediumCost + "\n"
                + "  Large Cost: $" + largeCost + "\n"
                + "  # of cheese: " + cheeseCount + "\n"
                + "  # of pepperoni: " + pepperoniCount + "\n"
                + "  # of sausage: " + sausageCount + "\n"
                + "  # of veggies: " + veggieCount + "\n";
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSmallCost() {
        return smallCost;
    }

    public void setSmallCost(double smallCost) {
        this.smallCost = smallCost;
    }

    public double getMediumCost() {
        return mediumCost;
    }

    public void setMediumCost(double mediumCost) {
        this.mediumCost = mediumCost;
    }

    public double getLargeCost() {
        return largeCost;
    }

    public void setLargeCost(double largeCost) {
        this.largeCost = largeCost;
    }

    public int getCheeseCount() {
        return cheeseCount;
    }

    public void setCheeseCount(int cheeseCount) {
        this.cheeseCount = cheeseCount;
    }

    public int getPepperoniCount() {
        return pepperoniCount;
    }

    public void setPepperoniCount(int pepperoniCount) {
        this.pepperoniCount = pepperoniCount;
    }

    public int getSausageCount() {
        return sausageCount;
    }

    public void setSausageCount(int sausageCount) {
        this.sausageCount = sausageCount;
    }

    public int getVeggieCount() {
        return veggieCount;
    }

    public void setVeggieCount(int veggieCount) {
        this.veggieCount = veggieCount;
    }
}
