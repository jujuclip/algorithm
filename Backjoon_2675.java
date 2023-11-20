package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Backjoon_2675 {

	public static void main(String[] args) throws IOException {

//		문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
//		즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
//
//		QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8),
//		문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
//
//		출력
//		각 테스트 케이스에 대해 P를 출력한다.

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine());
//		
//		br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int cIndex = 0;
//		int rCount = 0;
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		for(int i=0; i<t; i++) {	
//			int r = Integer.parseInt(st.nextToken());
//			String s = st.nextToken();			
//			
//			for(int j=0; j<s.length(); j++) {
//				while(rCount < r) {
//					System.out.print(s.charAt(cIndex));
//					rCount++;
//				}
//				cIndex++;
//				rCount=0;
//			}
//		}
//		br.close();
//		
//	}
//}

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int rCount = 0;

		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				while (rCount < r) {
					System.out.print(s.charAt(j));
					rCount++;
				}
				rCount = 0;
			}
			System.out.println();
		}
	}
}
