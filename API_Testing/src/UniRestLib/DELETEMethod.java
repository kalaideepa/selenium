package UniRestLib;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class DELETEMethod {

	public void deleteMethod() {

		HttpResponse<JsonNode> jsonResponse =  Unirest.delete("https://jsonplaceholder.typicode.com/posts/1").asJson();

		System.out.println("Status Code:"+jsonResponse.getStatus());
		System.out.println("Response Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}

	public static void main(String[] args) {

		DELETEMethod d = new DELETEMethod();
		d.deleteMethod();
	}

}
