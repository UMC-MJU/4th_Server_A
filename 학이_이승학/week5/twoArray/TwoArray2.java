package 학이_이승학.week5.twoArray;

import java.util.Scanner;

public class TwoArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);

        sc.close();
    }

}

