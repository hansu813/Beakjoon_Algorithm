package one_dimension_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 )
 * N개의 정수가 주어진다.
 * 이때, 최솟값과 최대값을
 * 구하는 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class Max_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1000001;
		int min = 1000001;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a > max) {
				max = a;
			}
			if(a < min) {
				min = a;
			}
		}
		System.out.println(min + " " + max);
	}
}
