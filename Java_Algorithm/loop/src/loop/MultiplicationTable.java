package loop;

import java.util.Scanner;
/**
 * 백준 )
 * n을 입력받은 뒤, 구구단 n단을 출력하시오
 * @author 김한수
 *
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<9; i++) {
			System.out.println((n) + " * " + (i + 1) + " = " + n*(i+1));
		}
	}

}
