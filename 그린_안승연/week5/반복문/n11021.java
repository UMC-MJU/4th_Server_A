package 그린_안승연.week5.반복문;

import java.util.Scanner;

public class n11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sum = new int[n];
        int a, b;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum[i] = a + b;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i + 1) + ": " + sum[i]);
        }

        sc.close();
    }
}
