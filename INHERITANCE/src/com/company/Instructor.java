package com.company;

public class Instructor extends User{
    private Course[] courses;

    public Instructor(int userId, String userName, String userLastName,Course[] courses) {
        super(userId, userName, userLastName);
        this.courses=courses;
    }

    public Course[] getCourses() {
        return courses;
    }
}
