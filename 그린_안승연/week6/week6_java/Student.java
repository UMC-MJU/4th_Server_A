package 그린_안승연.week6.week6_java;

public class Student {
    private String name;
    private int studentID;
    private String major;

    public Student(String name, int studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String getMajor() {
        return this.major;
    }

    public void printInfo() {
        System.out.println("이름 : " + name + ", 학번 : " + studentID + ", 전공 : " + major);
    }

}
