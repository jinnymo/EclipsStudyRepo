package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDefense() {
		return this.defense;
	}
	public boolean getIsDie() {
		return this.isDie;
	}
	
	public void setName(String inputName) {
		if(inputName.equals(this.name)) {
			System.out.println("현재 이름과 동일합니다.");
		}else {
			this.name = inputName;
		}
		
	}
	public void setHp(int inputHp) {
		if(inputHp <= 0) {
			System.out.println("hp 설정은 0이상이어야 합니다.");
		}else {
			this.hp = inputHp;
		}
	}
	
	public void setPower(int inputPower) {
		if(inputPower <= 0) {
			System.out.println("Power 설정은 0이상이어야 합니다.");
		}else {
			this.power = inputPower;
		}
		
	}
	
	public void setDefense(double inputDefense) {
		if(inputDefense <= 0) {
			System.out.println("defense 설정은 0이상이어야 합니다.");
		}else {
			this.defense = inputDefense;
		}
		
	}
	public void setIsDie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}
}
