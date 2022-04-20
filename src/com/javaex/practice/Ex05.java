package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		int sum = 0;
		double mean = 0;
		
		for(int i =0; i<array.length; i++) {
			int num = sc.nextInt();	
			sum= sum+num;
			mean = (double)sum/5;
		}
		System.out.println("평균은 "+mean+" 입니다.");
		
		sc.close();
	}

}
