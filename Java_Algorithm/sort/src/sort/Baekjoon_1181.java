package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 ) 단어 정렬
 * 알파벳 소문자로 이루어진
 * n개의 단어가 들어오면 
 * 아래와 같은 조건에 따라 정렬하는 프로그램
 * 1. 길이가 짧은 것 부터
 * 2. 길이가 같으면 사전순으로
 * @author 김한수
 *
 */
public class Baekjoon_1181 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] words = new String[n];
		in.nextLine();
		for(int i = 0; i < n; i++) {
			words[i] = in.nextLine();
		}
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		System.out.println(words[0]);
		for(int i = 1; i < n; i++) {
			if(!words[i].equals(words[i-1])) {
				System.out.println(words[i]);
			}
		}
		in.close();
	}
}
