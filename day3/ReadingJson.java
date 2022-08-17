package parametersTestNG;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadingJson {
	String n;

	public String readJSONData(String keyword) throws IOException, ParseException{

		Reader reader = new FileReader("C:\\Users\\OtnielLenovo\\eclipse-workspace\\LearningSelenium\\src\\test\\java\\parametersTestNG\\testData.json");
					
		JSONParser parser = new JSONParser();
		
		JSONArray jsonArr = (JSONArray)parser.parse(reader);
		
		for(Object obj : jsonArr){
			
			JSONObject jo = (JSONObject)obj;			
			n = (String)jo.get(keyword);
			
		}
	
		return n;
		
	}
}
