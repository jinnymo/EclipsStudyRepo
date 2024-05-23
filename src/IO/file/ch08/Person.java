package IO.file.ch08;

import java.io.Serializable;

//특정 클래스를 직렬화 하기위해서는 상위 부모 또는 바로 Serializable 구현
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;//직렬화 버전 UID //L접미사 롱타입
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name = " +name + ", age ="+age+"]";
	}
	
	
}
