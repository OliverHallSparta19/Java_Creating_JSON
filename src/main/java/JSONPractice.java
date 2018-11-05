import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONPractice {
    public static void main(String args[]){

        JSONArray hobbies = new JSONArray();
        hobbies.add("Football");
        hobbies.add("Karate");

        JSONObject susan = new JSONObject();
        susan.put("name", susan);
        susan.put("age", 25);
        susan.put("email","susanemail.com");
        susan.put("hobbies", hobbies);

        UserProfile dave = new UserProfile("TOBY", 21, "test", hobbies);


    }
}
