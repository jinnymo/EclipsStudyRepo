package basic.ch17;


//a클라스를 선임이 작성한 코드라고 가정
public class A {

	String name;
	int height;
	int weight;
	int age;
	
	
	
}

//단. 하나의 자바 파일안에 여러개의 클래스를 작성할 수 있다.
//단, public 클래스는 오직 하나만 정의 가능하다.
//복사 붙여 넣기도 가능
	
class B {

	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nickName;
	
}

//상속이라는 문법을 배웠으면
class C extends A {
	
	int level;
	String nickName;
	String phone;
	
	
}