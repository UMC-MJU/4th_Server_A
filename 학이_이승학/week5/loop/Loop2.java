package 학이_이승학.week5.loop;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

        sc.close();
    }
}
