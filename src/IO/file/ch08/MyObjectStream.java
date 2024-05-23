package IO.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class MyObjectStream {

	public static void main(String[] args) {
		Person[] persons = new Person[4];
		//직렬화된 객체 파일로 뺴기
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
			
			persons[0] = new Person("지니1", 12);
			persons[1] = new Person("지니2", 32);
			persons[2] = new Person("지니3", 542);
			persons[3] = new Person("지니4", 32);
			
		//	Person person = new Person("손흥민", 30);
			for (int i = 0; i < persons.length; i++) {
				oos.writeObject(persons[i]);
			}
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("--------------------------");
		
		//객체 역직렬화
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){
			//문자 기반 데이터를 읽으면 <-- 스트링값 추출해서 코드상에 활용할 수 있도록 object
			//만드는 코딩을 해야 한다.
			
			
			for (Person person : persons) {
			Person person1 = (Person)ois.readObject();
			System.out.println(person);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
