package conditionalStatement;

import java.util.Scanner;

/**
 * 백준 ) 
 * 연도가 주어졌을 때, 윤년이면 1, 
 * 아니면 0을 출력하는 프로그램을 
 * 작성하시오.
 * 
 * @author 김한수
 *
 */
public class YunnyeonExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int y = scanner.nextInt();

		if (y >= 1 && y <= 4000) {
			if (y % 400 == 0) {
				System.out.println("1");
			} else if (y % 100 == 0) {
				System.out.println("0");
			} else if (y % 4 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

}
