package conditionalStatement;

import java.util.Scanner;
//9498
public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
        if(i >= 90) System.out.println("A");
        else if(i >= 80) System.out.println("B");
        else if (i >= 70) System.out.println("C");
        else if(i >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
