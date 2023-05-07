package string;

import java.util.Scanner;
//27866
public class LetterAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.next().split("");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(arr[n-1]);
    }
}
