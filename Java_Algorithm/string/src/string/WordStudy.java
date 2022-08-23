package string;

import java.util.Scanner;

/**
 * 백준 ) 단어 공부
 * 알파벳 대소문자로 된 단어가 주어지면,
 * 이 단어에서 가장 많이 사용된 알파벳이
 * 무엇인지 알아내는 프로그램
 * (단, 대소문자 구분 X )
 * @author 김한수
 *
 */
public class WordStudy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next().toUpperCase();
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] count = new int[26];
		in.close();
		for(int i = 0; i < alpha.length(); i++) {
			for(int j = 0; j < word.length(); j++) {
				if(alpha.charAt(i) == word.charAt(j)) {
					count[i]++;
				}
			}
		}
		int max = 0;
		char target = 0;
		for(int i = 0; i < alpha.length(); i++) {
			if(count[i] > max) {
				max = count[i];
				target = alpha.charAt(i);
			} else if (count[i] == max) {
				target = '?';
			}
		}
		System.out.println(target);
	}
}
