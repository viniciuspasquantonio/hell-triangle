package br.com.pasquantonio.vinicius.hell.triangle;

public class HellTriangle {
	public HellTriangle() {
	}

	public int getMaxSum(int[][] triangle) {
		int maxSum = triangle[0][0];
		int currentNodeIndex = 0;
		int triangleLength = triangle.length;
		for (int i = 1; i < triangleLength; i++) {
			if(triangle[i][currentNodeIndex+1] >triangle[i][currentNodeIndex] ){
				currentNodeIndex++;
			}
			maxSum += triangle[i][currentNodeIndex];
				
		}
		return maxSum;
	}
	

}
