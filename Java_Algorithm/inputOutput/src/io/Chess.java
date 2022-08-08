package io;

import java.util.Scanner;

/**
 * 백준 )
 * 킹, 퀸, 룩, 비숍, 나이트, 폰
 * 피스가 주어졌을 때, 몇 개를 
 * 더하거나 빼야 올바른 세트가
 * 되는지 구하는 프로그램
 * @author 김한수
 */
public class Chess {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cnt = new int[6];
        int[] full = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            cnt[i] = scanner.nextInt();
        }

        for (int i = 0; i < full.length; i++) {
            cnt[i] = full[i] - cnt[i];
            System.out.println(cnt[i]);
        }
	}
}
