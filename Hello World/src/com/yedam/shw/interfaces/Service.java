package com.yedam.shw.interfaces;

import java.util.List;

import com.yedam.shw.interfaces.model.Employees;

public interface Service {
	public void addMember(Employees emp, List<Employees> list);
	public Employees getMember(int memberId, List<Employees> list);
	public List<Employees> getMemberList(List<Employees> list);
	public void updateMember(Employees emp,List<Employees> list);  //1. 4가지 기능을 만들어 볼 것임. 배열,컬렉션 등으로
}
