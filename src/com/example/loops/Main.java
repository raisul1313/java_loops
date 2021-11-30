package com.example.loops;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("hello");
//        }
//
//        System.out.println(" ");
//        int a = 5;
//        for (int i = 0; i < a; i++) {
//            System.out.println("hello");
//        }
//
//        System.out.println(" ");
//        int b = 5;
//        for (int i = 0; i < b; i++) {
//            System.out.println(i);
//        }

//        System.out.println(" ");
//        int c = 6;
//        while (c < 10) {
//            System.out.println("Hello");
//            c++;
//        }
//
//        System.out.println(" ");
//        int d = 6;
//        while (d < 10) {
//            System.out.println("Hello");
//            break;
//        }

//        System.out.println(" ");
//        int e = 5;
//        while (e < 10) {
//            e++;
//            if (e == 8) {
//                continue;
//            }
//            System.out.println("Hello");
//        }

//        System.out.println(" ");
//        int f = 7;
//        do {
//            System.out.println("hello");
//        } while (f < 5);

//        System.out.print("Please Enter a Number: " );
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("User Input: " + answer);
//
//        System.out.print("Please Enter your Name: " );
//        String name = scanner.next();
//        System.out.println("Hello, " + name);

        Random random = new Random();
        int number = random.nextInt();
        int number1 = random.nextInt(20);
        int number2 = random.nextInt(20) + 1;
        System.out.println("Number: " + number);
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

    }
}
