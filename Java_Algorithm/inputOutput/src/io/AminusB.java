package io;

import java.util.Scanner;
/**
 * 백준 ) A와 B를 입력받아서 두 수의 차를 출력하시오.( 0<A, B<10 )
 * @author 김한수
 *
 */
public class AminusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if (0 < A && B < 10) {
			System.out.println(A - B);
		}
	}
}
