package com.yedam.shw.classes;

public class CalenderEx {

	public static void main(String[] args) {

		createCal(5);

	} // end of main
	
	
	static void createCal(int mon) {
		int month = mon;
		
		
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = getMonthDay(month);
		int firstDay = getFirstDay(month);
		System.out.println(month + "월달은 " + getMonthDay(month) + "일 까지입니다. ");
		// 요일 출력
		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();

		// 월의 첫째날의 시작위치 지정.
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    ");
		}

		// 7일씩 잘라서 출력
		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}
		
		
		
	}

	static int getMonthDay(int month) {
		int days = 0;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;

		} else if (month == 2) {
			days = 28;

		} else {
			days = 31;			
		}
		
		return days;
	}


	static int getFirstDay(int month) {

		if (month == 1) { // 1월달은 수요일/
			return 4;
		} else if (month == 2) {
			return 7;
		} else if (month == 3) {
			return 1;
		} else if (month == 4) {
			return 4;
		}  else if (month == 5) {
				return 6;
		} else {
			return 0;
		}
  
	}   
}

