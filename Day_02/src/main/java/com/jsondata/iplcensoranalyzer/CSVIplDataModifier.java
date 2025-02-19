package com.jsondata.iplcensoranalyzer;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVIplDataModifier {
    public static void byUsingCsv(String inputFile, String outputFile) {

        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            List<String []> match = new ArrayList<>();
            String [] data=reader.readNext();
            while((data=reader.readNext())!=null) {
                String team1 = data[1];
                String team1Arr[] = team1.split(" ");
                String updatedTeam1 = "";
                for (int i = 0; i < team1Arr.length; i++) {
                    if (i == 0) {
                        updatedTeam1 += team1Arr[0] + " ";

                    } else {
                        updatedTeam1 += "***" + " ";
                    }

                }
                data[1]=updatedTeam1;

                String team2 = data[2];
                String team2Arr[] = team2.split(" ");
                String updatedTeam2 = "";
                for (int i = 0; i < team2Arr.length; i++) {
                    if (i == 0) {
                        updatedTeam2 += team2Arr[0] + " ";

                    } else {
                        updatedTeam2 += "***" + " ";
                    }

                }
                data[2]=updatedTeam2;

                data[data.length-1]="REDACTED";

                match.add(data);
            }

            writer.writeAll(match);

            System.out.println("CSV updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
