/*🔟 Merge Two CSV Files
You have two CSV files:
students1.csv (contains ID, Name, Age)
students2.csv (contains ID, Marks, Grade)
Merge both files based on ID and create a new file containing all details.*/
package com.csvdatahandling.advanceproblems.mergetwocsvfiles;

//import static com.csvdatahandling.advancedproblems.mergetwocsvfiles.MergingTwoCSVFiles.mergingTwoCSVFiles;

public class MergeTwoCSVFiles {
    public static void main(String[] args){
        // File path
        String filePath1 = "src/main/java/com/csvdatahandling/advanceproblems/mergetwocsvfiles/students1.csv";
        String filePath2 = "src/main/java/com/csvdatahandling/advanceproblems/mergetwocsvfiles/students2.csv";
        String outputFile = "src/main/java/com/csvdatahandling/advanceproblems/mergetwocsvfiles/studentfinalfile.csv";

        // Calling method
        MergingTwoCSVFiles.mergingTwoCSVFiles(filePath1, filePath2, outputFile);
    }
}