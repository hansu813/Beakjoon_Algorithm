package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 백준 ) 좌표 정렬하기
 * 좌표를 x좌표가 증가하는 순으로,
 * x 좌표가 같다면 y좌표가 증하는 순서로
 * 정렬하는 프로그램
 * @author 김한수
 *
 */
public class Baekjoon_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Integer arr[][] = new Integer[N][2];

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[0].equals(o2[0])) {
					return o1[1] - o2[1];
				}
				else {
					return o1[0] - o2[0];
				}
			}
		});	

		for(int i=0; i<N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}

		System.out.println(sb);
	}
}
