import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UserProfile {

    private JSONObject userDetails = new JSONObject();
    private String name;
    private int age;
    private String email;
    private JSONArray hobbies;

    public UserProfile(String name, int age, String email, JSONArray hobbies){


        userDetails.put("name", this.name = name);
        userDetails.put("age", this.age = age);
        userDetails.put("email", this.email = email);
        userDetails.put("hobbies", this.hobbies = hobbies);

        System.out.println("User profile added = " + userDetails);

    return;
    }

    public JSONObject getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(JSONObject userDetails) {
        this.userDetails = userDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public JSONArray getHobbies() {
        return hobbies;
    }

    public void setHobbies(JSONArray hobbies) {
        this.hobbies = hobbies;
    }
}
