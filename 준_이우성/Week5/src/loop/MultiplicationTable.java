package loop;

import java.util.Scanner;
//2793
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        for(int i = 1; i < 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
