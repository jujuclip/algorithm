package algorithm;

import java.util.Scanner;

public class Backjoon_11382 {

	public static void main(String[] args) {
		/*
		 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다! 첫 번째 줄에 A, B, C (1
		 * ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
		 */
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		System.out.println(a+b+c);
	}

}
