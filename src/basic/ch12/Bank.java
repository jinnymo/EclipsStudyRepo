package basic.ch12;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User[] user = new User[5];
		for (int i = 0; i < 5; i++) {
			user[i] = new User(0);
			System.out.println("유저" +i +"는  "+user[i].getBankName());
		}
		
		user[1].setBankName("농협");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("유저" +i +"는  "+user[i].getBankName());
		}
	}

}
