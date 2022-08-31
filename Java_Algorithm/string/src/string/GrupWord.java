package string;

import java.util.Scanner;

/**
 * 백준 ) 그룹 단어 체커
 * 단어에 존재하는 모든 문자에 대해서,
 * 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 단어 N개를 입력 받아 그룹 단어의 개수를 출력하는
 * 프로그램
 * @author 김한수
 *
 */
public class GrupWord {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0;
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			if(prev != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			}
			else {
				continue;
			}
		}
		return true;
	}
}
