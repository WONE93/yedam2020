package com.yedam.shw.classes.extendPkg;

public class DriverExample {
		public static void main(String[] args) {
			Driver d1 = new Driver();
			Vehicle vehicle = new Vehicle();
			d1.drive(vehicle);
			vehicle = new Bus(); // promotion 부모가 자식클래스를 상속받음
			d1.drive(vehicle); //
			vehicle  = new Truck(); // promotion
			d1.drive(vehicle); //실행
			
			
			
		}// End of Main
}// End of Class
