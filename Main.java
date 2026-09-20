import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Number Analyzer");
        System.out.println("--------------------------------");
        double sum = 0;
        double count = 0;
        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;
        int zero = 0;
        double largest = 0;
        double smallest = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            double x = in.nextDouble();
            if (i == 0) {
                largest = x;
                smallest = x;
            }
            if (x > 0) {
                System.out.print(x + " = " + "Positive");
                ++pos;
            } else if (x < 0) {
                System.out.print(x + " = " + "Negative");
                ++neg;
            } else {
                System.out.print(x + " = " + "Zero");
                ++zero;
            }
            if (x % 2 == 0) {
                System.out.println(" / Even");
                ++even;
            } else {
                System.out.println(" / Odd");
                ++odd;
            }
            if (x > largest) {
                largest = x;
            }
            if (x < smallest) {
                smallest = x;
            }
            sum += x;
            ++count;
        }
        System.out.println("--------------------------------");
        System.out.println("Analyzer");
        System.out.println("--------------------------------");
        System.out.println("sum = " + sum);
        System.out.println("Average = " + (sum/count));
        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);
        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);
        System.out.println("Positive Count = " + pos);
        System.out.println("Negative Count = " + neg);
        System.out.println("Zero Count = " + zero);
    }
}