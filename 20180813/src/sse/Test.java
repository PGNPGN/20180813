package sse;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		String d = scan.next();

		System.out.println(a+b+c+d);
		scan.close();
	}

}
