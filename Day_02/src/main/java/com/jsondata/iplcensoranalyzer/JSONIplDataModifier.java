package com.jsondata.iplcensoranalyzer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JSONIplDataModifier {
    public static void byUisngJackson(String inputFile,String  outputFile){
        ObjectMapper objMapper = new ObjectMapper();
        try{
            List<IplMatch> matchList = objMapper.readValue(new File(inputFile),new TypeReference<>(){});
            List<IplMatch>matchListAfterCensor=new ArrayList<>();
            for(IplMatch match : matchList){

                match.setPlayer_of_match("REDACTED");
                String team1= match.getTeam1();

                String team1Arr[] =team1.split(" ");
                String updatedTeam1="";
                for(int i =0;i<team1Arr.length;i++){
                    if(i==0){
                        updatedTeam1 += team1Arr[0]+" ";

                    }else{
                        updatedTeam1+="***"+" ";
                    }
                }
                match.setTeam1(updatedTeam1);


                String team2= match.getTeam2();
                String team2Arr[] =team2.split(" ");
                String updatedTeam2="";
                for(int i =0;i<team2Arr.length;i++){
                    if(i==0){
                        updatedTeam2 += team2Arr[0]+" ";

                    }else{
                        updatedTeam2+="***"+" ";
                    }
                }
                match.setTeam2(updatedTeam2);
                matchListAfterCensor.add(match);

            }
            objMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objMapper.writeValue(new File(outputFile),matchListAfterCensor);
            System.out.println("Json updated");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
