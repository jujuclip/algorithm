package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_10451 {

	static int n;
	static boolean[] visited;
	static int[] numList;
	static int cycle;
	
	public static void main(String[] args) throws IOException {
	
//		1부터 N까지 정수 N개로 이루어진 순열을 나타내는 방법은 여러 가지가 있다. 예를 들어, 8개의 수로 이루어진 순열 (3, 2, 7, 8, 1, 4, 5, 6)을 배열을 이용해 표현하면  
//		 
//		( 1 2 3 4 5 6 7 8 ) 와 같다. 또는, Figure 1과 같이 방향 그래프로 나타낼 수도 있다.
//		(3 2 7 8 1 4 5 6 )
		
//		순열을 배열을 이용해  
//		 
//		( 1   ...  i  ...  n)  로 나타냈다면, i에서 πi로 간선을 이어 그래프로 만들 수 있다.
//		(π1 ... πi ... πn)
//		Figure 1에 나와있는 것 처럼, 순열 그래프 (3, 2, 7, 8, 1, 4, 5, 6) 에는 총 3개의 사이클이 있다. 이러한 사이클을 "순열 사이클" 이라고 한다.
//
//		N개의 정수로 이루어진 순열이 주어졌을 때, 순열 사이클의 개수를 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 순열의 크기 N (2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄에는 순열이 주어지며, 각 정수는 공백으로 구분되어 있다.
//
//		출력
//		각 테스트 케이스마다, 입력으로 주어진 순열에 존재하는 순열 사이클의 개수를 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
				
		for(int i=0; i<t; i++) {
			cycle = 0;
			n = Integer.parseInt(br.readLine());
			visited = new boolean[n+1];
			numList = new int[n+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				numList[j] = Integer.parseInt(st.nextToken());
			}
			for(int j=1; j<=n; j++) {
				if(!visited[j]) { 
					dfs(j);
					cycle++;
				}
			}
			System.out.println(cycle);
		}
	
	}
	
	static void dfs(int crt) {
			visited[crt] = true;
		
			int numListVal = numList[crt];
			if(!visited[numListVal]) dfs(numList[crt]);		
		
	}

}
