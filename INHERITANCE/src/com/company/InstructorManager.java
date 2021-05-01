package com.company;

public class InstructorManager extends UserManager{

    public void displayDetails(Instructor instructor){
        System.out.println(
                "Instructor Name: "+ instructor.get_userName() + " " + instructor.get_userLastName() +
                        "\n"+"The Courses Student is taking: " + instructor.getCourses()
        );
    }


    public void addCourse(Instructor instructor , Course course){
        int n = instructor.getCourses().length;
        instructor.getCourses()[n+1]=course;
    }

}
