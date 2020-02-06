package com.yedam.shw.collection.list;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
	}
//		@Override
//		public int compareTo(Person o) {
//			return o.age - this.age; // this.age가 작고 o.age 크다. 30-20-10 
//		}
		
		@Override
		public int compareTo(Person o) {
//			return this.name.compareTo(o.name);  
//			return o.name.compareTo(this.name);  //스펠링 작은 개수대로
			return o.name.length() - this.name.length();
		}


	} // End of Class


