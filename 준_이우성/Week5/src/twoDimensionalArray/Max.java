package twoDimensionalArray;

import java.util.Scanner;

//2566
public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int max = 0;
        int x = 0, y = 0;
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                arr[i][j] = scanner.nextInt();
                if (max < arr[i][j]){
                    max = arr[i][j];
                    x = i; y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((x + 1) + " " + (y + 1));
    }
}
