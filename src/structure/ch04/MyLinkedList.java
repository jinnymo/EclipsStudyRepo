package structure.ch04;

public class MyLinkedList {

	private Node head;// 노드의 맨 처음을 가리킴
	private int count;// 링크드 리스트의 노드 카운터

	public MyLinkedList() {
		head = null;
		count = 0;

	}

	// 저장된 노드 갯수를 반환하는 메서드
	public int getCount() {
		return count;
	}

	// 새로운 노드를 1개 추가하는 메서드를 만들자.
	public Node addElement(String data) {
		Node createNode = new Node(data);
		if (head == null) {
			head = createNode;
		} else {
			Node preNode = head;
			while (preNode.next != null) {
				preNode = preNode.next;
			}
			preNode.next = createNode;
		}
		count++;
		return createNode;
	}

	public Node removeElement(int index) {
		// 방어적 코드
		if (index >= count) {
			System.out.println("삭제할 위치오류 현재 리스트 개수는 = " + count);
			return null;
		}
		// 맨 앞 삭제 요청시
		// 항상 요소를 찾을때 시작은 head 부터
		Node tempNode = head;
		if (index == 0) {
			head = tempNode.next;

		} else {
			Node preNode = null;
			for (int i = 0; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
			
		}
		count--;
		System.out.println(index+" 번쨰 요소 삭제함");
		return tempNode;
	}
	
	//전체 출력 기능
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용 없음");
			return;
		}
		Node temp = head;
		temp.getData();
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print("-->");
			}
		}
		
		
	}
	public Node getNodeByIndex(int index) {
		if (index >= count) {
			System.out.println("잘못된 인덱스 값 요청");
			return null;
		}
		Node tempNode = head;
		if (index ==0) {
			return head;
		}
		for (int i = 0; i < index; i++) {
			tempNode = tempNode.next;
		}
		return	tempNode;
	}
	public void removeAll() {
		head = null;
		count = 0;
	}

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addElement("가");
		linkedList.addElement("나");
		linkedList.addElement("다");
		linkedList.addElement("라");
		//System.out.println(linkedList.getCount());
		linkedList.printAll();
		linkedList.removeElement(2);
		linkedList.printAll();
		linkedList.addElement("마");
		System.out.println();
		linkedList.printAll();
		System.out.println(linkedList.getNodeByIndex(0).getData());
		linkedList.removeAll();
		linkedList.printAll();
	}

}
