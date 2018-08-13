package sse;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A8 obj = new A8();
		obj.process();
	}
	
	public void process() {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[][] array = new int[number][3];
		int[][] score = new int[number][3];
		for(int i=0; i<number; i++) {
			for(int j=0; j<3; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		cal(number, array, score);
		scan.close();
	}
	
	public void cal(int number, int[][] array, int[][] score) {
		for(int j=0; j<3; j++) {
			for(int i=0; i<number; i++) {
				for(int k=0; k<number; k++) {
					if(i==k)
						continue;
					else {
						if(array[i][j] != array[k][j]) {
							score[i][j] = array[i][j];
						}else{
							score[i][j] = 0;
							break;
						}
							
					}
				}
			}
		}
		
		int sum=0;
		for(int i=0; i<number; i++) {
			for(int j=0; j<3; j++) {
				sum += score[i][j];
			}
			System.out.println(sum);
		}
	}
}
