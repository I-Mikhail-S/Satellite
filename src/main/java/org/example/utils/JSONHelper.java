package org.example.utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JSONHelper {
    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public JSONHelper() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(jsonString, Person.class);

        System.out.println("My fio: " + person.firstName + " " + person.lastName + " and my friends are: ");
        for (Person friend : person.friends) {
            System.out.print(friend.lastName);
            for (Phones phone : friend.phoneNumbers) {
                System.out.println(" - phone type: " + phone.type + ", phone number : " + phone.number);
            }
        }
    }
}
