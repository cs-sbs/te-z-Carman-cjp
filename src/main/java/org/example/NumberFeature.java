package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int result = 0;
        int position = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == position % 2) {
                result += position;
            }
            num /= 10;
            position *= 2;
        }

        System.out.println(result);
    }
}
