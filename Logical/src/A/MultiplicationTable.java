package A;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter No");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			for(int j=1;j<=10;j++) {
			System.out.print(i+"*"+j+"="+(i * j)+"\t");
			}
			System.out.println();
		}
		
	}
}
