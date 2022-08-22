package string;

import java.util.Scanner;

/**
 * 백준 ) 숫자의 합
 * N개의 숫자가 공백 없이 쓰여있다.
 * 이 숫자를 모두 합해서 출력하는 프로그램
 * @author 김한수
 *
 */
public class SumNum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int sum = 0;
		String num = in.next();
		in.close();
		for(int i = 0; i < count; i++) {
			sum += Character.getNumericValue(num.charAt(i));
		}
		System.out.println(sum);
	}

}
