package day01;

import java.util.Scanner;

public class IQ2 {

	public static void main(String[] args) {
		/*
		 * Print prime numbers which are less than the given number
		 * örnek : 
		 * input : 10
		 * output : 2 3 5 7
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir pozitif tamsayý giriniz");
		int n = scan.nextInt();
		
		printPrime(n);
		scan.close();
		

	}
	
	private static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2 ; i < n ; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrime(int n) {
		for(int i = 2 ; i <n ;i++) {
			if(isPrime(i))
				System.out.print(i + " " );
		}
		
	}

}
