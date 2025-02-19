/*Create a JSON object for a Student with fields: name, age, and subjects (array).*/
package com.jsondata.practiceproblems.createjsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        //creating the objrct
        JSONObject obj= new JSONObject();
        //putting the key value in the object
        obj.put("name","Suraj Patel");
        obj.put("age",22);
        // creating the array of subjects
        JSONArray objArr = new JSONArray();
        objArr.put("Maths").put("English").put("Hindi");
        // putting the array in object as key subjects
        obj.put("Subjects",objArr);
        System.out.println(obj.toString(4));
    }
}
