package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Backjoon_10974 {

	static boolean[] visited;
	static int[] numList;
	static int n;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
	
//		N이 주어졌을 때, 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 8)이 주어진다. 
//
//		출력
//		첫째 줄부터 N!개의 줄에 걸쳐서 모든 순열을 사전순으로 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		numList = new int[n];
		visited = new boolean[n];
		
		Func(0);
		System.out.println(sb.toString());
		
	}
	
	static void Func(int depth) {
		if(depth == n) {
			for(int i=0; i<n; i++)
				sb.append(numList[i] + " ");
			
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i]) {
				System.out.println("continue " + i);
				continue;
			}
						
			numList[depth] = i + 1;
			visited[i] = true;
			System.out.println("true i = " + i + " numList = " + numList[0] + numList[1] + numList[2] + "  depth = " + depth);
			
			try {				
				Thread.sleep(500);
				Func(depth + 1);
				visited[i] = false;
				System.out.println("false i = " + i);
				Thread.sleep(500);
				
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}