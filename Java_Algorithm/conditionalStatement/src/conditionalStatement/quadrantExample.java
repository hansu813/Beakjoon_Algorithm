package conditionalStatement;

import java.util.Scanner;

/**
 * 백준 ) 해당 좌표가 어디 사분면에 
 * 해당하는지 알려주는 프로그램을 
 * 작성하시오.
 * 
 * @author 김한수
 */
public class quadrantExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if (-1000 <= x && x <= 1000 && x != 0 && -1000 <= y && y <= 1000 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("1");
			} else if (x < 0 && y > 0) {
				System.out.println("2");
			} else if (x < 0 && y < 0) {
				System.out.println("3");
			} else if (x > 0 && y < 0) {
				System.out.println("4");
			}
		}
	}

}
