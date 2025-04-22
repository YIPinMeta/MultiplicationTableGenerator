package day6;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number to recieve Multiples of your number");
		int num = scanner.nextInt();

		System.out.println("Multiplication Tables for" + num + ":");
		for (int i = 1; i <= 10; i = i + 1) {
			int result = num * i;
//			System.out.println(result);
			System.out.println(num + "x" + i + "=" + result);
		}
	}

}
