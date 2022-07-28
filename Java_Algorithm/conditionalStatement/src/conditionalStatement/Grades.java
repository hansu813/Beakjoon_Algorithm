package conditionalStatement;

import java.util.Scanner;
/**
 * 백준 )
 * 점수를 입력받아서 점수에 맞는 
 * 학점을 배정하는 프로그램을 작성하시오.
 * @author 김한수
 *
 */
public class Grades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int score = scanner.nextInt();
		if (score >= 0 && score <= 100) {
			if(score >= 90) {
				System.out.println("A");
			}
			else if(score >= 80 && score < 90) {
				System.out.println("B");
			}
			else if(score >= 70 && score < 80) {
				System.out.println("C");
			}
			else if(score >= 60 && score < 70) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}
	}

}
