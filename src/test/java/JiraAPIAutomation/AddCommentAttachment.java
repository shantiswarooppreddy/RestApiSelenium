package JiraAPIAutomation;

import java.io.File;

import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

public class AddCommentAttachment {
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		RestAssured.baseURI="http://localhost:8080";

		//Login Scenario

		SessionFilter session=new SessionFilter();

		String response = given().relaxedHTTPSValidation().header("Content-Type","application/json").body("{\r\n" +
		"    \"username\": \"sreddy1\",\r\n" +
		"    \"password\": \"Ammi1958\"\r\n" +
		"}").filter(session).when().post("/rest/auth/1/session").then().extract().response().asString();

		String expectedMessage ="Hi How are you?";

		//Add comment

		String addCommentResponse = given().pathParam("key", "SP-2").header("Content-Type","application/json").body("{\r\n" +
		"    \"body\": \""+ expectedMessage +"\",\r\n" +
		"    \"visibility\": {\r\n" +
		"        \"type\": \"role\",\r\n" +
		"        \"value\": \"Administrators\"\r\n" +
		"    }\r\n" +
		"}").filter(session).when().post("/rest/api/2/issue/{key}/comment").then()
		.assertThat().statusCode(201).extract().response().asString();

		JsonPath js=new JsonPath(addCommentResponse);

		String commentId= js.getString("id");

		//Add Attachment

		given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "SP-2")
		.header("Content-Type","multipart/form-data")
		.multiPart("file",new File("jira.txt")).when().
		post("rest/api/2/issue/{key}/attachments").then().assertThat().statusCode(200);

		//Get Issue

		String issueDetails = given().filter(session).pathParam("key", "SP-2")
		.queryParam("fields", "comment")
		.when().get("/rest/api/2/issue/{key}").then()
		.extract().response().asString();

		System.out.println(issueDetails);

		JsonPath js1 =new JsonPath(issueDetails);
		int commentsCount=js1.getInt("fields.comment.comments.size()");
		for(int i=0;i<commentsCount;i++)
		{
		   String commentIdIssue =js1.get("fields.comment.comments["+i+"].id").toString();
		   if (commentIdIssue.equalsIgnoreCase(commentId))
		 {
		    String message= js1.get("fields.comment.comments["+i+"].body").toString();
		    System.out.println(message);
		    Assert.assertEquals(message, expectedMessage);
		 }
		}
		}

}
