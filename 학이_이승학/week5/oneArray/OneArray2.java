package 학이_이승학.week5.oneArray;

import java.util.Scanner;

public class OneArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = 1000001;
        int max = -1000001;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println(min + " " + max);
    }
}
