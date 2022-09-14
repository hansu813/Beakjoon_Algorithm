package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 ) 수 정렬하기
 * N개의 수가 주어졌을 때,
 * 이를 오름차 순으로 정렬하는 프로그램
 * @author 김한수
 *
 */
public class Baekjoon_2750 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
