package studio3;

import java.util.Scanner;

public class sieve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Your upper limit:");
		int n = scan.nextInt();
		int [] array = new int[n];
		boolean [] array2 = new boolean [n];
		for (int i = 0; i <array.length; i++) {
			array2[i] = true;
			array[i] = i+2;
			
		}
		for (int in = 0; in<array.length-1; in++) {
			int numMax = n/array[in] ;
			int sub = array[in];
			if (array2[in]==true) {
				for (int num = 0; num<numMax; num++) {
					array2[in+sub*num]=false;

				}
				System.out.println(array[in]+"is a prime number");
			}
			
		}
	}

}
