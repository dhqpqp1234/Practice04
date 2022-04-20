package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = { 3, 6, 9};
		// int[] B가 A랑 같은 주소를 쓰고잇어 같은 값을 쓰고잇으므로 B값이 변하면 A값도 변한다.
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
	}

}
