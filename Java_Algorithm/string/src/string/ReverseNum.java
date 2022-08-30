package string;

import java.util.Scanner;

/**
 * 백준 ) 상수
 * 두 개의 수를 입력 받고,
 * 각 수를 뒤집어 크기를 비교하는 프로그램.
 * @author 김한수
 *
 */
public class ReverseNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		in.close();
		String reverseA = "";
		String reverseB = "";
		for(int i = 2; i >= 0; i--) {
			reverseA += a.charAt(i);
			reverseB += b.charAt(i);
		}
		int numA = Integer.parseInt(reverseA);
		int numB = Integer.parseInt(reverseB);
		System.out.println(numA > numB ? numA : numB);
	}
}
