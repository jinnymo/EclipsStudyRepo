package IO.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFinder {

	public static void main(String[] args) {

		String fileName = "article.txt";

		try (FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {

			// 단어 빈도를 저장하기 위한 HashMap 생성
			Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");

				// 분리된 단어들을 반복 처리

				for (String word : words) {
					System.out.println("word :" + word);

					// 빈 문자열이 아닐 경우에만 처리
					if (!word.isEmpty()) {
						// getOrDefault - 분리한 word 단어가 이미 map 구조에 존재한다면
						// 기존 값을 가져오고 없다면 0을 반환함
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
					}
				}
			}// end of while
			String mostCommon = null;
			int maxCount = 0;
			
			for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				if (entry.getValue() > maxCount) {
					mostCommon = entry.getKey();
					maxCount = entry.getValue();
				}
			}
			System.out.println("가장 만이 사용된 단어 : " + mostCommon +" , " + maxCount +" 회");

		} catch (Exception e) {
			// TODO: handle exception
		}

		// 1. 공백 기준으로 단어를 짤라서 어딘가 보관
		// 문자열을 공백지누으로 다룰수 있는 기능이 존재 하는가?? -> 문서, 구글
		String line = "";
		String[] word = line.split("\\s");

		// 2. 단어 빈도를 저장하기 위한 변수를 사용(자료구조)

	}// end of main

}// end of class
