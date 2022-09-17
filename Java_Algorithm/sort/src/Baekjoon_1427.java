package sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 ) 소트인사이드
 * 수가 주어지면,
 * 그 수의 각 자리수를 내림차순으로 정렬하자.
 * @author 김한수
 *
 */
public class Baekjoon_1427 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.next();
		char[] array = new char[num.length()];
		for(int i = 0; i < num.length(); i++) {
			array[i] = num.charAt(i);
		}
		Arrays.sort(array);
		StringBuilder sb = new StringBuilder();
		for(int i = array.length - 1; i >= 0; i--) {
			sb.append(array[i]);
		}
		System.out.println(sb);
	}
}
