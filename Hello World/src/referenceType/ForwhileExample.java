package referenceType;

public class ForwhileExample {
//*************************************************************************
	public static void main(String[] args) {
		int[] array = new int[10];
		method1(array);

	}

	public static void method1(int[] intAry) {
		System.out.println("1번문제");
		int b = 1;
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = b++;
		}

		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();
	}

	public static void methos2(int[][] intAry) {
		System.out.println("2번문제");
		
		int cnt = 1;
		// 배열에 숫자 입력(1~25)
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = cnt++;
			}
		}
	}
//***************************************************************************
}

//1. 1차원배열 -> 10개 크기
//2. 2차원배열 -> [5][5]배열 