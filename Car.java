package com.company;

import java.util.*;

public class Car {
    private int id;
    private String mark;
    private String model;
    private String color;
    private int year;
    private double price;
    private int reg_numb;


    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getReg_numb() {
        return reg_numb;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setReg_numb(int reg_numb) {
        this.reg_numb = reg_numb;
    }

    @Override
    public String toString() {
        return "\n Значення полів об'єкта: " + this.id + " " + this.mark + " " + this.model + " " + this.color + " " + this.year + " " + this.price + " " + this.reg_numb;
    }


    public static void carsByMark(Car[] array) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть марку авто: ");
        String m = in.nextLine();

        for (int i = 0; i < 5; i++) {
            if (array[i].mark.equals(m)) {
                System.out.println("car" + ": " + array[i]);
            }
        }

    }


}

