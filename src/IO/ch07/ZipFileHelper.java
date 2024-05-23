package IO.ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileHelper {

	// 파일을 압축하는 기능 - zip

	public static void zipFile(String filetoZip, String zipfileName) {
		try (// 기반 스트림
				FileInputStream fis = new FileInputStream(filetoZip);
				// 보조 스트림
				ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipfileName))) {

			//zipentry 객체는 압축파일 내에서 개별 파일을 나타냅니다.
			ZipEntry zipEntry = new ZipEntry(filetoZip);
			zos.putNextEntry(zipEntry);
			
			//파일내용을 읽고 zip 파일에 쓰기위한 버퍼 생성
			byte[] bytes = new byte[1024];
			int length;
			
			while((length = fis.read(bytes)) >= 0 ) {
				zos.write(bytes);
			}
			
			zos.closeEntry();
			
			System.out.println("압축 파일 생성 완료 : "+ zipfileName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("압축 파일 생성 오류 발생 ");
		}
	}

	public static void main(String[] args) {
		
		ZipFileHelper.zipFile("NewYork.txt", "zipNewYork.zip");

	}

}
