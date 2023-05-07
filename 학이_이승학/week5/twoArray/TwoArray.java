package 학이_이승학.week5.twoArray;

import java.util.Scanner;

public class TwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // 행렬 A 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // 행렬 B 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // 행렬 A와 B를 더한 결과를 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
