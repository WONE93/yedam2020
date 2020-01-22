
public class VariableScope {
	public static void main (String[] args) {
		    int  sum, var1;
		   
		    
		    if(true) {
		    	int var2;
		    	var1 = 10;
		    	var2 = 20;
		    	sum = var1 + var2;
		    	System.out.println("두 수의 합은" + sum);
		    	var2 = 50;
		    	sum = var1 + var2;
		    	System.out.println("두 수의 합은" + sum);
		    }
		    
		    System.out.println(var1);
		//  System.out.println(var2); //var2는 if안에서 선언되었기 때문에 에러가 발생한다.
		    System.out.println(sum);
		    sum = 50;  // 여기서부터는 50이라고 재선언하여서 값이 50
		    System.out.println(sum);
		    
		    for (int i = 0; i < 5; i++) {  //i가 5보다 작을동안, 즉 5번 실행하겠다는 말 
		    	var1 = var1 + 1; //var1의 값(10)에다가 1을 더한값을 var1으로 하겠다는말 즉 11이 var1의 값으로 재정의됨
		    	int var2 = 10;
		    	System.out.println("var1: " + var1 + " , var2: " + var2 );
		    } // var1은 1씩 더한 값을 5번 반복해서, 2는 더할 값이 없기때문에 똑같은 값을 5번 반복
	}
	
}
