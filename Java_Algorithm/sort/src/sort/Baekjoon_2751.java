package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjoon_2751 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(in.nextInt());
		}
		in.close();
		Collections.sort(arr);
		for(int value : arr) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
