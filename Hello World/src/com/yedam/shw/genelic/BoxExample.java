package com.yedam.shw.genelic;

import java.util.ArrayList;
import java.util.List;

import com.yedam.shw.generic.before.Apple;
import com.yedam.shw.interfaces.model.Employees;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		for (String str1 : list) {
			System.out.println(str1);
		}
		
		List<Employees> empList = null;
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());
		
		List ist = new ArrayList();
		ist.add(new Apple());
		ist.add("Hello");
		for ( Object obj : ist) {
			System.out.println(obj);
		}
 	}
}
