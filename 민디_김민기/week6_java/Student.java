package com.company;

public class Student {
  int studentId;
  String studentName;
  String major;

  public Student(int studentIdx, String studentName, String major) {
    this.studentId = studentIdx;
    this.studentName = studentName;
    this.major = major;
  }

  public void printInfo() {
    System.out.println("Name: " + studentName);
    System.out.println("Student ID: " + studentId);
    System.out.println("Major: " + major);
  }
}

