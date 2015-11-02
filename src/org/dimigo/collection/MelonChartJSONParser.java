/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class MelonChartJSONParser {
	
	public static Melon parse(String jsonString) throws ParseException {
		Melon melon = new Melon();
		
		// JSON String을 Parsing하여 Melon 객체에 담기
		// 필요한 데이터만 가져오기 (노래제목, 가수명)

		// JSONParser 객체 생성

		JSONParser jsonParser = new JSONParser();

		// MelonChart 문자열을 모두 JSON객체로 변환

		JSONObject melonChart = (JSONObject)((JSONObject)jsonParser.parse(jsonString)).get("melon");

		// songs를 제외한 Melon객체의 필드를 설정한다

		JSONObject songs = (JSONObject)melonChart.get("songs");
		JSONArray song = (JSONArray)songs.get("song");
		List<Song> songList = new ArrayList<>();

		for(int i = 0; i < song.size(); i++) {
			Song tempSong = new Song();
			JSONObject songObject = (JSONObject)song.get(i);

			tempSong.setSongName(songObject.get("songName").toString());

			JSONObject artistsObj = (JSONObject)songObject.get("artists");
			JSONArray artistArr = (JSONArray)artistsObj.get("artist");
			List<Artist> artists = new ArrayList<>();

			for(int j = 0; j < artistArr.size(); j++) {
				Artist artist = new Artist();

				JSONObject artistObj = (JSONObject)artistArr.get(j);
				artist.setArtistId(Integer.parseInt(artistObj.get("artistId").toString()));
				artist.setArtistName(artistObj.get("artistName").toString());

				artists.add(artist);
			}

			tempSong.setArtists(artists);
			songList.add(tempSong);
		}

		melon.setSongs(songList);
		
		return melon;
	}

}
