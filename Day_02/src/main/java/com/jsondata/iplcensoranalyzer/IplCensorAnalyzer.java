/*Problem Statement: IPL and Censor Analyzer
Objective:
Develop a Java application that reads IPL match data from JSON and CSV files,
processes the data based on defined censorship rules,
and writes the sanitized data back to new files.*/
package com.jsondata.iplcensoranalyzer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IplCensorAnalyzer {

    public static void main(String[] args) {
        String jsonInputFile= "src/main/java/com/jsondata/iplcensoranalyzer/IplJsondata.json";
        String jsonOutputFile="src/main/java/com/jsondata/iplcensoranalyzer/OutputIplJsonData.json";

        JSONIplDataModifier.byUisngJackson(jsonInputFile,jsonOutputFile);

        String csvInputFile = "src/main/java/com/jsondata/iplcensoranalyzer/IplCsvData.csv";
        String csvOutputFile="src/main/java/com/jsondata/iplcensoranalyzer/OutputCsvData.csv";
        CSVIplDataModifier.byUsingCsv(csvInputFile,csvOutputFile);

    }

}
