package loop;

import java.util.Scanner;

/**
 * 백준 )
 * 두 정수 A와 B를 입력받은 다음,
 * A + B를 출력하는 프로그램을 
 * 작성하시오.
 * @author 김한수
 *
 */
public class AplusB_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		int b[] = new int[t];
		int sum[] = new int[t];
		for(int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			sum[i] = a[i] + b[i];
		}
		for(int i = 0; i < t; i++) {
			System.out.println("Case #" + (i+1) + ": " + a[i] + " + " + b[i] + " = " + sum[i]);
		}
	}

}
