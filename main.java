package com.firstproject.hiworld;

import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the class you'd like to be enrolled in: ");
        System.out.println("1. Java 101");
        System.out.println("2. Python 101");
        System.out.println("3. C# 101");

        int choice = input.nextInt();

        while (choice < 1 || choice > 3){
            JOptionPane.showMessageDialog(null, "No! Enter a number 1-3 Goddammit!!");
            choice = input.nextInt();
        }

            switch (choice) {

                case 1:
                    System.out.println("You've chosen Java 101.");
                    System.out.println("You have been enrolled in your course. Goodbye.");
                    break;

                case 2:
                    System.out.println("You've chosen Python 101.");
                    System.out.println("You have been enrolled in your course. Goodbye.");
                    break;

                case 3:
                    System.out.println("You've chosen C# 101.");
                    System.out.println("You have been enrolled in your course. Goodbye.");
                    break;

                default:
                    System.out.println("Enter a number 1 - 3.");
                    break;
            }
        input.close();
    }

}
