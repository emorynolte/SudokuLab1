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
	
	
	// a method to set the latinsquare to the one given
	public void setLatinSquare(int[][] latinSquare)
	{
		myLatinSquare = latinSquare;
	}
	
	// a method to test if this instance of LatinSquare contains a 0
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

	// a method to test if the element iValue exists in the given array
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

	// a method to return a one dimensional array from the given column in the latin square
	public int[] getColumn(int iCol)
	{
		
		// might not be needed, declare a new array to be filled and returned
		int[] returnArray = new int[myLatinSquare.length];
		
		for ( int i = 0; i < myLatinSquare.length; i++ )
		{
			returnArray[i] = myLatinSquare[iCol][i];
		}
	
		return returnArray;
	}
	
	
	// a method to return a one dimensional array from the given row in the latin square
	public int[] getRow(int iRow)
	{
		int[] returnArray = new int[myLatinSquare.length];
		
		for ( int i = 0; i < myLatinSquare.length; i++ )
		{
			returnArray[i] = myLatinSquare[i][iRow];
		}
	
		return returnArray;
		
	}
	
	// a method returning the current instance of latin square
	public int[][] getLatinSquare()
	{
		return myLatinSquare;
	}
	
	
	
	// a method testing if every element from the first given array is in the second
	public boolean hasAllValues(int[] array1, int[] array2)
	{
		
		for (int i = 0; i < array2.length; i++)
		{
			for( int j  = 0; j < array1.length; j++)
			{
				if (doesElementExist(getRow(i), array1[j]) ==  false)
				{
					return false;
				}
				
			}
		}
		return true;
	}

	// a method to test if the given array contains any duplicates
	public boolean hasDuplicates(int[] arr)
	{
		
		for (int i = 0; i < (arr.length - 1); i++)
		{
			if (arr[i] == arr[i+1])
			{
				
				return true;
			}
		}
		return false;
	}
	
	// using the other methods, test if the current instance of latinSquare satisfies the requirements
	public boolean isLatinSquare()
	{
		int[] firstCol;
		int[] firstRow;
		
		firstCol = getColumn(0);
		firstRow = getRow(0);
		
	
		
		for (int i = 0; i < myLatinSquare.length; i++)
		{
			if (hasDuplicates(this.getRow(i)))
			{
				return false;
			}
			if (hasDuplicates(this.getRow(i)))
			{
				return false;
			}
			if (!(hasAllValues(getRow(i), firstRow)))
			{
				return false;
			}
			if (!(hasAllValues(getColumn(i), firstCol)))
			{
				return false;
			}
			
			
		}
		return true;
	}
	
}
