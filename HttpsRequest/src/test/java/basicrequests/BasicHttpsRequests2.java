package basicrequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class BasicHttpsRequests2 {
	
	
	
	int id;
	
	@Test(priority=1)
	void getuser()
	{

           given()
            
            .when()
                .get("https://reqres.in/api/users/2");
           
           
           
}
	
	

	
	//@Test(priority=2)
	void setuser()
	
	{
		HashMap data = new HashMap();
		
		data.put("name", "Raguram");
		data.put("job", "Tester");
	id=	given()
		
		
		.contentType("application/json")
		.body(data)
		
		.when()
		
		.post("https://reqres.in/api/users")
		
		.jsonPath().getInt("id")
		
		;
			}
	
	@Test(priority=3,dependsOnMethods= "setuser")
	void updateuser()
	
	{
		HashMap data1 = new HashMap();
		
		data1.put("name", "Raguram");
		data1.put("job", "QA Tester");
	given()
		
		
		.contentType("application/json")
		.body(data1)
		
		.when()
		
		.post("https://reqres.in/api/users/ "+ id)
		
		.then()
		
		.statusCode(201)
		.log().all();
		
		;
			}
	
	@Test(priority=4,dependsOnMethods= "setuser")
	void deleteuser()
	
	{
		
		when()
		
		.delete("https://reqres.in/api/users/ "+ id)
		
		.then()
		
		.statusCode(200)
		.log().all();
		
		;
			}
	

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

