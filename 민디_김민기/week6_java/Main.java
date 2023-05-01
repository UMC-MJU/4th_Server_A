package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1번문제
        Student student = new Student(202201, "홍길동", "컴퓨터공학과");
        student.printInfo();

        // 2번문제
        for (int i = 1; i <= 10; i++) {
            if (EvenOdd.isEven(i)) {
                System.out.println(i + " is even.");
            }
        }

        // 3번문제
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        try {
            int result = num / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
