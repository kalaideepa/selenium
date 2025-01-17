package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GET_Method {
	
	public void getMethod() throws MalformedURLException, IOException {
		
		String url = "https://reqres.in/api/users?page=2";
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("GET");
		//connection.connect();
		
		int statusCode = connection.getResponseCode();
		System.out.println("Status code is:"+statusCode);
		
		String message = connection.getResponseMessage();
		System.out.println("Response message is:"+message);
		
		InputStream inputstream = connection.getInputStream();
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
		GET_Method connectionExample = new GET_Method();
		connectionExample.getMethod();
	}

 }
