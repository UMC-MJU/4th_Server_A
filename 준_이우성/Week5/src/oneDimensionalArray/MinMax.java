package oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

//10818
public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n - 1]);
    }
}
