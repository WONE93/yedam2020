package com.yedam.shw.classes.extendPkg;

public class Car {
//	Tire frontLeft = new Tire("앞왼쪽", 6);
//	Tire frontRight = new Tire("앞오른쪽", 8);
//	Tire backLeft = new Tire("뒤왼쪽", 4);
//	Tire backRight = new Tire("뒤오른쪽", 10);

	Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 8), new Tire("뒤왼쪽", 4), new Tire("뒤오른쪽", 10) };

	void stop() {
		System.out.println("자동차가 멈춥니다. ");
	}

	int run() {
		if(tires[0].roll() == false) {
			stop();
			return 1;
		}

		if (tires[1].roll() == false) {
			stop();
			return 2;
		}
		if (tires[2].roll() == false) {
			stop();
			return 3;   
		}
		if (tires[3].roll() == false) {
			stop();
			return 4;
		}
		return 0;
	
	}

//	int run() {
//		if (frontLeft.roll() == false) {
//			stop();
//			return 1;
//		}
//
//		if (frontRight.roll() == false) {
//			stop();
//			return 2;
//		}
//		if (backLeft.roll() == false) {
//			stop();
//			return 3;
//		}
//		if (backRight.roll() == false) {
//			stop();
//			return 4;
//		}
//		return 0;
//
//	}
//

} // End of Class
