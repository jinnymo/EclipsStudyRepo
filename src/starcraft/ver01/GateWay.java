package starcraft.ver01;

public class GateWay {

	private int gateWN;
	private int count;

	// 기능 - 질럿을 생산 하는 기능을 만들어 보세요

	public GateWay(int gateWN) {

		this.gateWN = gateWN;

	}

	public Zealot makeunits(String name) {
		count++;
		return new Zealot(name);
	}

	public int getCount() {
		return this.count;
	}

	public int getGateWN() {
		return this.gateWN;
	}

}
