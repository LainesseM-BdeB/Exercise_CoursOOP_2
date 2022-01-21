package com.company;

import java.util.*;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class Exercise {

    public static void ex1() {
        System.out.println("\n\nExercise #1 - Print an input");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name?");
        name = scanner.next();
        System.out.println("Hey, " + name + "!\nNice to meet you.");
    }

    public static void ex2() {
        System.out.println("\n\nExercise #2 - Print from two input");
        Scanner scanner = new Scanner(System.in);
        String name;
        String m;
        String[] mArr = {"Madamn", "Mister"};
        do {
            System.out.println("Are you a Mister or a Madamn?");
            m = scanner.nextLine();
        } while (!(Arrays.asList(mArr).contains(m)));
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.printf("Welcome %s %s\n", m, name);
    }

    public static void ex3() {
        System.out.println("\n\nExercise #3 - Printing a multiplication table up to 10");
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Please enter an Integer to get a multiplication table up to 10.");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, i * num);
        }
    }

    public static void ex4() {
        System.out.println("\n\nExercise #4 - Print the inverse of the numbers between -3 and 3");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = -3;
        while (true) {
            if (num <= 3) {
                System.out.println(num * -1);
                num++;
                continue;
            } else {
                break;
            }
        }
    }

    public static void ex5() {
        System.out.println("\n\nExercise #5 - Print the square of all the numbers between 0 and 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i*i);
        }
    }

    public static void ex6() {
        System.out.println("\n\nExercise #6 - Echo an input until the user write a specific string");
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Write anything and I'll say it back.\n(Write 'End' to stop me.)");
            answer = scanner.nextLine();
            if (answer.equals("End")) {
                break;
            } else {
                System.out.println(answer);
            }
        } while (true);
    }

    public static void ex7() {
        System.out.println("\n\nExercise #7 - Read integers until the user input 0 and then prints the Maximum");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = 0;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Please enter an integer above 0.");
            } else if (num > answer) {
                answer = num;
            }
        } while(true);
        System.out.println("The maximum was: " + answer);
    }

    public static void ex8() {
        System.out.println("\n\nExercise #8 - Read integers until the user input 0 and then prints the Minimum");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = Integer.MAX_VALUE;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Please enter an integer above 0.");
            } else if (num < answer) {
                answer = num;
            }
        } while(true);
        System.out.println("The minimum was: " + answer);
    }

    public static void ex9() {
        System.out.println("\n\nExercise #9 - Read integers until the user input 0 and then prints the Sum");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = 0;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                nums.add(num);
            }
        } while(true);
        for (int n : nums) {
            answer += n;
        }
        System.out.println("The sum was: " + answer);
    }

    public static void ex10() {
        System.out.println("\n\nExercise #10 - Read integers until the user input 0 and then prints the Average");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        double answer = 0;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                nums.add(num);
            }
        } while(true);
        for (int n : nums) {
           answer += n;
        }
        int numsL = nums.size();
        System.out.println("The average was: " + answer / numsL);
    }

    public static void ex11() {
        System.out.println("\n\nExercise #11 - Prints a random number selected from 3 specified ranges");
        Random rGen = new Random();
        int num;
        num = rGen.nextInt(0, 51);
        System.out.println("The random number between 0 and 50 is: " + num);
        num = rGen.nextInt(11, 26);
        System.out.println("The random number between 11 and 25 is: " + num);
        num = rGen.nextInt(-10, 26);
        System.out.println("The random number between -10 and 25 is: " + num);
    }

    public static void ex12() {
        System.out.println("\n\nExercise #12 - Selects two random numbers but one must absolutely be the double of the other");
        Random rgen = new Random();
        int num;
        int num2;
        int rMin = 1;
        int rMax = 51;
        do {
            num = rgen.nextInt(rMin, rMax);
        } while (num % 2 == 1);
        if (num > 25) {
            rMax = 26;
            do {
                num2 = rgen.nextInt(rMin, rMax);
            } while (num / num2 != 2);
        } else {
            rMin = 25;
            do {
                num2 = rgen.nextInt(rMin, rMax);
            } while (num2 / num != 2);
        }
        System.out.println("The random numbers are: " + num + " and " + num2);
    }

    public static void ex13() {
        System.out.println("\n\nExercise #13 - The user needs to guess a random number between 1 and 10");
        Random rgen = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = rgen.nextInt(1, 11);
        int num;
        do {
            System.out.println("Please guess a number between 1 and 10.");
            num = scanner.nextInt();
            if (num == secret) {
                System.out.println("YOU WON!");
                break;
            } else if (num < secret) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        } while (true);
    }

    public static void ex14() {
        System.out.println("\n\nExercise #14 - Calculates the formula ax^2 + bx + c with a, b, c being selected by the user and x being chosen randomly");
        Random rGen = new Random();
        Scanner scanner = new Scanner(System.in);
        HashMap varMap = new HashMap<String, Integer>();
        String[] varArr = {"a", "b", "c"};
        int x = rGen.nextInt(101);
        int answer;
        varMap.put("x", x);
        for (String v : Arrays.asList(varArr)) {
            System.out.println("Please enter a value for the variable -> " + v);
            varMap.put(v, scanner.nextInt());
        }
        System.out.println(varMap);
        int a = (int)varMap.get("a");
        int b = (int)varMap.get("b");
        int c = (int)varMap.get("c");
        answer = (int)(Math.pow((a * x), 2) + (b * x) + c);
        System.out.printf("The answer to the equation %dx^2 + %dx + %d is: %s\n", a, b, c, answer);
    }

    public static void ex15() {
        System.out.println("\n\nExercise #15 - The user selects a month and a year and it prints the number of days in that month");
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;
        int days;
        HashMap<String, int[]> monthMap = new HashMap<String, int[]>();
        monthMap.put("January", new int[] {31});
        monthMap.put("February", new int[] {28, 29});
        monthMap.put("March", new int[] {31});
        monthMap.put("April", new int[] {30});
        monthMap.put("May", new int[] {31});
        monthMap.put("June", new int[] {30});
        monthMap.put("July", new int[] {31});
        monthMap.put("August", new int[] {30});
        monthMap.put("October", new int[] {31});
        monthMap.put("November", new int[] {30});
        monthMap.put("December", new int[] {31});
        System.out.println("Please input a month's name: ");
        month = scanner.nextLine().strip();
        System.out.println("Please input a year: ");
        year = scanner.nextInt();
        if (month.equals("February")) {
            if (year % 4 == 0 && !(year % 100 == 0)) {
                days = monthMap.get(month)[1];
            } else if (year % 400 == 0) {
                days = monthMap.get(month)[1];
            } else {
                days = monthMap.get(month)[0];
            }
        } else {
            days = monthMap.get(month)[0];
        }
        System.out.printf("The month of %s in the year %s has %d days.\n", month, year, days);
    }

    public static void ex16() {
        System.out.println("\n\nExercise #16 - Prints the number of times the character a user inputs is present in a fixed string");
        Scanner scanner = new Scanner(System.in);
        String longString = "The lazy fox jumps over the brown dog.";
        String cIn;
        int num;
        System.out.println("Please write a single character: ");
        cIn = scanner.next().strip().toLowerCase();
        num = longString.length() - longString.toLowerCase().replace(cIn, "").length();
        System.out.printf("The letter %s was present %d times in the sentence:\n%s\n", cIn, num, longString);
    }

    public static void ex17() {
        System.out.println("\n\nExercise #17 - Prints the Sum of all the positive integers up to the user's input");
        Scanner scanner = new Scanner(System.in);
        int num;
        double sum = 0;
        System.out.println("Please input a positive integer:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum was: " + sum);
    }

    public static void ex18() {
        System.out.println("\n\nExercise #18 - Prints the Product of all the positive integers up to the user's input");
        Scanner scanner = new Scanner(System.in);
        int num;
        double prod = 1;
        System.out.println("Please input a positive integer:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            prod *= i;
        }
        System.out.println("The product of all interger was: " + prod);
    }

    public static void ex19() {
        System.out.println("\n\nExercise #19 - Prints the Factorial of the positive integer from the user's input");
        Scanner scanner = new Scanner(System.in);
        int num;
        double fac;
        System.out.println("Please input a positive integer:");
        num = scanner.nextInt();
        fac = (int) CombinatoricsUtils.factorial(num);
        System.out.println("The factorial was: " + fac);
    }

    public static void ex20() {
        System.out.println("\n\nExercise #20 - Prints the Combinations of the two positive integers from the user's input");
        Scanner scanner = new Scanner(System.in);
        int numA;
        int numB;
        double facA;
        double facB;
        double facAminB;
        double answer;
        System.out.println("Please input a positive integer:");
        numA = scanner.nextInt();
        facA = CombinatoricsUtils.factorialDouble(numA);
        do {
            System.out.println("Please input a second positive integer that is smaller than " + numA);
            numB = scanner.nextInt();
        } while (numA < numB);
        facB = CombinatoricsUtils.factorialDouble(numB);
        facAminB = CombinatoricsUtils.factorialDouble(numA - numB);
        answer = facA/(facB * facAminB);
        System.out.println("The combination of your first number with the second one is:\n" + answer);
    }

}
