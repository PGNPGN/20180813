package sse;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[] number = new int[count];
		int max=0;
		int maxvalue=0;

		for(int i=0; i<count; i++) {
			number[i] = scan.nextInt();
		}

		A3 obj = new A3();
		for(int i=0; i<count; i++) {
			if(max<obj.get1st(number[i])){
				max = obj.get1st(number[i]);
				maxvalue = number[i];
			}else if(max==obj.get1st(number[i])) {
				if(maxvalue>number[i]) {
					maxvalue = number[i];
				}
			}
		}
		scan.close();
		System.out.println(maxvalue);
	}


	public int get1st(int a) {
		int num=0;
		while(a>=10) {
			num += a%10;
			a = a/10;
			if(a<10) {
				num += a;
				a= num;
				if(a<10)
					break;
				else
					num=0;
			}	
		}
		//		System.out.println(num);
		return num;
	}
}
