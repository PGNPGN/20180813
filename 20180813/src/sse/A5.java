package sse;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		boolean[][] map = new boolean[100][100];
		int number = scan.nextInt();
		int[] a = new int[number];
		int[] b = new int[number];
		int cnt = 0;
		
		for(int i=0; i<number; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					map[a[i]+j][b[i]+k] = true;
				}

			}
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(map[i][j] == true)
					cnt += 1;
			}
		}
		
		System.out.println(cnt);
		scan.close();
	}

}
