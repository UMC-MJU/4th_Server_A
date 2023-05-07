package string;

import java.util.Scanner;
//2743
public class MeasureWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextLine().length();
        scanner.close();
        System.out.println(n);
    }
}
