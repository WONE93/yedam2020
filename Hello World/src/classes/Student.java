package classes; //클레스 생성 필수 3가지. 1.필드 2.생성자. 3.메소드

public class Student {
	// 필드를 만드는 것(속성들)
	String name;
	int age;
	int height;
	int weight;

	// 생성자 (인스턴스를 만들면서 필드값을 초기화) ->메소드의 일종,
	// 메소드는 반환값, 리턴값을 꼭 지정해줘야하는데 생성자는 메소드임에도 불구하고 반환값이 없다.
	Student() {

	}

	Student(String name) {
		this.name = name; // this는 필드 즉 이 필드의 네임에 네임을 담겟다. 구분위해
							// 이 디스네임은 필드네임이고 그 네임을 초기화하겠다
	}

	Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // 필드에 있는모든 값을 초기화함
								// 필드에 private 넣어서 에러남, 초기화안됨
								// 필드는 숨기고, 메소드를 이용해 내용을 수정함
	}

	// 메소드(기능들을 의미함) //속성과 기능을 만드는 기능이 있다

	void study() {
		System.out.println("공부한다.");
	}

	void eat() {
		System.out.println("밥을 먹는다.");
	}

	void sleep() {
		System.out.println("잠을 잔다.");
	}

	void setAge(int age) {
		if(age >= 0)
			this.age = age;
		else
			this.age = 0;
		
	}
	
	
	int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

}
