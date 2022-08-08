package io;

import java.util.Scanner;

/**
 * 백준 ) 두 정수 A와 B를 입력받은 다음, 
 * A X B를 출력하는 프로그램 작성
 * 
 * @author 김한수
 *
 */
public class AxB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if (0 < A && B < 10) {
			System.out.println(A * B);
		}

	}

}
