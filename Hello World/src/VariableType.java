
public class VariableType {
	 public static void main (String[] args) {
		 byte var1, var2, sum;
		 var1 = 55;
		 var2 = 33;
		// sum = var1 + var2; //+연산은 int타입임 큰타입은 작은타입에 못넣어. 그래서 바이트를 인트로 바꾸던가 바이트라고 알려주기
		 sum = (byte) ((byte)var1 + (byte)var2);
		 
		 char chr1 = 65;
		 for (int i = 0; i < 10; i++) {
			  chr1 = (char) (chr1+1); // +하면 인트타입(4바이트)로 바껴서 2바이트인 char에 못넣음 그래서 char타입이라 명시했음
		 }                            //chr1+1을 char타입으로 형태를 바꾸는 방법
		 
		 System.out.println(chr1); //문자 A가 나옴 65는 A를 나타내는 숫자, 65+1이라하면 B가나옴
	 }
}
