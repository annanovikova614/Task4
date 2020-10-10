package com.company;
import java. util.Scanner;

 class Main {
     public static void main(String[] args) {
        printCalc();
    }
    public static void printCalc() {
        System.out.println(calc1());
        System.out.println(calc2());
        System.out.println(); 
    }
    public static double calc1() {
        double sum = 0;
        for (int i = 1; i < 51; i++)
            sum += 1.0 / (i * i * i);
        return sum;
    }
    public static double calc2() {
        double sum = 0;
        for (int i = 2; i < 129; i += 2)
            sum += 1.0 / (i * i);
        return sum;
    }
}
