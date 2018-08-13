package sse;

import java.util.Scanner;

public class A7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		char[][] map = new char[R+10][C+10];
		String s ="";
		
		for(int i=1; i<=R; i++) {
				s = scan.next();
				map[i] = (" "+s+" ").toCharArray();
		}
		scan.close();
		/*
		A7 obj = new A7
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(map[i][j] == '.')
					test.
			}
		}
		*/
		for(int i=1; i<=R; i++) {
			System.out.println(map[i]);
	}
	}
	
	public int test(String[][] map) {
		int[] dx= {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		int[] dy= {1, 1, 1, 0 ,0 ,0 ,-1, -1, -1};
		int cnt = 0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				for(int k=0; k<8; k++) {
					if(map[i+dx[k]][j+dy[k]]=="o")
						cnt+=1;
				}
			}
		}
		return cnt;
	}
}
