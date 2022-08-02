package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 백준 )
 * BufferedReader를 
 * 사용해서 빠른 동작을 
 * 진행하시오.
 * 케이스 개수 T가 주어진다. 
 * T줄에 각각 두 정수 A와 B를 더하시오.
 * @author shn81
 *
 */
public class FastAplusB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();

		System.out.println(sb);
	}

}
