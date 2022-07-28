package conditionalStatement;

import java.util.Scanner;

/**
 * 백준 ) 
 * "45분 일찍 알람설정하기" 
 * 원래 설정되어 있는 알람을 
 * 45분 앞서는 시간으로 바꾸시오.
 * 
 * @author shn81
 *
 */
public class EarlyAlarmClock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (0 <= H && H <= 23 && 0 <= M && M <= 59) {
			if (M < 45) {
				if (H == 0) {
					System.out.print("23 ");
					System.out.print(M + 60 - 45);
				} else {
					System.out.print(H - 1 + " ");
					System.out.print(M + 60 - 45);
				}
			} else if (M >= 45) {
				System.out.print(H + " ");
				System.err.print(M - 45);
			}
		}
	}

}
