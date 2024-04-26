package basic.ch22;

public class Actor implements Romeo{

	String name;
	
	public Actor(String name) {
	 this.name = name;
	}
	
	@Override
	public void performAsRomeo() {
		// TODO Auto-generated method stub
		
	System.out.println(name +" 가 ~~~ 연극합니다.");
	
	}
}	