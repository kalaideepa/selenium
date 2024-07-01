package UniRestLib;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class POSTMethod {

	public void postMethod() {

		HttpResponse<JsonNode> jsonResponse =  Unirest.post("https://reqres.in/api/users")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}").asJson();

		System.out.println("Status Code:"+jsonResponse.getStatus());
		System.out.println("Response Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());

	}

	public static void main(String[] args) {

		POSTMethod p = new POSTMethod();
		p.postMethod();


	}

}
