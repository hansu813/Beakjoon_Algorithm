package string;

import java.util.Scanner;

/**
 * 백준 ) 다이얼 전화기
 * 숫자 1을 걸려면 총 2초가 필요하다.
 * 1보다 큰 수를 거는 시간은 이보다 더 걸리며,
 * 한 칸 옆에 있는 숫자를 걸기 위해선 1초 씩 더 걸린다.
 * 최소 시간을 구하는 프로그램
 * @author 김한수
 *
 */
public class DialPhone {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next().toUpperCase();
		in.close();
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int sum = 0;
		for(int i = 0; i < word.length(); i++) {
			for (int j = 0; j < alpha.length(); j++) {
				if(word.charAt(i) == alpha.charAt(j)) {
					if(j < 3) sum += 3;
					else if(j < 6) sum += 4;
					else if(j < 9) sum += 5;
					else if(j < 12) sum += 6;
					else if(j < 15) sum += 7;
					else if(j < 19) sum += 8;
					else if(j < 22) sum += 9;
					else if(j < 26) sum += 10;
				}
			}
		}
		System.out.println(sum);
	}
}
