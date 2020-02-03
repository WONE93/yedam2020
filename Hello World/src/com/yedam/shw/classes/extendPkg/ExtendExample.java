package com.yedam.shw.classes.extendPkg;

public class ExtendExample {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.field1 = "parent";
		p1.method1();
		
		Child c1 = new Child();
		c1.field1= "Parent";
		c1.field2= "Parent";
		c1.method1();
		c1.method2();
	} // End of Main
	
} // End of class
