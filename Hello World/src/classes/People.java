package classes;

public class People {

	// 필드
	String name;
	int age;
	int height;
	int weight;

	// 생성자
	People() {

	}

	People(String name) {
		this.name = name;
	}

	People(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	// 메소드

	void eat() {
		System.out.println("하루 섭취량. ");
	}

	void hobby() {
		System.out.println("취미. ");
	}

	void study() {
		System.out.println("하루공부시간. ");
	}

	int getAge() {
		return age;
	}

}
