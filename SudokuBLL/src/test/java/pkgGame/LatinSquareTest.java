package pkgGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void ContainsZeroTest() {
		
		int[][] myArray = { {1,2,3}, {2,1,3}, {3,2,1} };
		
		LatinSquare ls = new LatinSquare(myArray);
		
		assertFalse(ls.ContainsZero());
		
		myArray[0][1] = 0;
		
		assertTrue(ls.ContainsZero());
		
		
		
		
	}

	
	public void doesElementExistTest()
	{
		
		int[][] myArray = { {1,2,3}, {2,1,3}, {3,2,1} };
		LatinSquare ls = new LatinSquare(myArray);
		
		int iValue = 4;
		int[] myIntArray = {1,2,3,4,5};
		
		assertTrue(ls.doesElementExist(myIntArray, iValue));
		
		iValue = 6;
		
		assertFalse(ls.doesElementExist(myIntArray, iValue));
		
	}
}
