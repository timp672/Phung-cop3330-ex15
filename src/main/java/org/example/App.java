/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("What is the password? ");
        String password = scan.nextLine();

        //processing
        if(password.equals("abc$123"))
        {
            System.out.println("Welcome!");

        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
