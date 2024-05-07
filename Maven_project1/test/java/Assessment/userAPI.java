package Assessment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
 
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
 
public class userAPI {
 
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in/"; // Base URI
    }
 
    @Test
    public void creationUsingHashMap() {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("name", "Ram Deshmukh");
        userMap.put("job", "Architect");
        
 
        given()
            .contentType(ContentType.JSON)
            .body(userMap)
        .when()
            .post("api/users")
        .then()
            .assertThat()
            .statusCode(201); // 201 is the success code for user creation
    }
 
    @Test
    public void creationUsingPOJO() {
        User user = new User();
        user.setName("Sham");
        user.setJob("Doctor");
 
        given()
            .contentType(ContentType.JSON)
            .body(user)
        .when()
            .post("api/users")
        .then()
            .assertThat()
            .statusCode(201); // 201 is the success code for user creation
    }
 
    @Test
    public void creationUsingExternalJsonFile() {
        given()
            .contentType(ContentType.JSON)
            .body(new File("C:\\Users\\SDHANMEH\\eclipse-workspace\\Maven_project1\\src\\test\\java\\user.json"))
        .when()
            .post("api/users")
        .then()
            .assertThat()
            .statusCode(201); // 201 is the success code for user creation
    }
 
    @Test
    public void getUser() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .get("api/users/2") // For user ID is 2
        .then()
            .assertThat()
            .statusCode(200) // 200 is the success code for successful retrieval
            .body("data.first_name", equalTo("Janet"))
            .body("data.last_name", equalTo("Weaver"));
    }
 
    @Test
    public void updateUser() {
        Map<String, Object> updatedInfo = new HashMap<>();
        updatedInfo.put("name", "Updated Name");
        updatedInfo.put("job", "Updated Job");
 
        given()
            .contentType(ContentType.JSON)
            .body(updatedInfo)
        .when()
            .put("/users/2") // For user ID is 2
        .then()
            .assertThat()
            .statusCode(200); // 200 is the success code for user update
    }
 
    @Test
    public void deleteUser() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .delete("/users/2") // For user ID is 2
        .then()
            .assertThat()
            .statusCode(204); // 204 is the success code for user deletion
    }


}

