package com.jsondata.practiceproblems.readjsonfile;

import java.util.List;

class Student {
    public String name;
    public String email;
    public int age;
    public List<String> subjects;

    // Default constructor (needed for Jackson)
    public Student() {}

    // toString() to print Student details
    @Override
    public String toString() {
        return "StudentDetail { " +
                "Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Age=" + age +
                ", Subjects=" + subjects +
                " }";
    }
}