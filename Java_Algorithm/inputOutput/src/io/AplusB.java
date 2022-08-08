package io;

import java.util.Scanner;

/**
 * 백준 ) 두 수를 입력받아서 A + B를 출력하시오.(0 < A, B < 10)
 * @author 김한수
 *
 */
public class AplusB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(0 < A && B < 10) {
			System.out.println(A+B);
		}
	}
}
