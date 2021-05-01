package com.company;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("JAVA-REACT","ENGİN DEMİROĞ");
        Course course2 = new Course("C# OOP","ENGİN DEMİROĞ");
        Course[] courses = {course1,course2};

        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        Instructor instructor1 = new Instructor(1,"Engin","Demiroğ",courses);
        Student student1 = new Student(1,"Kürşat","Varlı","11/12/2000");

        instructorManager.displayDetails(instructor1);
        instructorManager.addCourse(instructor1 , new Course("WEB DESIGN","ENGİN DEMİROĞ")
        );

        studentManager.displayDetails(student1);
        studentManager.addCourse(student1,new Course("C++ Course","ENGİN DEMİROĞ"));


    }
}
