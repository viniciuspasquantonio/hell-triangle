package br.com.pasquantonio.vinicius.hell.triangle;

import br.com.pasquantonio.vinicius.hell.triangle.exception.EquilateralTriangleException;

public class HellTriangle {
	public HellTriangle() {
	}

	public int getMaxSum(int[][] triangle) {
		if(triangle == null){
			throw new IllegalArgumentException("Triangle can't be null");
		}
		
		int maxSum = triangle[0][0];
		int currentNodeIndex = 0;
		int triangleLength = triangle.length;
		for (int i = 1; i < triangleLength; i++) {
			validateTriangleRow(i, triangle[i]);
			if(triangle[i][currentNodeIndex+1] >triangle[i][currentNodeIndex] ){
				currentNodeIndex++;
			}
			maxSum += triangle[i][currentNodeIndex];
				
		}
		return maxSum;
	}
	
	private void validateTriangleRow(int rowPosition, int[] row) throws EquilateralTriangleException{
		final int rowExpectedLength = rowPosition +1;
		
		if(row.length != rowExpectedLength){
			throw new EquilateralTriangleException(
					String.format("Not an pyramidal equilateral triangle.It was expected %d nodes on the row %d but there were %d", 
							rowExpectedLength, rowPosition+1, row.length));
		}
	}
	
	

}
