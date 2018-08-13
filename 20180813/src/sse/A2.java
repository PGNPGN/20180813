package sse;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] array = new int[n][n];
		int[] sumrow=new int[n], sumcolumn=new int[n];
		int maxrow=0, maxcolumn=0;
		int max1=1, max2=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array[i][j] = Integer.parseInt(scan.next());
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sumrow[i] += array[i][j];
			}
//			System.out.print(sumrow[i]+" ");
		}
		max1 = sumrow[0];
		for(int i=0; i<n; i++) {
			if(max1<sumrow[i]) {
				max1 = sumrow[i];
				maxrow = i;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sumcolumn[i] += array[j][i];
			}
//			System.out.print(sumcolumn[i]+" ");
		}
		max2 = sumcolumn[0];
		for(int i=0; i<n; i++) {
			if(max2<sumcolumn[i]) {
				max2 = sumcolumn[i];
				maxcolumn = i;
			}
		}
		
		scan.close();
		System.out.println((maxrow+1)+" "+(maxcolumn+1));
	}

}
