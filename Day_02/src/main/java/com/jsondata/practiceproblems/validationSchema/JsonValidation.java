package com.jsondata.practiceproblems.validationSchema;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;


public class JsonValidation {
    public static void main(String[] args) throws IOException, ProcessingException {

            ObjectMapper objmapper = new ObjectMapper();
            // loading the schema according to what we have to validate
            JsonNode schema = objmapper.readTree(new File("src/main/java/com/jsondata/practiceproblems/validationSchema/Schema.json"));
            JsonSchema schemaValidator = JsonSchemaFactory.byDefault().getJsonSchema(schema);
            // loading our json file
            JsonNode data = objmapper.readTree(new File("src/main/java/com/jsondata/practiceproblems/validationSchema/Data.json"));

            // validating the json with our provided schema
            if(schemaValidator.validate(data).isSuccess()){
                System.out.println("json data is accurate");
            }else{
                System.out.println("json is not accurate");
            }
    }
}
