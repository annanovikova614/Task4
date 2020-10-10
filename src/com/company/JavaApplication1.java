package com.company;
import java. util.Scanner;

 class Main {

    public static void main(String[] args) {
        printCalc();
    }
    public static void printCalc(){
        System.out.println(calc1());
        System.out.println(calc2());
        System.out.println(); //Выводим на экран перевод строк
    }
    public static double calc1() {
        double sum = 0;
        for (int i = 1; i < 51; i++)//перебераем числа от 1 до 50
            sum += 1.0 / (i * i * i);//добавляем в сумму слагаемое 1, 1/2^3, 1/3^3 ...
        return sum;
    }
    public static double calc2() {
        double sum = 0;
        for (int i = 2; i < 129; i += 2)//перебераем числа от 2 до 128 с шагом 2
            sum += 1.0 / (i * i);//добавляем в сумму слагаемое 1/2^2, 1/4^2, 1/6^2 ...
        return sum;
    }
}