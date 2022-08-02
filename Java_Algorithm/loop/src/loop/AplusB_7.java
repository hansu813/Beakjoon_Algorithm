package loop;

import java.util.Scanner;

/**
 * 백준 )
 * 두 정수 A와 B를 입력받은 다음, 
 * A + B를 출력하는 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class AplusB_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] sum = new int[t];
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a + b;
		}
		for(int i = 0; i < t; i++) {
			System.out.println("Case #" + (i+1) + ": " + sum[i]);
		}
	}

}
