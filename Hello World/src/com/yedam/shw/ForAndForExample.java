package com.yedam.shw;

public class ForAndForExample {
	public static void main(String[] args) {
//*********************************************
		int cnt = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				cnt++;
				System.out.println("i: " + i + ", j: " + j);
			}
			cnt = 0;
			System.out.println();
		}
		cnt = 0;
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// System.out.println(i + "*" + j + "=" + i*j );
				System.out.print(i + "*" + j + "=" + i * j + "   "); // 가로로 값나오게하기
			}
			System.out.println(" ");
		} // 2단부터 9단까지 구구단 표시

		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				// System.out.println(i + "*" + j + "=" + i*j );
				System.out.print(i + "*" + j + "=" + i * j + "   "); // 가로로 값나오게하기
			}
			System.out.println(" ");
		}

//*********************************************
	}
}
