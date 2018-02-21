package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("AN ARRAY OF INTEGERS IS FORMED!");
        System.out.print("Enter the element number of the array: ");
        int number = input.nextInt();
        if (number > size) {
            System.out.println("ERROR! Element with number " + number + " does not exist!");
        } else {
            System.out.println("Element number " + number + " was increased by 10% and equals " + array[number - 1] * 1.1 + ".");
        }
    }
}
