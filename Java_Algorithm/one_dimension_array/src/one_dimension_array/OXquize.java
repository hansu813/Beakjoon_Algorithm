package one_dimension_array;

import java.util.Scanner;

/**
 * 백준 ) OX 퀴즈의 결과가 있다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 점수를 구하는 프로그램
 * 
 * @author 김한수
 *
 */
public class OXquize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] array = new String[in.nextInt()];
		for(int i = 0; i < array.length; i++) {
			array[i] = in.next();
		}
		in.close();
		for(int i = 0; i < array.length; i++) {
			int count = 0;
			int sum = 0;
			for (int j = 0; j < array[i].length(); j++) {
				if(array[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}

}
