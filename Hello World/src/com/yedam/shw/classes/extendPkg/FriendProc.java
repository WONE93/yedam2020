package com.yedam.shw.classes.extendPkg;

import java.util.Scanner;

public class FriendProc {

	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	public Friend getFriend(String searchName) {
		Friend friend = null;
		for (Friend f : friends) {
			if (f != null && f.getName().contentEquals(searchName)) {
				friend = f;
			}
		}
		return friend;
	}

	public void addFriend() {
		System.out.println("1.대학친구 2.회사친구 3.그외");
		int subMenu = scn.nextInt();
		scn.nextLine();
		System.out.println("이름입력: ");
		String name = scn.nextLine();
		System.out.println("번호입력: ");
		String phone = scn.nextLine();

		Friend friend = null;

		if (subMenu == 1) {
			System.out.println("학교입력: ");
			String univ = scn.nextLine();
			friend = new UnivFriend(name, phone, univ);

		} else if (subMenu == 2) {
			System.out.println("회사입력: ");
			String company = scn.nextLine();
			friend = new ComFriend(name, phone, company);

		} else if (subMenu == 3) {
			friend = new Friend(name, phone);
		} // end of if

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}

	}

	public void listFriend() {

		for (Friend friend : friends) {
			if (friend != null)
				friend.showInf();
		}

	}

	public void updateFriend() {
		System.out.println("찾을 이름 입력: ");
		String name = scn.nextLine();
		Friend f = getFriend(name);
		if (f == null) {
			System.out.println("조회 결과 없음. ");
			return;
		} else {
			System.out.println("변경할 번호 입력: ");
			String phone = scn.nextLine();
			f.setPhone(phone);
		}
	}

	public void delFriend() {
		System.out.println("삭제할 이름 입력: ");
		String name = scn.nextLine();
		boolean isExist = false;
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				isExist = true;
			}
		}
		
		if (isExist) {
			System.out.println("삭제되었습니다. ");
		} else {
			System.out.println("해당 이름은 존재하지 않습니다.");
		}

	}

	public void exec() {

		while (true) {
			System.out.println("======================");
			System.out.println("1.입력2.리스트3.수정4.삭제9.종료");
			System.out.println("======================");
			System.out.println("메뉴선택> ");

			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				addFriend();

			} else if (menu == 2) {
				listFriend();

			} else if (menu == 3) {
				updateFriend();

			} else if (menu == 4) {
				delFriend();

			} else if (menu == 9) {
				break;

			} // End of If

		} // End of while
		System.out.println("종료");

	}// End of exec

}// End of class
