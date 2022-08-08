package io;

import java.util.Scanner;

/**
 * 백준 ) 세자리 수 X 세자리 수의 반올림하는 
 * 과정을 출력하는 프로그램을 작성하시오.
 * 
 * @author shn81
 *
 */

public class RoundsProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if(A >= 100 && 1000 > A && B >= 100 && 1000 > B) {
			System.out.println(((A%10)*(B%10))+((((A%100)/10)*10)*(B%10))+
					((A/100)*100)*(B%10));
			System.out.println(((A%10)*((B%100)/10))+((((A%100)/10)*10)*((B%100)/10))+
					((A/100)*100)*((B%100)/10));
			System.out.println(((A%10)*(B/100))+((((A%100)/10)*10)*(B/100))+
					(((A/100)*100)*(B/100)));
			System.out.println(A*B);
		}
	}
}
