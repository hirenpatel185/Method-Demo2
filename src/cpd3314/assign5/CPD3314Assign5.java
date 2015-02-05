/* 
 * Copyright 2015 Mark Russell <mark.russell@lambtoncollege.ca>. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */
package cpd3314.assign5;

import java.util.Scanner;

/**
 *
 * @author <HIRENKUMAR PATEL>
 */
public class CPD3314Assign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: This is a sandbox. 

        /* Modify it and use it to call whatever methods below you want to run.
         * 
         * To be clear: Your task is to create methods. All of the automated
         * tests in CPD3314Assign5Test.java are based on the methods described
         * below. So for example, in Ex#2, you must build the calculateRetail
         * method. The automated tests will tell you if you built it correctly.
         *
         */
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Retail Price Calculator.\n"
                    + "2 Test Celsius.\n"
                    + "3.Distance\n"
                    + "4.Test Prime\n"
                    + "5.Test Even\n"
                    + "0.exit");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double wholeSaleCost,markupPerc;
                    System.out.println("Enter Speed of a Vehicle (in miles-per-hour):");
                    wholeSaleCost = sc.nextDouble();
                    System.out.println("Enter the number of hours it has traveled:");
                    markupPerc = sc.nextDouble();
                    System.out.println("Retail price :" + calculateRetail(wholeSaleCost, markupPerc));
                    break;
                case 2:

                    for (double i = 0; i <= 20; i++) {
                        System.out.println("Celsius equivalent for fahrenhait " + i + " is " + celsius(i));
                    }
                    break;
                case 3:

                    double speedOfVehicle,
                     noOfHourTravel,
                     distance;

                    System.out.println("Enter Speed of a Vehicle (in miles-per-hour):");
                    speedOfVehicle = sc.nextDouble();
                    System.out.println("Enter the number of hours it has traveled:");
                    noOfHourTravel = sc.nextDouble();

                    if (speedOfVehicle < 0) {
                        System.out.println("Please enter valid Speed..");
                    } else if (noOfHourTravel < 1) {
                        System.out.println("Please enter hour greater than 1.");
                    } else {
                        System.out.println("Hour    Distance Traveled");
                        System.out.println("-------------------------");
                        for (double i = 1; i <= noOfHourTravel; i++) {
                            distance = distance(speedOfVehicle, i);
                            System.out.println(" " + i + "               " + distance);

                        }
                    }
                    break;
                case 4:
                    int number1;
                    boolean isPrime;
                    System.out.println("Enter one Number :");
                    number1 = sc.nextInt();
                    isPrime = isPrime(number1);
                    if (isPrime == true) {
                        System.out.println("Number is Prime");
                    } else {
                        System.out.println("Number is not Prime. ");
                    }
                    break;
                case 5:
                    int number2;
                    boolean isEven;
                    System.out.println("Enter one Number :");
                    number2 = sc.nextInt();
                    isEven = isEven(number2);
                    if (isEven == true) {
                        System.out.println("Number is Even");
                    } else {
                        System.out.println("Number is not Even. ");
                    }
                    break;
                default:
                    break;

            }
        } while (choice != 0);

    }

    /*
     * Exercise #2 - Retail Price Calculator
     * 
     * Write a program that asks the user to enter an item's wholesale cost and 
     * its markup percentage. It should then display the item's retail price. 
     * For example:
     *   - If an item's wholesale cost is 5.00 and its markup percentage is 100 
     *       percent, then the item's retail price is 10.00.
     *   - If an item's wholesale cost is 5.00 and its markup percentage is 50 
     *       percent, then the item's retail price is 7.50.
     * The program should reference a method named calculateRetail that receives 
     * the wholesale cost and the markup percentage as arguments, and returns 
     * the retail price of the item.
     * - Gaddis pg. 316
     */
    // TODO: Build the calculateRetail method here
    /**
     * @param args the command line arguments
     */
    public static double calculateRetail(double wholeSaleCost, double markupPerc) {
        // TODO: Complete the rest of Exercise #2 here to test calculateRetail

        return wholeSaleCost + (wholeSaleCost * markupPerc / 100);

    }

    /**
     * Exercise #6 - Celsius Temperature Table
     *
     * The formula for converting a temperature from Fahrenheit to Celsius is C
     * = (5.0/9.0) * (F - 32) Where F is the Fahrenheit temperature and C is the
     * Celsius temperature. Write a method named celsius that accepts a
     * Fahrenheit temperature as an argument. The method should return the
     * temperature, converted to Celsius. Demonstrate the method by calling it
     * in a loop that displays a table of the Fahrenheit temperatures 0 through
     * 20 and their Celsius equivalents.
     */
    // TODO: Build the celsius method here
    public static double celsius(double fahrenheit) {
        // TODO: Complete the rest of Exercise #6 here to test celsius
        return (5.0 / 9.0) * (fahrenheit - 32);

    }

    /*
     * Exercise #9 - Distance Traveled Modification
     * 
     * The distance a vehicle travels can be calculated as follows:
     *   Distance = Speed * Time
     * Write a method named distance that accepts a vehicle's speed and time as 
     * arguments, and returns the distance the vehicle has traveled. Modify the 
     * "Distance Traveled" program you wrote in Assignment #4 to use this 
     * method.
     * - Gaddis pg. 319
     */
    // TODO: Build the distance method here
    public static double distance(double speed, double time) {
        // TODO: Build the rest of exercise #9 here to test the distance method
        return speed * time;
    }

    /*
     * Exercise #13 - isPrime Method
     * 
     * A prime number is a number that is evenly divisible only by itself and 1. 
     * For example, the number 5 is prime because it can be evenly divided only 
     * by 1 and 5. The number 6, however, is not prime because it can be divided 
     * evenly by 1, 2, 3, and 6.
     * Write a method named isPrime, which takes an integer as an argument and 
     * returns true if the argument is a prime number, or false otherwise.
     * - Gaddis pg. 320
     */
    // TODO: Build the isPrime method here
    public static boolean isPrime(int number) {
        // TODO: Build a sample program to test the isPrime method here
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                flag = false;
            }
        }
        return flag;

    }

    /*
     * Exercise #15 - Even/Odd Counter
     * 
     * You can use the following logic to determine if a number is even or odd:
     *   if ((number % 2) == 0) {
     *     // The number is even
     *   }
     *   else {
     *     // The number is odd
     *   }
     * Write a program method named isEven that accepts an int argument. The 
     * method should return true if the argument is even, or false otherwise.
     */
    // TODO: Build the isEven method here
    public static boolean isEven(int number) {
        // TODO: Build a sample program to test the isEven method here
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
