package sse;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int C = scan.nextInt();
		int max = 0;
		char[][] map = new char[R][C];
		String s ="";

		for(int i=0; i<R; i++) {
			s = scan.next();
			map[i] = s.toCharArray();
		}
		scan.close();

		A7 obj = new A7();
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if (map[i][j] == '.')
					max = Math.max(max, obj.test(map, i, j, R, C));
				else {
					max = Math.max(max, obj.test(map, i, j, R, C));
					map[i][j] = 'o';
				}
			}
		}

		//		max = obj.test(map, 0, 0, R, C);
		System.out.println(max/2);
	}

	public int test(char[][] map, int a, int b, int R, int C) {
		int[] dx= {-1, 0, 1, -1, 1, -1, 0, 1};
		int[] dy= {1, 1, 1, 0, 0 ,-1, -1, -1};
		int cnt = 0;
		map[a][b] = 'o';

		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				for(int k=0; k<8; k++) {
					try {
						if(map[i][j] =='o' && map[i+dx[k]][j+dy[k]]=='o')
							cnt+=1;
					}catch (ArrayIndexOutOfBoundsException e) {
						//						continue;
					}

				}
			}
		}
		map[a][b] = '.';
		return cnt;
	}
}
