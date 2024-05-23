package IO.file.ch08;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyDataStream {

	public static void main(String[] args) {

		
		//파일에 사용 --> fileOutputStream("대상파일이름");
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.txt"))){
			dos.writeInt(101);//학번
			dos.writeInt(102);//학번
			dos.writeUTF("홍길동");
			dos.writeDouble(3.5);//학점
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(">>> 데이터 쓰기 완료 (원시 타입) <<<");
		
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("student.txt"))){
			int id = dis.readInt();
			int id2 = dis.readInt();
			String name = dis.readUTF();
			double score = dis.readDouble();
			
			System.out.println(id);
			System.out.println(id2);
			System.out.println(name);
			System.out.println(score);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터 읽기 완료(기본 데이터 타입)");
	}

}
