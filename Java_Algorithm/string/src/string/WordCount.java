package string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 백준 ) 단어의 개수
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
 * 이 문자열에는 몇 개에 단어가 있을지 구하는 프로그램
 * @author 김한수
 *
 */
public class WordCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		in.close();
		StringTokenizer st = new StringTokenizer(sentence, " ");
		System.out.println(st.countTokens());
	}
}
