package sse;

import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int length = input.length();
		char charbefore, charnow;
		int height=0;
		
		for(int i=0; i<length; i++) {
			if (i==0) {
				height += 5;
				charbefore = input.charAt(i);
				charnow = input.charAt(i);
			}else {
				charbefore = input.charAt(i-1);
				charnow = input.charAt(i);
			}
				if( charbefore == charnow)
					height+=5;
				else
					height+=10;
		}
		scan.close();
		System.out.println(height);
	}
}
