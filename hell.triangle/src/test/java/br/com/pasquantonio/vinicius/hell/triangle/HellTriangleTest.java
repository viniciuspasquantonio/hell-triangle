package br.com.pasquantonio.vinicius.hell.triangle;

import org.junit.Assert;
import org.junit.Test;


public class HellTriangleTest {
	@Test
	public void shouldReturnMaxSumWhenTriangleHasOnlyRoot(){
		int[][] triangle = {{6}};
		HellTriangle hellTriangle = new HellTriangle();
		Assert.assertTrue(6 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWithTwoRows(){
		int[][] triangle = {{2},{2,9}};
		HellTriangle hellTriangle = new HellTriangle();
		Assert.assertTrue(11 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWithThreeRows(){
		int[][] triangle = {{2},{2,9},{1,2,4}};
		HellTriangle hellTriangle = new HellTriangle();
		Assert.assertTrue(15 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWithGivenChallangeInputExample(){
		int[][] triangle = {{6},{3,5},{9,7,1},{4,6,8,4}};
		HellTriangle hellTriangle = new HellTriangle();
		Assert.assertTrue(26 == hellTriangle.getMaxSum(triangle));
	}
}
