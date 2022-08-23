package string;

import java.util.Scanner;
/**
 * 백준 ) 문자열 반복
 * 문자열 S를 입력받은 후,
 * 각 문자를 R번 반복해 새 문자열 P를 만든 후 
 * 출력하는 프로그램
 * @author 김한수
 *
 */
public class StringLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count; i++) {
			int loopNum = in.nextInt();
			String loopString = in.next();
			for(int j = 0; j < loopString.length(); j++) {
				for(int x = 0; x < loopNum; x++) {
					sb.append(loopString.charAt(j));
				}
			}
			sb.append('\n');
		}
		in.close();
		System.out.println(sb);
	}
}