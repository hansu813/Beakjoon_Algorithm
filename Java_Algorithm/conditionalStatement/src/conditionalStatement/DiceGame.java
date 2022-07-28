package conditionalStatement;

import java.util.Scanner;

/**
 * 주사위를 3개 던져 상금을 받는 게임 같은 눈 3개면 10,000원 + (같은 눈) X 1,000원 같은 눈 2개면 1,000원 + (같은
 * 눈) X 100원 모두 다른 눈이면 (가장 큰 눈 ) X 100원
 * 
 * @author 김한수
 *
 */
public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b && a == c && b == c) {
			System.out.print(10000 + (a * 1000));
		} else if (a == b || a == c) {
			System.out.print(1000 + (a * 100));
		} else if (b == c) {
			System.out.print(1000 + (b * 100));
		} else {
			System.out.print((Math.max(a, Math.max(b, c)) * 100));
		}
	}
}
