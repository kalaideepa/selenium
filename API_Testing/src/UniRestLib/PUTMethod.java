package UniRestLib;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class PUTMethod {
	
	public void putMethod() {
		
		HttpResponse<JsonNode> jsonResponse =  Unirest.put("https://reqres.in/api/users/2").body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}").asJson();
		
		System.out.println("Status Code:"+jsonResponse.getStatus());
		System.out.println("Response Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}

	public static void main(String[] args) {
		
		PUTMethod p = new PUTMethod();
		p.putMethod();
		

	}

}
