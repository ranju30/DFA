import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static JSONArray read(String fileName) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        java.io.FileReader fileReader = new java.io.FileReader("/Users/ranjukarmakar/WorkSpace/classRoomSem_2/automata/data/data.json");
        JSONArray parse = (JSONArray) parser.parse(fileReader);
        return parse;
    }
}
