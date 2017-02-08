import java.util.Collections;
import java.util.Arrays;

public class EightPuzzleState
{
	private int f,g,h;
	private boolean goalCheck;

	private int [][] tiles = new int[3][3];
	private Integer[] arr = new Integer[9];
	
	//initial state
	public EightPuzzleState()
	{
		tiles = new int[3][3];
		
		// arr = 1 to 9
		Integer[] arr = new Integer[9];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = i+1;
		}
		
		
		
		//shuffle arr to get random sequence
		Collections.shuffle(Arrays.asList(arr));
		
		//place into tiles
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				tiles[i][j] = arr[i+3*j].intValue();
			}
		}
		
		//compute for total for f
		g = 0; //initially no move cost
		h = heuristic();
		f = g + h;

	}
	
	//manhattan distance
	private int heuristic()
	{
		int[] tempTiles = new int[9];
		int[] distances = new int[9];
		
	
		//"flatten" 2d array
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				tempTiles[3*i+j] = tiles[i][j] - 1;

		
		for(int i=0;i<9;i++)
			System.out.println(tempTiles[i]);
			
		return 0;
	}
	

	
	//getters
	
	public int getF()
	{
		return f;
	}
	
	public int[][] getTiles()
	{
		return tiles;
	}
}
