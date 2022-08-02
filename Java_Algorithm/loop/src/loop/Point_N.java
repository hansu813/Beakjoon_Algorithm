package loop;

import java.util.Scanner;

/**
 * 백준 )
 * 자연수 N이 주어졌을 때, N부터 1까지
 * 한 줄에 하나 씩 출력하는 프로그램을 
 * 작성하시오
 * @author 김한수
 *
 */
public class Point_N {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0) {
			System.out.println(n);
			n--;
		}
	}

}
