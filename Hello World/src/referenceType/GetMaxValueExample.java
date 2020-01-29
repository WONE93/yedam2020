package referenceType;

public class GetMaxValueExample {
//*************************************************************************
	
	public static void main(String[] args) {
		//정수배열 이름알아서 정하고 { 8, 7, 10, 5, 9} 가장 큰 값을 구하는 메소드 하거나 아님 포로구하기 얘랑 얘랑 비교해서 가장 큰놈이 남도록..
		int var = 0;
		int[] intAry = { 8, 7, 10, 5, 9};
		var = max(intAry);
		System.out.println("최대값은: " + var);
		int[] intAry2 = { 3, 56, 10, 7, 22};
		var = max(intAry2);
		System.out.println("최대값은: " + var);
		
	}
		
	
	
	//메소드
	    public static int max(int[] var) {
	    	int mx = 0;
			
			for (int i = 0; i < var.length; i++) {
				if(mx < var[i]) {
					mx = var[i];			
				}
		    }
			return mx;
		}
	
//*************************************************************************	
}

 