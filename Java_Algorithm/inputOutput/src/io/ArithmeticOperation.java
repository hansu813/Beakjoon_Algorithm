package io;

import java.util.Scanner;
/**
 * 백준 ) 두 자연수 A, B가 주어진다. 이때, A+B, A-B, A*B, 
 * A/B, A%B를 출력하는 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (1 <= A && B <= 10000) {
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);			
			System.out.println(A / B);
			System.out.println(A % B);
		}
	}

}
