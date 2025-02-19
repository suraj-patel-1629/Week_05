/*Merge two JSON objects into one.*/
package com.jsondata.practiceproblems.merging;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

public class MergingTwoJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        //creating the objrct
        JSONObject obj1= new JSONObject();
        //putting the key value in the object
        obj1.put("name","Suraj Patel");
        obj1.put("age",22);
        // creating the array of subjects
        JSONArray objArr = new JSONArray();
        objArr.put("Maths").put("English").put("Hindi");
        obj1.put("subjects",objArr);


        //creating the objrct
        JSONObject obj2= new JSONObject();
        //putting the key value in the object
        obj2.put("Email","suraj@gmail.com");
        obj2.put("DOB","30-06-2005");



        obj2.keySet().forEach(key->obj1.put(key,obj2.get(key)));

        System.out.println(obj1.toString(5));





    }
}
