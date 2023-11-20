package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Backjoon_1157 {

	public static void main(String[] args) throws IOException {

//		알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//		입력
//		첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//		출력
//		첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().toUpperCase();

		Map<Character, Integer> cMap = new HashMap<>();

		Character ans = null;
		int ansCount = 0;
		boolean dupli = false;
		
		for (int i = 0; i < s.length(); i++) {
		    char currentChar = s.charAt(i);
		    cMap.put(currentChar, cMap.getOrDefault(currentChar, 0) + 1);
		    
		    int nowCount = cMap.get(currentChar);
		    if(nowCount >= ansCount) {
		    	if(nowCount == ansCount) {
		    		dupli = true;
		    	} else {
		    		dupli = false;
		    	}
		    	
		    	ansCount = nowCount;
		    	ans = currentChar;
		    }
		}
		
		if(dupli) System.out.print("?");
		else System.out.print(ans);

	}}

//	static Scanner sc = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		String inputString = sc.nextLine().toUpperCase();
//		Map<Character, Integer> cMap = new HashMap<>();
//
//		int ansCnt = 0;
//		Character ans = null;
//		boolean isDupli = false;
//		for (int i = 0; i < inputString.length(); i++) {
//			Character nowChar = inputString.charAt(i);
//			cMap.putIfAbsent(nowChar, 0);
//			cMap.put(nowChar, cMap.get(nowChar) + 1);
//
//			int nowCount = cMap.get(nowChar);
//			if (nowCount >= ansCnt) {
//				if (nowCount == ansCnt) {
//					isDupli = true;
//				} else {
//					isDupli = false;
//
//				}
//				ansCnt = nowCount;
//				ans = nowChar;
//			}
//		}
//
//		if (isDupli) {
//			System.out.println("?");
//		} else {
//			System.out.println(ans);
//		}
//
//	}
//
//}
