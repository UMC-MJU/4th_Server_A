package 그린_안승연.week5._1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        String v = br.readLine();

        int count = 0;

        for (String s : nums)
            if (s.equals(v)) count++;

        System.out.println(count);
    }
}
