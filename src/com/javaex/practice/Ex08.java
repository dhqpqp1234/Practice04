package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] nums = new int[6];
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*45)+1;
			System.out.print(nums[i]+"\t");
		}
	}

} // 보류 잠시후
