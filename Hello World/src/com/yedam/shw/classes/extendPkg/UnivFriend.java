package com.yedam.shw.classes.extendPkg;

public class UnivFriend extends Friend {
	private String university;
	

	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public void showInf() {
//		super.showInf();
		System.out.println("학교친구 이름은 " + super.getName());
		System.out.println("학교친구 전화번호는 " + super.getPhone());
		System.out.println("학교는 " + university);
	}


	
	
}
