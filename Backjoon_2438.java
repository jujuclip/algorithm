package algorithm;

import java.util.Scanner;

public class Backjoon_2438 {

	public static void main(String[] args) {
		
		
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//		출력
//		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "*";
		
		for(int i=0; i<n; i++) {
			System.out.println(s);
			s+="*";
		}
		
		
	}

}
