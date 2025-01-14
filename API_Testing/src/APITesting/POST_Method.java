package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class POST_Method {

	public void postMethod() throws MalformedURLException, IOException {

		String url = "https://reqres.in/api/users";
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		conn.setRequestMethod("POST");
		//conn.connect();
		conn.setRequestProperty("content-Type", "application/json");
		conn.setDoOutput(true); //will be false in get method by default

		String jsonBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";

		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = conn.getOutputStream();

		outputStream.write(inputJson);

		System.out.println("Status code is:"+conn.getResponseCode());
		System.out.println("Response Message is:"+conn.getResponseMessage());

		InputStream inputstream = conn.getInputStream();
		InputStreamReader InputStreamReader = new InputStreamReader(inputstream);

		BufferedReader bufferedReader = new BufferedReader(InputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);


	}

	public static void main(String args[]) throws MalformedURLException, IOException {

		POST_Method p = new POST_Method();
		p.postMethod();

	}



}
