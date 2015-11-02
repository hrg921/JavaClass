/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * 
 */
package org.dimigo.collection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ JSONTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 12.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class JSONTest {

	private static final String FILE_PATH = "/Users/hangeonho/IdeaProjects/JavaLesson/JavaClass/src/org/dimigo/collection/json_input.txt";
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
					
			String result;
			StringBuilder jsonString = new StringBuilder();
					
			// 1 라인씩 읽어오기
			while((result = br.readLine()) != null) {
				jsonString.append(result);
			}
			
			System.out.println(jsonString);
			
			// JSON String을 Parsing하여 Person 객체에 담기

			JSONParser jsonParser = new JSONParser();


			// 문자열을 JSON 객체로 변환

			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString.toString());

			Person person = new Person();

			person.setName(jsonObject.get("name").toString());
			person.setAge(((Long)jsonObject.get("age")).intValue());


			// address 값 셋팅하기

			JSONObject address = (JSONObject)jsonParser.parse(jsonObject.get("address").toString());

			person.setSido(address.get("sido").toString());
			person.setDong(address.get("dong").toString());
			person.setDetailAddress(address.get("detailAddress").toString());


			// 전화번호 셋팅하기

			JSONArray phoneNumbers = (JSONArray)jsonParser.parse(jsonObject.get("phoneNumbers").toString());

			int size = phoneNumbers.size();

			List<Phone> phoneList = new ArrayList<>();

//			List<Phone> phones = new ArrayList<>();
//
//			JSONObject tempJSONPhone;
//			String tempType;
//			String tempPhoneNumber;
//			Phone tempPhone;
//			__ My Code

			for(int i = 0; i < size; i++) {
//				tempJSONPhone = (JSONObject)jsonParser.parse(phoneNumbers.get(i).toString());
//				tempType = tempJSONPhone.get("type").toString();
//				tempPhoneNumber = tempJSONPhone.get("number").toString();
//
//				tempPhone = new Phone();
//				tempPhone.setType(tempType);
//				tempPhone.setNumber(tempPhoneNumber);
//
//				phoneNumbers.add(tempPhone);
				//			__ My Code

				// JSONObject 꺼내기
				JSONObject phoneObj = (JSONObject)phoneNumbers.get(i);

				// Phone 객체 생성
				Phone phone = new Phone();

				// Phone Setter() 메소드 호출
				phone.setType((String)phoneObj.get("type"));
				phone.setNumber((String)phoneObj.get("number"));

				phoneList.add(phone);
			}

//			person.setPhoneNumbers(phones);
			//			__ My Code

			person.setPhoneNumbers(phoneList);

			System.out.println(person);

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	

}
