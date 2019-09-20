
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api";

		
		Response response = given().contentType(ContentType.JSON).when().get("/users/1").then().extract().response();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asString());

		
	}

}
