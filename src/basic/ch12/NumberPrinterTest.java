package basic.ch12;

public class NumberPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberPrinter n1 = new NumberPrinter(1);//왼쪽 기기
		NumberPrinter n2 = new NumberPrinter(2);//오른쪽기기
		n1.printWaitNumber();//고객1 
		n1.printWaitNumber();//고객2 
		n1.printWaitNumber();//고객3 
		n1.printWaitNumber();//고객4
	
		
		n2.printWaitNumber();//고객5
		n2.printWaitNumber();//고객6
		n2.printWaitNumber();//고객7
		n2.printWaitNumber();//고객8
	
	}

}
