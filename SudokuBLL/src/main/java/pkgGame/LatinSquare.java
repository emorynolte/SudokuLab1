/* Emory Nolte
 * Cisc 181 Lab 1
 * 
 * 
 */




package pkgGame;

public class LatinSquare {

	private int[][] myLatinSquare;

	public LatinSquare(int [][] twoDimArray)
	{
		this.myLatinSquare = twoDimArray;
	}
	
	
	// a method to test if this instance of LatinSquare contains a 0, returns boolean
	public boolean ContainsZero()
	{
		for (int iCol = 0 ; iCol < myLatinSquare.length; iCol++)
		{
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++)
			{
				if (myLatinSquare[iCol][iRow] == 0)
				{
					return true;
				}
			}
		}
		
		return false;
	}

	// a method to test if the element iValue exists in the given array,returns boolean
	public boolean doesElementExist(int[] arr, int iValue)
	{
		for (int i : arr)
		{
			if (i == iValue)
			{
				return true;
			}
			
		}
		
		return false;
		
	}

}
