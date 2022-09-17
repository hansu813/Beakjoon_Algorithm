package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 백준 ) 수 정렬하기 3
 * n개의 수가 주어졌을 때,
 * 이를 오름차순으로 정렬하는
 * 프로그램
 * @author 김한수
 *
 */
public class Baekjoon_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i = 0; i < N; i++){
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
	}
}
