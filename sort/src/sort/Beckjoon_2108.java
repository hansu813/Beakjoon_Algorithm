package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 ) 통계학
 * 산술평균, 중앙값, 최빈값, 범위
 * 네 가지 기본 통계값을 구하는
 * 프로그램
 * @author 김한수
 *
 */
public class Beckjoon_2108 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		int count = 0;
		int max = -1;
		int mod = arr[0];
		boolean check = false;
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				count++;
			}else {
				count = 0;
			}
			if(max < count) {
				max = count;
				mod = arr[i];
				check = true;
			} else if(max == count && check == true) {
				mod = arr[i];
				check = false;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(Math.round(sum / n)).append('\n')
		.append(arr[(n - 1) / 2]).append('\n')
		.append(mod).append('\n')
		.append(arr[n - 1] - arr[0]);
		System.out.println(sb);
	}
}
