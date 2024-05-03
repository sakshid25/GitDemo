package Assessment;


import org.testng.annotations.Test;

//import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class bookstore1 {
 
 @Test
public void GetBooksDetails() { 
	 
	RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1/Books";
	 
	RequestSpecification httpRequest = RestAssured.given();
	
	Response response = httpRequest.request(Method.GET, "");
	
	System.out.println("Status received => " + response.getStatusLine()); 
	System.out.println("Response=>" + response.prettyPrint()); //for alignment
    	
}
}
