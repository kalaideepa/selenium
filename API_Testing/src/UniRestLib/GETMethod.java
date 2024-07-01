package UniRestLib;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class GETMethod {

	public void getMethod() {

		HttpResponse<JsonNode> jsonResponse = Unirest.get("https://reqres.in/api/users?page=2").asJson();

		System.out.println("Status Code:"+jsonResponse.getStatus());
		System.out.println("Response Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());

	}
	public static void main(String[] args) {

		GETMethod g = new GETMethod();
		g.getMethod();

	}

}
