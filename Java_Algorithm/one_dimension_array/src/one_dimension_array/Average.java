package one_dimension_array;

import java.util.Scanner;
/**
 * 백준 )
 * 자기 점수 중에 최댓 값을 골라서 모든 점수를
 * 최댓 값으로 나누고 100을 곱하여
 * 새로운 평균을 구하는 프로그램.
 * @author 김한수
 *
 */
public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[in.nextInt()];
		double sum = 0;
		int max = 0;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextInt();
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			sum += (numbers[i]+0.0) / max * 100;
		}
		System.out.println(sum/numbers.length);
	}

}
