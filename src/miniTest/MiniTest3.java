package miniTest;

public class MiniTest3 {

	public static void main(String[] args) {

		int[] array1 = new int[] { 101, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
		int biggerNum = 0;
		int smallerNum = array1[0];
		int maxPos =0;
		int minPos =0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > biggerNum) {
				biggerNum = array1[i];
				maxPos = i;
			}
			if(array1[i] < smallerNum) {
				smallerNum = array1[i];
				minPos = i;
			}
			
		}
		System.out.println("가장 큰 값은 " + biggerNum + "이고, 위치는 " + (maxPos+1) + "번째 입니다.");
		System.out.println("가장 작은 값은 " + smallerNum + "이고, 위치는 " + (minPos+1) + "번째 입니다.");
	}

}
