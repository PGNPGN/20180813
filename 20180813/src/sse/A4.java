package sse;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<5-i) 
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
