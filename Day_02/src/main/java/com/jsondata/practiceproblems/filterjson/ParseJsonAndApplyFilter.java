/*Parse JSON and filter only those records where age > 25.*/
package com.jsondata.practiceproblems.filterjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class ParseJsonAndApplyFilter {
    public static void main(String[] args) {
        try{
            // creating objectmaper to read json
            ObjectMapper objmapper = new ObjectMapper();
            // storing the object in json to list
            List<PersonData> data= objmapper.readValue(new File("src/main/java/com/jsondata/practiceproblems/filterjson/data.json"),new TypeReference<List<PersonData>>(){});


            // filtered data
            for(PersonData pdata : data){
                if(pdata.getAge()>25){
//                    System.out.println(pdata.getName());
//                    System.out.println(pdata.getAge());
//                    System.out.println(pdata.getEmail());
//                    System.out.println(pdata.getSubjects());

                    System.out.println(pdata);

                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
