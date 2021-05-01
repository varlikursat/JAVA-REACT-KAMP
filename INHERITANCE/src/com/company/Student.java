package com.company;

import java.util.List;

public class Student extends User{
    private String birthday;

    private Course[] courses;


    public Student(int userId, String userName, String userLastName , String birthday) {
        super(userId, userName, userLastName);
        this.birthday=birthday;
    }

    public void setCourses(Course[] courses){
        this.courses=courses;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public Course[] getCourses(){
        return courses;
    }
}
