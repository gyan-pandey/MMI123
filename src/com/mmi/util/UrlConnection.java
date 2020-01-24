package com.mmi.util;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import javax.net.ssl.HttpsURLConnection;

public class UrlConnection {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		UrlConnection http = new UrlConnection();

		System.out.println("\nTesting 2 - Send Http POST request");
		http.Post();
		System.out.println("Testing 1 - Send Http GET request");
		http.Get();
		
		

	}
	
	// HTTP POST request
	private void Post() throws Exception {

		String url = "https://outpost.mapmyindia.com/api/security/oauth/token";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
		
		//add reuqest header
		
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

		String urlParameters = "grant_type=client_credentials&client_id=YEmC87fyAGe-wDhGasAeb0SHh8oEEz6dqPTMYvar3_zCDRR2ovfssb8e7n3TZXw0-DU8o4IL9WvHNK_v2MIo2A==&client_secret=QwBCJ01mbSOkRQdrwS7p8SULllfdyJl1mdf3ZL5S21X5iaAoO1Y1XyDH-ixFQzXUz2oH9f7AsAKF75SVuT23ncMqs_hnQ5fY";
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream dataOutputStream = new DataOutputStream(con.getOutputStream());
		dataOutputStream.writeBytes(urlParameters);
		dataOutputStream.flush();
		dataOutputStream.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//print result
		System.out.println(response.toString());

	}



	// HTTP GET request
	private void Get() throws Exception {

		String url = "https://atlas.mapmyindia.com/api/places/geocode?address=";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Authorization", "0dcdb451-4895-4874-b714-eee47c8a5b14");
		con.setRequestProperty("Response-Type", "JSON");
		
		
		String urlParameters = "mapmyindia 237 okhla phase 3&response=JSON";
		
		con.setDoOutput(true);
		DataOutputStream dataOutputStream = new DataOutputStream(con.getOutputStream());
		dataOutputStream.writeBytes(urlParameters);
		dataOutputStream.flush();
		dataOutputStream.close();

		int responseCode = con.getResponseCode();
		
		
		
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("GET parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
		
	}
	

}	
















	
	/*
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.net.HttpURLConnection;
	import java.net.URL;

	public class UrlConnection {

		private static final String USER_AGENT = "Accept";

		private static final String GET_URL = "https://google.com";

		private static final String POST_URL = "https://google.com";

		

		public static void main(String[] args) throws IOException {

			sendGET();
			System.out.println("GET DONE");
			sendPOST();
			System.out.println("POST DONE");
		}

		private static void sendGET() throws IOException {
			URL obj = new URL(GET_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("GET request not worked");
			}

		}

		private static void sendPOST() throws IOException {
			URL obj = new URL(POST_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", USER_AGENT);

			// For POST only - START
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();
		
			os.flush();
			os.close();
			// For POST only - END

			int responseCode = con.getResponseCode();
			System.out.println("POST Response Code :: " + responseCode);

			if (responseCode == HttpURLConnection.HTTP_OK) { //success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("POST request not worked");
			}
		}

	}


*/