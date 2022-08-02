package loop;

import java.util.Scanner;

/**
 * 백준 ) 
 * 두 정수 A,B를 입력받은 뒤, 
 * A + B를 출력 T로 케이스의 
 * 개수 입력
 * 
 * @author 김한수
 *
 */
public class AplusB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] sum = new int[t];
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a + b;
		}
		for (int i : sum) {
			System.out.println(i);
		}
	}
}
