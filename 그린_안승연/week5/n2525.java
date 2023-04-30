package 그린_안승연.week5;

import java.util.Scanner;

public class n2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int charge = sc.nextInt();
        
        int time = minute + charge;

        while (time >= 60) {
            time -= 60;
            hour++;

            if (hour >= 24) hour -= 24;
        }

        System.out.println(hour + " " + time);

    }
}
