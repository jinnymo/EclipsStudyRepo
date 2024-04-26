package basic.ch22;

public class Students implements Romeo{

	String name;

	public Students(String name) {
		// TODO Auto-generated constructor stub
	this.name = name;
	}
	@Override
	public void performAsRomeo() {
		// TODO Auto-generated method stub
		System.out.println("학교 축제에서 " + name +"이 연극을 하낟.");
	}

}
