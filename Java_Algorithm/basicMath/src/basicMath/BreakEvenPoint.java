package basicMath;

import java.util.Scanner;

/**
 * 백준 ) 손익분기점
 * A( 고정 비용 ), B( 가변 비용 ), C( 책정된 가격 )가 
 * 주어졌을 때, 손익분기점( 판매 비용 > 고정비용 + 가변비용 )
 * 을 구하는 프로그램
 * @author 김한수
 *
 */
public class BreakEvenPoint {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		if (c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a / (c - b)) + 1);
		}
	}
}
