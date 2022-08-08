package io;

import java.util.Scanner;

/**
 * 백준 )
 * (A+B)%C는 ((A%C)+(B%C))%C와 같을까?
 * (AxB)%C는 ((A%C)x(B%C)%C와 같을까?
 * 세 수 A,B,C가 주어졌을 때, 위의 네가지 값을 구하는 
 * 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class SameTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(2 <= A && A <= 10000 && 2 <= B && B <= 10000 && 2 <= C && C <= 10000) {
			System.out.println((A + B) % C);
			System.out.println(((A % C) + (B % C)) % C);
			System.out.println((A * B) % C);
			System.out.println(((A % C) * (B % C)) % C);
		}
	}

}
