package conditionalStatement;

import java.util.Scanner;
/**
 * 백준 )
 * 두 정수 A와 B가 주어졌을 때,
 * A와 B를 비교하는 프로그램을
 * 작성하시오.
 * @author 김한수
 *
 */

public class AcompareB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if(-10000 <= A && A <= 10000 && -10000 <= B && B <= 10000 ) {
			if(A < B) System.out.println("<");
			else if(A > B) System.out.println(">");
			else if(A == B) System.out.println("==");
		}
	}

}
