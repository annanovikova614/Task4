package com.company;

public class Main {

    public static void main(String[] args) {
        double sum1 = calculateTheFirstResult();
        double sum2 = calculateTheSecondResult();
        calculateTheFirstResult();
        calculateTheSecondResult();
        printResultsOfCalculation(sum1,sum2);
    }

    private static void printResultsOfCalculation(double sum1, double sum2) {
        System.out.printf("Результат первого вычисления %.3f", sum1);
        System.out.println();
        System.out.printf("Результат второго вычисления %.3f", sum2);
    }

    public static double calculateTheFirstResult() {
        double sum1 = 0;
            for (int i = 1; i < 51; i++) {
                sum1 += 1.0 / (i * i * i);
            }
        return sum1;
    }

    public static double calculateTheSecondResult() {
        double sum2 = 0;
            for (int i = 2; i < 129; i += 2) {
                sum2 += 1.0 / (i * i);
            }
        return sum2;
    }
}
