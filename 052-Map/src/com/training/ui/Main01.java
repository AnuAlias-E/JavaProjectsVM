package com.training.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main01 {
	public static void main(String[] args) {
		Map<String, String> map;
		map = new HashMap<>();

		String s1 = new String("Country");
		String s2 = new String("India");

		map.put(s1, s2);

		String s3 = new String("Capital");
		String s4 = new String("Delhi");

		map.put(s3, s4);

		String s5 = new String("President");
		String s6 = new String("Murmu");
		map.put(s5, s6);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.containsKey("Country"));
		System.out.println(map.containsValue("Murmu"));
		System.out.println(map.get("Country"));

		map.put("Country", "USA");
		System.out.println(map);

		Set<String> allKeys = map.keySet();
		System.out.println(allKeys);

		Collection<String> allValues = map.values();
		System.out.println(allValues);

		for (String key : allKeys) {
			System.out.println(key + "-" + map.get(key));
		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		System.out.println(map.get("Prime Minister"));
		System.out.println(map.getOrDefault("Murmu","No"));
	}
}
