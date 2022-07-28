package conditionalStatement;

import java.util.Scanner;

/**
 * 백준 ) "인공지능 오븐" 첫째 줄에는 현재 시각을 입력, 두번째 줄에는 요리하는데 필요한 시간을 입력한다. 종료되는 시각이 시와 분을
 * 공백을 사이에 두고 출력한다.
 * 
 * @author shn81
 *
 */
public class OvenExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int a = h*60 + m + n;
		h = a/60;
		m = a%60;
		
		if(h >= 24) {
			h = h-24;
		}
		System.out.println(h + " " + m);
		
	}
}
