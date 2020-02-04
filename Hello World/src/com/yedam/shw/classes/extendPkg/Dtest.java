package com.yedam.shw.classes.extendPkg;

public class Dtest {
	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i + j >= 4) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}// main

}// End of Class
