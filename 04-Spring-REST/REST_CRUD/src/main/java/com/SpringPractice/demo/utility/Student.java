package com.SpringPractice.demo.utility;

public class Student {
    private String First_name;
    private String Last_Name;

    public Student(){};

    public Student(String first_name, String last_Name) {
        First_name = first_name;
        Last_Name = last_Name;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }
}
