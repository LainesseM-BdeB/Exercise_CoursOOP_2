package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

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

    public static void ex10() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        int answer = 0;
        do {
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
        System.out.println(answer / numsL);
    }
}
