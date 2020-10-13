package com.company;

public class Main {
        public static void main(String[] args) 
        {
            printTheResultOfCalculation();
        }
        public static void printTheResultOfCalculation() {
            System.out.println(calculateTheFirstResult());
            System.out.println(calculateTheSecondResult());
            System.out.println();
        }
        public static double calculateTheFirstResult() {
            double sum = 0;
            for (int i = 1; i < 51; i++)
                sum += 1.0 / (i * i * i);
                {
                    return sum;
                }
        }
        public static double calculateTheSecondResult() {
            double sum = 0;
            for (int i = 2; i < 129; i += 2)
                sum += 1.0 / (i * i);
                {
                    return sum;
                }
        }
    }
