package 그린_안승연.week5.반복문;

import java.util.Scanner;

public class n25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        long sum = 0L;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            sum += price * num;
        }

        if (sum == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
