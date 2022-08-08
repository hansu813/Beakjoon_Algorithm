package loop;

import java.util.Scanner;

public class Plus_Cycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = 0;
		int n = sc.nextInt();
		int a = n / 10;
		int b = n % 10;
		int c = a + b;
		while(true) {
			++count;
			num = (b * 10) + (c % 10);
			a = num / 10;
			b = num % 10;
			c = a + b;
			if(n == num) {
				break;
			}
		}
		System.out.println(count);
	}

}
