package 그린_안승연.week5._2차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if (paper[j][k] == 0) {
                        paper[j][k] = 1;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
