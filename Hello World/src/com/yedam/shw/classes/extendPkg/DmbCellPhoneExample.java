package com.yedam.shw.classes.extendPkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("sky", "white", 10);
		d1.powerOn();
		d1.turnOnDmb();
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다");
		d1.receiveMessage("안녕하세요");
		d1.powerOff();

		Cellphone c1 = new DmbCellPhone(); // promotion

		if (c1 instanceof DmbCellPhone) {
			DmbCellPhone d2 = (DmbCellPhone) c1; // casting: 부모클래스를 자식클래스로 담을때
			d2.turnOnDmb();
			d2.changeChannel(40);
			d2.turnOffDmb();
		}

		Cellphone c2 = new Cellphone();
		if (c2 instanceof DmbCellPhone) {
			DmbCellPhone d3 = (DmbCellPhone) c2;
		} else {
			System.out.println("casting 불가. ");
		}

	}
}
