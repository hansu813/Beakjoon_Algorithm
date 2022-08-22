package string;

import java.util.Scanner;

/**
 * 백준 ) 아스키 코드
 * 알파벳 소문자, 대문자, 숫자 중 하나가 주어졌을 때,
 * 주어진 글자의 아스키 코드값을 출력하는 프로그램
 * @author 김한수
 *
 */
public class AsciiCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ascii = in.next().charAt(0);
		in.close();
		System.out.println(ascii + 0);
	}

}
