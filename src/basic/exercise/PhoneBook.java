package basic.exercise;

public class PhoneBook {

	String name;
	int phoneNum;

	static int makePhoneNum = 0;

	public PhoneBook(int name) {
		// TODO Auto-generated constructor stub

		this.name = "이름" + name;
		this.phoneNum = makePhoneNum;
		makePhoneNum++;
	}

	public PhoneBook(String name2, String number) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}






}
