package com.yedam.shw.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("하준원");
		strList.add("박규림");  //원래 atrAry[0] = "HELLO" 이렇게 담았는데 여긴 add란 매소드로 담았음
		strList.add("홍성우");
		System.out.println(strList.get(0));
		
		strList.add(1, "이배진");
		System.out.println(strList.get(1));
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	
		strList.remove(3);
		System.out.println("remove(3) 이후. ");
		for(String str : strList) {
			System.out.println(str);
		}
		
		
		List<Integer> intList = new LinkedList<>();
	}

}
