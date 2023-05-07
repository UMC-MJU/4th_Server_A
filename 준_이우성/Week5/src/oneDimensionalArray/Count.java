package oneDimensionalArray;

import java.util.Scanner;
//10807
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) arr[i] = scanner.nextInt();
        int find = scanner.nextInt();
        scanner.close();
        int count = 0;
        for(int i = 0; i < num; i++) {
            if(arr[i]==find) count++;
        }
        System.out.println(count);
    }
}
