package 학이_이승학.week5.If;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= -10000 && a <= 10000 && b >= -10000 && b <= 10000) {
            if(a > b) {
                System.out.println(">");
            } else if(a < b) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        }

        sc.close();
    }
}
