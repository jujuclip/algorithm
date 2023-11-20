package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Backjoon_27866 {

	public static void main(String[] args) throws IOException {
		
//		단어 
//		$S$와 정수 
//		$i$가 주어졌을 때, 
//		$S$의 
//		$i$번째 글자를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 
//		$S$가 주어진다. 단어의 길이는 최대 
//		$1\,000$이다.
//
//		둘째 줄에 정수 
//		$i$가 주어진다. (
//		$1 \le i \le \left|S\right|$)
//
//		출력
//		 
//		$S$의 
//		$i$번째 글자를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int a = Integer.parseInt(br.readLine());
		
//		char[] c = S.toCharArray();
		
		System.out.println(S.charAt(a-1));
	}

}
