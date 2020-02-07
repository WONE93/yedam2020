package com.yedam.shw.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.yedam.shw.interfaces.model.Employees;

public class ServiceImpl implements Service  {  //디비의역할, 조회할 값 입력하기

	
	// 한건 입력 0
	@Override
	public void addMember(Employees emp, List<Employees> list) {
			list.add(emp);	
	}

	
	//사원 한건 조회 0
	@Override
	public Employees getMember(int memberId, List<Employees> list) {
		
		Employees getEmp = null;
		for(Employees emp : list) {
			if(emp != null && emp.getEmployeeId() == memberId) {
				getEmp = emp;
			}
		}
		return getEmp;
	}

	
	//전체 조회 0 
	@Override
	public List<Employees> getMemberList(List<Employees> list) {
		List<Employees> destList = new ArrayList<>();
		for(Employees emp : list) { 
			destList.add(emp);
		}
		return destList;
	}

	@Override
	public void updateMember(Employees emp, List<Employees> list) {
		// TODO Auto-generated method stub
		
	}

	
	
}
