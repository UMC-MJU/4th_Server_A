public class Student {
    String name;
    int studentID;
    String major;

    public Student(String name, int studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Major: " + major);
    }
}
