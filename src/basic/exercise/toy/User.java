package basic.exercise.toy;

public class User extends Product{
	static int count;
	public User(String name) {
		super(name,++count);
		
		
	}
	
}
