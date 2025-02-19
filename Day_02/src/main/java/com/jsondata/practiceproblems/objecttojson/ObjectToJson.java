/* Convert a Java object (Car) into JSON format.*/
package com.jsondata.practiceproblems.objecttojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
    public static void main(String[] args) {
        // create the object of car
        Car c1 = new Car("Scorpio",1500000.0,2019);
        try{
            // for conversion of java object to json creating objectMapper object
        ObjectMapper objectMapper= new ObjectMapper();
        // converting the Object to string
        String strObject = objectMapper.writeValueAsString(c1);
            System.out.println(strObject);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }

    }
}
