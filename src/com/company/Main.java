package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object obj = new Exercise();
        Scanner inputR = new Scanner(System.in);
        String exBaseName = "ex";
        String exNum;
        int exNumInt;
        String yn;
        String[] exDesc = {
                "Exercise #1 - Print an input",
                "Exercise #2 - Print from two input",
                "Exercise #3 - Printing a multiplication table up to 10",
                "Exercise #4 - Print the inverse of the numbers between -3 and 3",
                "Exercise #5 - Print the square of all the numbers between 0 and 10",
                "Exercise #6 - Echo an input until the user write a specific string",
                "Exercise #7 - Read integers until the user input 0 and then prints the Maximum",
                "Exercise #8 - Read integers until the user input 0 and then prints the Minimum",
                "Exercise #9 - Read integers until the user input 0 and then prints the Sum",
                "Exercise #10 - Read integers until the user input 0 and then prints the Average",
                "Exercise #11 - Prints a random number selected from 3 specified ranges",
                "Exercise #12 - Selects two random numbers but one must absolutely be the double of the other",
                "Exercise #13 - The user needs to guess a random number between 1 and 10",
                "Exercise #14 - Calculates the formula ax^2 + bx + c with a, b, c being selected by the user and x being chosen randomly",
                "Exercise #15 - The user selects a month and a year and it prints the number of days in that month",
                "Exercise #16 - Prints the number of times the character a user inputs is present in a fixed string",
                "Exercise #17 - Prints the Sum of all the positive integers up to the user's input",
                "Exercise #18 - Prints the Product of all the positive integers up to the user's input",
                "Exercise #19 - Prints the Factorial of the positive integer from the user's input",
                "Exercise #20 - Prints the Combinations of the two positive integers from the user's input"
        };
        int nbMethods = obj.getClass().getDeclaredMethods().length;
        do {
            for (int i = 0; i < nbMethods; i++) {
                System.out.println(exDesc[i]);
            }
            System.out.printf("Which exercise do you want to try? (1 to %d)\nType Exit to quit\n", nbMethods);
            exNum = inputR.nextLine().strip().toLowerCase();
            if (!(exNum.equals("exit"))) {
                try {
                    exNumInt = Integer.parseInt(exNum);
                } catch (Exception e) {
                    System.out.println("Please write a number.");
                    exNumInt = 0;
                }
                if (!(exNumInt > nbMethods) && !(exNumInt < 1)) {
                    System.out.println(exDesc[exNumInt - 1]);
                    System.out.println("Do you want to proceed with this exercise? (Y/N)");
                    yn = inputR.nextLine().strip().toLowerCase();
                    if (yn.equals("y")) {
                        System.out.println("Loading the exercise. Enjoy!");
                        obj.getClass().getMethod(exBaseName + exNum).invoke(obj);
                        System.out.println("Press enter to continue.");
                        inputR.nextLine();
                    } else {
                        System.out.println("Going back to the main menu.");
                    }
                } else {
                    System.out.println("Please select a number that is within the appropriate range.");
                }
            }
        } while (!(exNum.equals("exit")));
    }
}
