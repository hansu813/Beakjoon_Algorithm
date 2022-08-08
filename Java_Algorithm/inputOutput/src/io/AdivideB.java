package io;

import java.util.Scanner;
/**
 * 백준 ) 두 정수 A와 B를 입력받은 다음, 
 * A/B를 출력하는 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class AdivideB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (0 < A && B < 10) {
			System.out.println(A / ( B + 0.0 ));
		}
	}

}
