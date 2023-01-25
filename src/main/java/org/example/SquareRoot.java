package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    double number, numberSquare;

    public SquareRoot() throws InputMismatchException, IllegalArgumentException{
        System.out.println("Enter the number you want to square: ");
        try {
            Scanner scanner = new Scanner(System.in);
            this.number = scanner.nextInt();
            if (number < 0) {throw new IllegalArgumentException("Number cannot be negative!");}
            numberSquare = Math.sqrt(number);
            System.out.println(numberSquare);
        } catch (InputMismatchException e) {
            System.out.println("There have to be positive number!");
        } catch (IllegalArgumentException e) {
            System.out.println("Number cannot be negative!");
        }
    }
}
