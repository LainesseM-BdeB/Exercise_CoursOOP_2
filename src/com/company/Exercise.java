package com.company;

import java.util.*;

import org.apache.commons.math3.util.ArithmeticUtils;

public class Exercise {

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name?");
        name = scanner.next();
        System.out.println("Hey, " + name + "!\nNice to meet you.");
    }

    public static void ex2() {
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
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Please enter an Integer to get a multiplication table up to 10.");
        num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, i * num);
        }
    }

    public static void ex4() {
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
        for (int i = 0; i <= 10; i++) {
            System.out.println(i*i);
        }
    }

    public static void ex6() {
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
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = 0;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            System.out.println("The input was: " + num);
            if (num == 0) {
                System.out.println("EXIT!");
                break;
            } else if (num < 0) {
                System.out.println("Please enter an integer above 0.");
            } else if (num > answer) {
                answer = num;
            }
        } while(true);
        System.out.println(answer);
    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = Integer.MAX_VALUE;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            System.out.println("The input was: " + num);
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Please enter an integer above 0.");
            } else if (num < answer) {
                answer = num;
            }
        } while(true);
        System.out.println(answer);
    }

    public static void ex9() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = 0;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            System.out.println("The input was: " + num);
            if (num == 0) {
                break;
            } else {
                nums.add(num);
            }
        } while(true);
        for (int n : nums) {
            answer += n;
        }
        System.out.println(answer);
    }

    public static void ex10() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = 0;
        do {
            System.out.println("Please enter a positive a interger.\n(Enter 0 to exit.)");
            num = scanner.nextInt();
            System.out.println("The input was: " + num);
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
        System.out.println(answer / numsL);
    }

    public static void ex11() {
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
        Random rgen = new Random();
        int num;
        int numx2;
        num = rgen.nextInt(0, 51);
        numx2 = num * 2;
        System.out.println("The random number is: " + num + "\nThe random number times 2 is: " + numx2);
    }

    public static void ex13() {
        Random rgen = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = rgen.nextInt(11);
        int num;
        do {
            System.out.println("Please guess a number between 0 and 10.");
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
        System.out.println("The answer to the equation ax^2 + bx + c is: " + answer);
    }

    public static void ex15() {
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
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Please input a positive integer:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum was: " + sum);
    }

    public static void ex18() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int prod = 1;
        System.out.println("Please input a positive integer:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            prod *= i;
        }
        System.out.println("The product of all interger was: " + prod);
    }

    public static void ex19() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int fac;
        System.out.println("Please input a positive integer:");
        num = scanner.nextInt();
        fac = (int)ArithmeticUtils.factorial(num);
        System.out.println("The factorial was: " + fac);
    }

}
