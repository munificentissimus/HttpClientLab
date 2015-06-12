package br.mnfc.lab.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClientProtocolException, IOException, ParseException
    {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getReq = new HttpGet("https://prointeriv-munificentissimus1.c9.io/api/aluno/233/atividades");
        getReq.addHeader("accept","application/json");
        
        HttpResponse response = httpClient.execute(getReq);
        
        if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			   + response.getStatusLine().getStatusCode());
		}
 
		BufferedReader br = new BufferedReader(
                         new InputStreamReader((response.getEntity().getContent())));
 
		Gson gson = new Gson();

		//JsonArray
		Atividade[] atividades = gson.fromJson(br, Atividade[].class);
		
		//Objeto
		//Atividade atividade = gson.fromJson(br, Atividade.class);
		
		for (Atividade a : atividades){
			System.out.println(a);
		}
		
		httpClient.getConnectionManager().shutdown();
    }
}
