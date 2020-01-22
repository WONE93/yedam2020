
public class ForExample {
       public static void main(String[] args) {
    	   
    	         char chrl = 64;
    	   for (int i = 0; i < 26; i++) { 
    		   chrl = (char)(chrl+1);
    	   
    		   System.out.println(chrl);
    		   }
    	   
    	   // or 선생님방법
    	   char chr = 65;
    	   for(int i = 0; i < 26; i++){
    	   System.out.println(chr++);
    	    }
    	    
    	   //다혜씨방법
    	   for(int i=0; i<26; i++) {
    		   char chr2 = (char)(65+i);
    		   System.out.println(chr2);
    	   }
    	   boolean trueOrFalse = true;
    	   if (!trueOrFalse) { //!붙이면 false가 됨 
    		                   // if (3 != 5) {  
    		   System.out.println("참입니다.");
    	   }
    	   }
}
    