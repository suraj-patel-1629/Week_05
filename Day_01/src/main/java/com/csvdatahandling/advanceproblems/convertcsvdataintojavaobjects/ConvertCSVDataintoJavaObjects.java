/*9️⃣ Convert CSV Data into Java Objects
Read a CSV file and convert each row into a Student Java object.
Store the objects in a List<Student> and print them.*/
package com.csvdatahandling.advanceproblems.convertcsvdataintojavaobjects;

import java.util.List;


public class ConvertCSVDataintoJavaObjects {
    public static void main(String[] args){
        // File path
        String filePath = "src/main/java/com/csvdatahandling/advanceproblems/convertcsvdataintojavaobjects/studentrecord.csv";
        // converting CSV to Java Objects and method calling
        List<Student> students = ConvertingCSVDataintoJavaObjects.convertCSVDataintoJavaObjects(filePath);
        // Output
        System.out.println(students);
    }
}
