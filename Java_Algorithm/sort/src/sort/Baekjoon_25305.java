package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 ) 커트라인
 * n명의 학생 중, 점수가 가장 높은 
 * k명은 상을 받는다.
 * 이 때, 상을 받는 커트라인 점수를 구하여라.
 * @author 김한수
 *
 */
public class Baekjoon_25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[arr.length - k]);
	}
}
