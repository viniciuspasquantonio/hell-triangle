package br.com.pasquantonio.vinicius.hell.triangle.model;

import br.com.pasquantonio.vinicius.hell.triangle.exception.EquilateralTriangleException;

public class HellTriangle {
	private int[][] triangle;
	

	public HellTriangle(String triangle) {
		this.triangle = parse(triangle);
	}

	public int getMaxSum() {
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
	

	public int[][] parse(String input) {
		if(input == null){
			throw new IllegalArgumentException("Triangle can't be null");
		}
		input = input.substring(2, input.length()-2);
    	String[] triangle = input.split("\\],\\[");
    	int triangleLength = triangle.length;
    	String[] rows;
    	int rowsLength;
    	int[][] matrix = new int[triangleLength ][];
    	for (int i = 0; i < triangleLength ; i++) {
    	    rows = triangle[i].split(",");
    	    rowsLength = rows.length;
    	    validateTriangleRow(i, rowsLength);
    	    matrix[i] = new int[rowsLength];
    	    for (int j = 0; j < rowsLength; j++) {
    	        matrix[i][j] = Integer.parseInt(rows[j]);
    	    }
    	}
    	return matrix;
	}

	private void validateTriangleRow(int rowPosition, int rowsLength) throws EquilateralTriangleException{
		final int rowExpectedLength = rowPosition +1;
		
		if(rowsLength != rowExpectedLength){
			throw new EquilateralTriangleException(
					String.format("Not an pyramidal equilateral triangle.It was expected %d nodes on the row %d but there were %d", 
							rowExpectedLength, rowPosition+1, rowsLength));
		}
	}
	
	public int[][] getTriangle() {
		return triangle;
	}
	

}
