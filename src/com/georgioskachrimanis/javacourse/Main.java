package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        int sum = 0, counter = 0;

        for (int i = 1; i <= 1000; i++) {

            if (commonDivide(i)) {
                sum += i;
                counter++;
                System.out.println("Number " + i + "is divided by 3 and by 5.");
            }

            if (counter == 5) {
                break;
            }
        }

        System.out.println("The total sum of the numbers is " + sum);


    }

    public static boolean commonDivide(int number) {
        if (number < 0 || number > 1001) {
            return false;
        }
        return (number % 3 == 0) && (number % 5 == 0);
    }
}

