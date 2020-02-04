package com.yedam.shw.classes.extendPkg;

public class Friend {
	private String name;
	private String phone;
	
	Friend(){
		
	}
	
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Friend [이름: " + name + ", \n전화번호: " + phone + "]";
	}
	
	public void showInf() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는 " + phone);
	}
	
	
}
