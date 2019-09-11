package com.arc.array2;

import java.util.Scanner;

public class DoubleArray2 {

	public static void main(String[] args) {

		int [][] nums = new int [2][3];
		System.out.println(nums[0][0]);

		// Heap에 있는 애들은 자동으로 초기화, stack은 내가 초기화 해줘야 함.

		System.out.println(nums.length);
		System.out.println(nums[0].length);
		System.out.println(nums[1].length);


		Scanner sc = new Scanner(System.in);

		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++){
				System.out.println("입력");
				nums[i][j] = sc.nextInt();

			}	
		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++){
				System.out.println(nums[i][j]);
				

			}	
		}

	}//main
}
