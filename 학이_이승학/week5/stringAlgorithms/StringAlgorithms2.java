package 학이_이승학.week5.stringAlgorithms;

import java.util.Scanner;

public class StringAlgorithms2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < t; i++) {
            java.lang.String s = sc.next(); // 문자열 입력
            char first = s.charAt(0); // 첫 글자
            char last = s.charAt(s.length() - 1); // 마지막 글자
            System.out.println(first + "" + last);
        }
        sc.close();
    }
}
