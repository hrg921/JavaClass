/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.parser.ParseException;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 26.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class MelonChart {

	private static final String APP_KEY = "d75977b1-d565-3749-95a2-80233f3570e9";
	private static final String MELON_OPEN_URL = "http://apis.skplanetx.com/melon/charts/realtime?";	
	private static final String QUERY_STRING = "count=10&page=1&version=1";
	
	public static void main(String[] args) {		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
	    try {
	    	HttpGet httpget = new HttpGet(MELON_OPEN_URL + QUERY_STRING);
	        
	        httpget.setHeader("appKey", APP_KEY);
	        
	        System.out.println("Executing request : " + httpget.getRequestLine());

	        // Create a custom response handler
	        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
	            @Override
	            public String handleResponse(
	                    final HttpResponse response) throws ClientProtocolException, IOException {
	                int status = response.getStatusLine().getStatusCode();
	                if (status >= 200 && status < 300) {
	                    HttpEntity entity = response.getEntity();
	                    return entity != null ? EntityUtils.toString(entity) : null;
	                } else {
	                    throw new ClientProtocolException("Unexpected response status: " + status);
	                }
	            }

	        };
	        
	        String responseBody = httpclient.execute(httpget, responseHandler);
	        
	        Melon melon = MelonChartJSONParser.parse(responseBody);
	        
	        /***************************************
	         * 노래 순위대로 출력하기
	         * 1. No Make Up - Zion.T 
	         * 2. I (Feat. 버벌진트) - 태연 (Taeyeon) 
	         * 3. 또 다시 사랑 - 임창정 
	         ***************************************/

			for(int i = 0; i < 10; i++) {
				Song song = melon.getSongs().get(i);
				List<Artist> artists = song.getArtists();
				String artistDesc = new String();
				for(int j = 0; j < artists.size(); j++) {
					artistDesc += artists.get(j).getArtistName();
					if(j != artists.size() - 1) {
						artistDesc += ", ";
					}
				}
				System.out.println((i + 1) + ". " + song.getSongName() + " - " + artistDesc);
			}
	        
	        
	    } catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
	        try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	}

}
