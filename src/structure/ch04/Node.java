package structure.ch04;

public class Node {

	private String data;
	//자기 참조 관계
	//정의 : 자기 참조는 객체가 자신과 같은 타입의 다른객체를
	//가르키는 경우
	//용도 : 연결 리스트, 트리구조에 많이 활용
	public Node next;
	
	public Node() {
		data = null;
		next = null;
	}
	public Node(String data) {
		this.data = data;
		next = null;
	}
	public Node(String data, Node link) {
		this.data = data;
		this.next = link;
	}
	public String getData() {
		return  data;
	}
}
