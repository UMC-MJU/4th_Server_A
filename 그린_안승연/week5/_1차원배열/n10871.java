package 그린_안승연.week5._1차원배열;

import java.util.Scanner;

public class n10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numArr[i] < x) {
                System.out.print(numArr[i] + " ");
            }
        }
    }
}
