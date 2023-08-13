package jenkinsAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class getComments {
	@Test
	public void getAllComments() {
		given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("comments")
		.prettyPrint();
	}
}
