package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Backjoon_2588 {
	public static void main(String[] args) throws IOException{
		
//		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
		
//		int c = b;
//
//		List<Integer> blist = new ArrayList<>(); 
//		
//		while(b > 0) {
//			blist.add(b % 10);
//		    b /= 10;
//		}
//		int d = blist.get(0);
//		int e = blist.get(1);
//		int f = blist.get(2);
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (b % 10) * a;
		int d = ((b % 100) / 10) * a;
		int e = (b / 100) * a;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a * b);

		
	}
}
