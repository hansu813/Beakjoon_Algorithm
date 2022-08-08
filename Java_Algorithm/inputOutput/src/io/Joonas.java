package io;

import java.util.Scanner;

/**
 * 백준 ) 첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 
 * 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 
 * 길이는 50자를 넘지 않는다.
 * 
 * @author 김한수
 *
 */
public class Joonas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[] joonas = scanner.next().toCharArray();
		if (joonas.length <= 50) {
			for (int i = 0; i < joonas.length; i++) {
				if (joonas[i] >= 97 && joonas[i] <= 122) {
					System.out.print(joonas[i]);
				}
			}
			System.out.print("??!");
		}
	}
}
