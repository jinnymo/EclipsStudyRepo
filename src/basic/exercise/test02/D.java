package basic.exercise.test02;

public class D {
	
	private String name;

	
	public D() {
		name = "나는 d 이다.12";
		sendName();
	}
	D sendName() {
		return this;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
