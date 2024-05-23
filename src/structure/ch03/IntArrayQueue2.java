package structure.ch03;

public class IntArrayQueue2 {

	private int[] array;
	private int front;// 큐의 시작점
	private int rear;// 큐의 끝지점
	private int capacity; // 큐의 용량
	private int size;// 요소의 개수

	public IntArrayQueue2(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	// 편의 기능 만들어보기
	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	// todo - 데이터 넣기
	public void enqueue(int item) {
		
			//나머지 연산자를 활용한다.(순환구조)
			//1=1%5; 몫 0, 나머지1
			//2=2%5; 몫 0, 나머지2
			//					3(임시값)
			//0 = 	-1	+1	%	3 
			//1 = 	 0	+1	%	3 
			//2 = 	 1	+1	%	3 
			//0 = 	 2	+1	%	3 
		
			rear = (rear +1)%capacity;
			array[rear] = item;
			size++;
		
	}

	// todo - 데이터 꺼내기
	public int dequeue() {
		if(isEmpty()) {
			return -999999;
		}
		int item = array[front];
		//[10][20][30]
		front = (front +1)%capacity;
		return item;
	}

	// todo - 데이터 찾기(peek)
	public int peek() {
		if(isEmpty()) {
			System.out.println("큐 메모리 공간에 요소가 없습니다.");
			return -99999;
		}else {
			return array[front];
		}
		
	}
	public void printAll() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

		IntArrayQueue2 queue = new IntArrayQueue2(3);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);// 사이즈 초과로 안들어가짐
		queue.enqueue(500);// 사이즈 초과로 안들어가짐

		queue.printAll();
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	}
}
