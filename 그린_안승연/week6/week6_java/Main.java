package 그린_안승연.week6.week6_java;

public class Main {
    public static void main(String[] args) {

        //1번
        Student student = new Student("안승연", 60202422, "데테");
        student.printInfo();

        //2번
        for (int i = 1; i <= 10; i++) {
            if (isEven(i)) System.out.println(i);
        }
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0) ? true : false;
    }
}
