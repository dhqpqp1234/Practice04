package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		/*
		int[] intArray = new int[5];
		//배열의 칸이 5칸인데 밑에는 3칸입니다.
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i =0; i<intArray.length; i++) {
			result = result +intArray[i];
		}
		System.out.println(result);
		*/	
		int[] intArray = new int[3];
		
		intArray[0] = 3; 
		intArray[1] = 7; 
		intArray[2] = 12; 
		
		int result = 0;
		
		for(int i = 0; i<intArray.length; i++){
			result = result+intArray[i];
		}System.out.println(result);
	
	
	}

}
