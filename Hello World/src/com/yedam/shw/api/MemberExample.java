package com.yedam.shw.api;

public class MemberExample {
	public static void main(String[] args) {
				Member m1 = new Member();
				m1.name = "park";
				m1.age = 10;
				Member m2 = new Member();
				m2.name = "kim";
				m2.age = 9;
				
				String str1 = "Hello";
				String str2 = "Hello";
				System.out.println(str1.contentEquals(str2));
				
				System.out.println(m1.equals(m2)); //m1과 m2가 같은지 췍
				System.out.println("===============");
				System.out.println(m2.hashCode());
	}	
}
