package com.company;

public class StudentManager extends UserManager{

    public void displayDetails(Student student){
        System.out.println(
                "Student Name: "+ student.get_userName() + " " + student.get_userLastName() +
                "\n"+"Student Birthday: "+ student.getBirthday() +
                "\n"+"The Courses Student is taking: " + student.getCourses()
        );
    }


    public void addCourse(Student student , Course course){
        int n = student.getCourses().length;
        student.getCourses()[n+1]=course;

    }

}
