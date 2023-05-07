package loop;

import java.util.Scanner;
//8393
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(num*(num+1)/2);
    }
}
