package one_dimension_array;

import java.util.Scanner;

/**
 * 백준 ) 
 * 대학생 새내기들의 90%는 
 * 자신이 반에서 평균은 넘는다고 
 * 생각한다. 그들에게 슬픈 진실을 
 * 알려줄 프로그램
 * 
 * @author 김한수
 *
 */
public class AboveAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array;
		int count = in.nextInt();
		for (int i = 0; i < count; i++) {
			int N = in.nextInt();
			array = new int[N];
			double sum = 0;
			for (int j = 0; j < N; j++) {
				int score = in.nextInt();
				array[j] = score;
				sum += score;
			}
			double stuCount = 0;
			for (int j = 0; j < N; j++) {
				if (array[j] > (sum / N)) {
					stuCount++;
				}
			}
			System.out.printf("%.3f%%\n", (stuCount / N) * 100);
		}
		in.close();
	}
}
