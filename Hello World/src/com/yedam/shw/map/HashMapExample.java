package com.yedam.shw.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("하준원", 20);
		map.put("홍성우", 30);
		map.put("윤재언", 40);
		map.put("남용희", 50);
		
		System.out.println();
		Integer i = map.get("하준원");
		Set<String> set = map.keySet();//키값을 가져다 셑에다 담는다.
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key +","+map.get(key));
		}
	}
}

