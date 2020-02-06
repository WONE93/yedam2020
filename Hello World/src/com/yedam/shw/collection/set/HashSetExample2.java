package com.yedam.shw.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//인스턴스가 재정의 됨
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}
	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.name.equals(m.name);
	}
		
}


public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("하준원", 20));
		set.add(new Member("하준원", 20));
		set.add(new Member("홍성우", 20));
		set.add(new Member("윤쟈온", 20));
		
		System.out.println(set.size());
		for (Member mem : set) {
			System.out.println(mem.hashCode());
		}
		
		Iterator<Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m.name + "," + m.age);
		}
	}
}
