import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, ParseException {
        JSONArray data = ReadFile.read("/data/data.json");

        JSONObject jsonObject = (JSONObject) data.get(0);
        System.out.println(jsonObject.get("tuple"));
    }
}
