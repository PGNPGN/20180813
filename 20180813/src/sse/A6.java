package sse;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[][] map = new boolean[100][100];
		int number = scan.nextInt();
		int[] a = new int[number];
		int[] b = new int[number];
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		int cnt = 0;
		int cntex = 0;

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
				for(int k=0; k<4; k++) {
					try {
						if(map[i][j]!=map[i+dx[k]][j+dy[k]]) {
							cnt +=1;
						}
					}catch(ArrayIndexOutOfBoundsException e) {
						if(map[i][j]==true)
							cntex +=1;
					}
					
					
				}
			}
		}
		
		System.out.println(cnt/2+cntex);
		
		scan.close();

	}

}
