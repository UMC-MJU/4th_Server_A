package conditionalStatement;

import java.util.Scanner;
//1330
public class CompareTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        scanner.close();
        if(i > j) System.out.println(">");
        else if(i < j) System.out.println("<");
        else System.out.println("==");
    }
}
