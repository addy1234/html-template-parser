package parser;
// import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        // Get current directory.
        // System.out.println(System.getProperty("user.dir"));
        Document htmlFile = null;

        try {
            htmlFile = (Document) Jsoup.parse(new File("./input/input1.html"), "ISO-8859-1");
            System.out.println(htmlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONParser jsonParser = new JSONParser();
        try {
            Object obj = jsonParser.parse(new FileReader("./output/output.json"));
            JSONArray jsonArray = (JSONArray) obj;

            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("name", "Rishabh");
            jsonObject1.put("email", "rishabhhupta98@gmail.com");
            jsonObject1.put("phone number", "9891601198");

            jsonArray.add((jsonObject1));

            System.out.println(jsonArray);

            FileWriter fileWriter = new FileWriter("./output/output.json");
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        } catch (ParseException p) {
            p.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


