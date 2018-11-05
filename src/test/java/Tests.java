import org.json.simple.JSONArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Tests {

    UserProfile testUser;

    @Before
    public void Setup(){
        JSONArray hobbies = new JSONArray();
        hobbies.add("jujitsie");
        hobbies.add("soccer");
        testUser = new UserProfile("Geoff",45,"geoff@mail.com", hobbies);
    }





    @Test
    public void TestNameString(){
        Assert.assertEquals(5, testUser.getName().length());
        System.out.println("Name length is " + testUser.getName().length());
    }
}
