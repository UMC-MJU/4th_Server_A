package 그린_안승연.week6.week6_java;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            System.out.println(n / 10);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
