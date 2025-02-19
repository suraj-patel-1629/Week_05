package com.jsondata.practiceproblems.listofobjecttojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;
import java.util.List;

public class ListOfObjectToJsonArray {
    public static void main(String[] args) {
        // creating the object and storing in the list
        Student s1 = new Student(101,"suraj","suraj@gmail.com");
        Student s2 = new Student(102,"Pratham","pratham@gmail.com");
        Student s3 = new Student(103,"vivek","vivek@gmail.com");
        Student s4 = new Student(104,"Tikesh","Tikesh@gmail.com");
        List<Student> studentData= new ArrayList<>();
        studentData.add(s1);
        studentData.add(s2);
        studentData.add(s3);
        studentData.add(s4);

        try{
            // it is used to convert object to json
            ObjectMapper obj = new ObjectMapper();
            // writerWithDefaultPrettyPrinter method is used to make our json format more readable
            String jsonString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(studentData);
            System.out.println(jsonString);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
