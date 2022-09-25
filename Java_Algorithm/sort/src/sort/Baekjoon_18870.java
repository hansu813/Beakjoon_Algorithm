package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 백준 ) 좌표 압축
 * 수직선 위에 n개의 좌표가 있다.
 * 이 좌표에 좌표 압축을 적용하자
 * Xn을 좌표 압축한 결과의 값은 Xi > Xj 를 
 * 만족하는 서로 다른 좌표의 개수와 같아야 한다.
 * 좌표 압축을 적용한 결과를 출력해보자
 * @author 김한수
 *
 */
public class Baekjoon_18870 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] origin = new int[n];
		int[] sorted = new int[n];
		HashMap<Integer, Integer> ranking = new HashMap<>();
		for(int i = 0; i < n; i++) {
			sorted[i] = origin[i] = in.nextInt();
		}
		Arrays.sort(sorted);
		int rank = 0;
		for(int v : sorted) {
			if(!ranking.containsKey(v)) {
				ranking.put(v, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int num = ranking.get(key);
			sb.append(num).append(' ');
		}
		System.out.println(sb);
		in.close();
	}
}
