package structure.ch03;

public class IntArrayQueue {

	private int[] array;
	private int front;// 큐의 시작점
	private int rear;// 큐의 끝지점
	private int capacity; // 큐의 용량
	private int size;// 요소의 개수

	public IntArrayQueue(int capacity) {
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
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득참");
		} else {
			rear++;// 0 <-- 첫동작시
			array[rear] = item;
			size++;
		}
	}

	// todo - 데이터 꺼내기
	public int dequeue() {
		int item = -999999;
		if (isEmpty()) {
			System.out.println("큐 메모리 공간이 비었습니다.");
		} else {
			item = array[front];
			for (int i = front; i < rear; i++) {
				array[i] = array[i + 1];
			}
			array[rear] = 0;
			rear--;
			size--;
		}
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
	
	
	
	public static void main(String[] args) {

		IntArrayQueue queue = new IntArrayQueue(3);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);// 사이즈 초과로 안들어가짐

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());
		//System.out.println(queue.dequeue());
		
		// queue.dequeue();//인덱스 0삭제//삭제이후 앞으로 땡김
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}
