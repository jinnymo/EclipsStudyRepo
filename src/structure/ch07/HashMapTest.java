package structure.ch07;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	
	public static void main(String[] args) {
		
		
		//업캐스팅 된 상태이다.
		Map<String, String> books = new HashMap<String, String>();
		
		books.put("해리포터", "j.k롤링");
		books.put("반지의제왕", "j.r.r 톨킨");
		books.put("1984", "조지오웰");
		
		System.out.println(books.get("해리포터"));
		System.out.println(books.get("1984"));
		
		books.put("1984", "조조입니다.");
		System.out.println(books.get("1984"));
		
		books.remove("1984");
		System.out.println(books.get("1984"));

		//유용한 기능 확인
		//자료구조 map에 저장되어 있는 key 값들을 확인 하는 방법
		
		System.out.println(books.keySet());
		System.out.println("-------------------------");
		
		for (String string : books.keySet()) {
			System.out.println(books.get(string));
		}
		
		
		
		Iterator<java.util.Map.Entry<String, String>> iter = books.entrySet().iterator();
		
		while(iter.hasNext()) {
			java.util.Map.Entry<String, String> entry = iter.next();
			System.out.println("책 :"+entry.getKey()+" , "+"저자 : " +entry.getValue());
		}
		
		// 자료구조에서 제공하는 foreach 구문에 사용
		
		books.forEach((key,value)->{
			System.out.println("key :" +key);
			System.out.println("vlaue :" +value);
			
		});
		
		books.clear();
		System.out.println(books.size());
	}
}
