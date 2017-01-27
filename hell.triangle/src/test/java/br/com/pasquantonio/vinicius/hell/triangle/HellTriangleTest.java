package br.com.pasquantonio.vinicius.hell.triangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.pasquantonio.vinicius.hell.triangle.exception.EquilateralTriangleException;


public class HellTriangleTest {
	private HellTriangle hellTriangle;
	@Before
	public void before(){
		hellTriangle = new HellTriangle();
	}

	@Test
	public void shouldReturnMaxSumWhenTriangleHasOnlyRoot(){
		int[][] triangle = {{6}};
		
		Assert.assertTrue(6 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWithTwoRows(){
		int[][] triangle = {{2},{2,9}};
		
		Assert.assertTrue(11 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWithThreeRows(){
		int[][] triangle = {{2},{2,9},{1,2,4}};
		
		Assert.assertTrue(15 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWithGivenChallangeInputExample(){
		int[][] triangle = {{6},{3,5},{9,7,1},{4,6,8,4}};
		
		Assert.assertTrue(26 == hellTriangle.getMaxSum(triangle));
	}
	
	@Test
	public void shouldReturnMaxSumWhenHigherValuesAreInTheLastNodeOfRow(){
		int[][] triangle = {{6},{3,5},{2,7,9},{4,6,8,14}};
		
		Assert.assertTrue(34 == hellTriangle.getMaxSum(triangle));
	}
	
	 @Test(expected = IllegalArgumentException.class)
	 public void shouldValidateWhenTriangleIsNull(){
		 hellTriangle.getMaxSum(null);
	 }
	 
	 @Test(expected = EquilateralTriangleException.class)
	 public void shouldValidateEquilateralTriangle(){
		 int[][] triangle = {{6},{3,5},{2,7},{4,6,8,14}};
		 hellTriangle.getMaxSum(triangle);
	 }
	 
	 @Test(expected = EquilateralTriangleException.class)
	 public void shouldValidateEquilateralTriangleUpSideDown(){
		 int[][] triangle = {{1,2,3},{3,5},{2}};
		 hellTriangle.getMaxSum(triangle);
	 }
	
	
}
