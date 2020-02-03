package com.yedam.shw.classes.extendPkg;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for(int i=0; i<5; i++) {
			int problemPosition = car.run();
			switch(problemPosition) {
				case 1:
					System.out.println("앞왼쪽 타이어교체");
					car.frontLeft = new Tire("앞왼쪽", 10);
					break;
				case 2:
					System.out.println("앞왼쪽 타이어교체");
					car.frontRight = new Tire("앞오른쪽", 10);
					break;
				case 3:
					System.out.println("뒤왼쪽 타이어교체");
					car.backLeft = new Tire("뒤왼쪽", 10);
					break;
				case 4:
					System.out.println("뒤왼쪽 타이어교체");
					car.backRight = new Tire("뒤오른쪽", 10);
					break;
			}
			System.out.println("---------------------------");
			
		}
		System.out.println("주행종료");
		
		
	}// End of Main
	
}// End of Class
