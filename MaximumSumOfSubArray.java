package com.practice;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,-2, 3,4,-1,7,-5,15, -23, 1, 2,3};//90
		//
	//	int[] arr2 = {40,10,-30,70, 90};
		
		/*
		 * max sub-array sum => print max sum of sub-arry => O(n)
		 */
		int sum = maxSum(arr);
		System.out.println("sum "+sum);
		
		

	}

	private static int maxSum(int[] arr) {
		int sum = 0;
		int referenceValue = 0;// assumption
		int sumSoFar=0,maxSum = 0;
		
		
		for(int i : arr) {
			sum = sum + i;//
			if(sum > referenceValue) {
				sumSoFar = sum;
				continue;
			}else if(maxSum < sumSoFar){
					maxSum = sumSoFar;
				}
				sum=0;
		}
		return maxSum;
	}


}
