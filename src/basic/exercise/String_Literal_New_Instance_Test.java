package basic.exercise;

public class String_Literal_New_Instance_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str1 = new String("hello");
//		String str2 = "hello";
//		
//		if(str1 == str2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
		String a = "apple";
        String b =  a;

        String c = new String("apple");
        String d = new String("apple");

        System.out.println(a.hashCode()); // 93029210
        System.out.println(b.hashCode()); // 93029210
        System.out.println("------------");
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
	}

}
