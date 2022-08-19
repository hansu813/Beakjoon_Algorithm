package loop;

import java.util.Scanner;

/**
 * 백준 )
 * 영수증을 보며 정확하게 계산된 것인지
 * 확인하는 프로그램
 * @author 김한수
 *
 */
public class receipts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long money, a, sum = 0;
		int num, b;
		money = sc.nextLong();
		num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			a = sc.nextLong();
			b = sc.nextInt();
			sum += a * b;
		}
		System.out.println(money == sum ? "Yes" : "No");
	}

}
