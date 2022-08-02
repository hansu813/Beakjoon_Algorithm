package loop;

import java.util.Scanner;
/**
 * 백준 )
 * 첫째 줄에는 별 1개,
 * 둘째 줄에는 별 2개,
 * n번째 줄에는 별 n개를 찍는 문제
 * @author shn81
 *
 */
public class StarPoint_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
