package com.company;

public class Main {
        public static void main(String[] args)
        {
            printTheResultOfCalculation();
        }

        public static void printTheResultOfCalculation() {
            double sum1 = calculateTheFirstResult();
            double sum2 = calculateTheSecondResult();
            System.out.println("Результат первого вычисления = " + sum1);
            System.out.println("Результат второго вычисления = " + sum2);
            System.out.println();
        }

        public static double calculateTheFirstResult() {
            double sum1 = 0;
            for (int i = 1; i < 51; i++)
                sum1 += 1.0 / (i * i * i);
                {
                    return sum1;
                }
        }

        public static double calculateTheSecondResult() {
            double sum2 = 0;
            for (int i = 2; i < 129; i += 2)
                sum2 += 1.0 / (i * i);
                {
                    return sum2;
                }
        }
    }

