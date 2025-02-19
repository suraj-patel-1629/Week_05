package com.jsondata.practiceproblems.readjsonfile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadingJson {
    public static void main(String[] args) {
        // file path
        String filePath ="src/main/java/com/jsondata/practiceproblems/readjsonfile/student.json";
        try{
            // creating the object of ObjectMapper to read the json
            ObjectMapper objMapper = new ObjectMapper();
            List<Student> students = objMapper.readValue(new File(filePath), new TypeReference<List<Student>>() {
            });
            for(Student stu : students){
                System.out.println(stu);
            }


        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
