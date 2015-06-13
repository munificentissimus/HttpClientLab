package br.mnfc.lab.httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class URLConnectionTest {

	public static void main(String[] args) {
		URL requestUrl;
		try {
			requestUrl = new URL(
					"https://prointeriv-munificentissimus1.c9.io/api/alunos/233/atividades");
			URLConnection con = requestUrl.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			int cp;
			try {
				while ((cp = in.read()) != -1) {
					sb.append((char) cp);
				}
			} catch (Exception e) {
			}
			String json = sb.toString();
			
			System.out.println(json);
			
			Gson gson = new Gson();

			//JsonArray
			Atividade[] atividades = gson.fromJson(json, Atividade[].class);
			
			//Objeto
			//Atividade atividade = gson.fromJson(br, Atividade.class);
			
			for (Atividade a : atividades){
				System.out.println(a);
			}

		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
