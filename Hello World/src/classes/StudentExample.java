package classes;

public class StudentExample {
	public static void main(String[] args) {
		Student sn = new Student(); 
		System.out.println(sn.name );
		System.out.println(sn.age );
		System.out.println(sn.height );
		System.out.println(sn.weight );

		System.out.println("====================");
		
		Student stnt = new Student(); // studebt instance 생성. 
		stnt.name = "hong";
		stnt.age = -20;
//		stnt.setAge(20);
		stnt.height = 170;
		stnt.weight = 65;
		
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
		
		System.out.println("====================");
		
		Student snt = new Student();
		snt.name = "seo";
//		snt.age = 27;   //필드를 통해 직접 나이(값)을 넣는방식
		snt.setAge(-27); // 메소드를 통해 값을 넣는 방식
		snt.height = 160;
		snt.weight = 65;
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		
		snt.study(); // 메소드에 저장된 값 호출
		

		
	}
	
	

}
