package 학이_이승학.week5.loop;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }

        sc.close();
    }
}
