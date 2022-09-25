package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 ) 좌표 정렬하기 2 2차원 평면 위의 점 n개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가흐는
 * 순으로 정렬하는 프로그램
 * 
 * @author 김한수
 *
 */
public class Baekjoon_11651 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			arr[i][1] = in.nextInt();
			arr[i][0] = in.nextInt();			
		}
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
		}
		System.out.println(sb);
		in.close();
	}
}
