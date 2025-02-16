package Utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONReader {

    public static JSONObject getTestData(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONParser parser = new JSONParser();
            return (JSONObject) parser.parse(content);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read test data from JSON file", e);
        }
    }

    }


