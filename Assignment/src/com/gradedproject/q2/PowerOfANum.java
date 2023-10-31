package com.gradedproject.q2;
import java.util.Scanner;
public class PowerOfANum {
	public static int power(int x, int n) {
		if (n==0) 
		{
			return 1;
		}
		return x*power(x, --n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the base number X: ");
		int num = in.nextInt();
		System.out.println("Enter the power N = ");
		int power = in.nextInt();
		System.out.println("X power N is: "+ power(num, power));
	}

}
