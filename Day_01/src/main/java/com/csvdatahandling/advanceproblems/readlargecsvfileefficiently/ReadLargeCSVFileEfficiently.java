/*1️⃣1️⃣ Read Large CSV File Efficiently
Given a large CSV file (500MB+), implement a memory-efficient way to read it in chunks.
Process only 100 lines at a time and display the count of records processed.
*/
package com.csvdatahandling.advanceproblems.readlargecsvfileefficiently;

//import static com.csvdatahandling.advancedproblems.readlargecsvfileefficiently.ReadingLargeCSVFileEfficiently.readLargeCSVFile;

public class ReadLargeCSVFileEfficiently {
    public static void main(String[] args) {
        // File path
        String filePath = "src/main/java/com/csvdatahandling/advanceproblems/readlargecsvfileefficiently/customers-100.csv";
        // Process 100 lines at a time
        int batchSize = 100;
        //Method calling
        ReadingLargeCSVFileEfficiently.readLargeCSVFile(filePath, batchSize);
    }
}
