package APITesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DELETE_Method {
	
	public void deleteMethod() throws MalformedURLException, IOException {
		
		String url = "https://jsonplaceholder.typicode.com/posts/1";
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		
		conn.setRequestMethod("DELETE");
		conn.connect();
		
		System.out.println("Status code is:"+conn.getResponseCode());
		System.out.println("Response message code is:"+conn.getResponseMessage());
		
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
		
	

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		DELETE_Method d = new DELETE_Method();
		d.deleteMethod();
		
		


		

	}

}
