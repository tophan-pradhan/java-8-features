package com.sahu.lambda.collection;

import java.util.Map;
import java.util.TreeMap;

public class MapDNSAscTest {

	public static void main(String[] args) {
		Map<Integer, String> nameMap = new TreeMap<>();
		nameMap.put(100, "Durga");
		nameMap.put(600, "Sunny");
		nameMap.put(300, "Bunny");
		nameMap.put(200, "Chinny");
		nameMap.put(700, "Vinny");
		nameMap.put(400, "Vinny");
		System.out.println(nameMap);
	}

}
