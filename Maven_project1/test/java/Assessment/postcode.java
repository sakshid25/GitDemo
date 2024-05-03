package Assessment;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class postcode {

    private static final String BASE_URL = "https://bookstore.toolsqa.com/BookStore/v1/Books";

    @Test
    public void testCreateBook() {
        String newBookName = "HarryPorter";

        // Create a new book
        Response response = given()
                .baseUri(BASE_URL)
                .contentType("application/json")
                .body("{\"name\": \"" + newBookName + "\"}")
            .when()
                .post("/books")
            .then()
                .statusCode(201)
                .extract().response();

        // Validating the success code
        int statusCode = response.getStatusCode();
        System.out.println("Create Book Status Code: " + statusCode);
      
    }

}