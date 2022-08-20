package one_dimension_array;

import java.util.Scanner;
/**
 * 백준 )
 * 9개의 서로 다른 자연수가 주어질 때,
 * 이들 중 최댓 값을 찾고 그 최댓 값이
 * 몇 번째 수인지를 구하는 프로그램
 * @author 김한수
 *
 */
public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
		              sc.nextInt(), sc.nextInt(), sc.nextInt(),
		              sc.nextInt(), sc.nextInt(), sc.nextInt() };
		int max = 0;
		int count = 0;
		int index = 0;
		for (int i : arr) {
			count++;
			if(i > max) {
				max = i;
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}

}
