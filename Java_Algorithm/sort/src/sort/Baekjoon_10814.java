package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 ) 나이순 정렬
 * 온라인 저지에 가입한 사람들의
 * 나이와 이름이 가입한 순서대로 주어진다.
 * 이때, 회원들응ㄹ 나이가 증가하는 순으로,
 * 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로
 * 정렬하는 프로그램
 * @author 김한수
 *
 */
public class Baekjoon_10814 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Person[] arr = new Person[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new Person(in.nextInt(), in.next());
		}
		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
		in.close();
	}
	public static class Person {
		int age;
		String name;
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return age + " " + name + "\n";
		}
	}
}
