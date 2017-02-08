import java.util.Collections;
import java.util.Arrays;

public class CollectionsTest
{
	public static void main(String args[])
	{
		int [][] tiles = new int[3][3];

		Integer[] arr = new Integer[9];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = i+1;
		}

		
		Collections.shuffle(Arrays.asList(arr));
	//	System.out.println(Arrays.toString(arr));
	
		for(int i=0;i<9;i++)
			System.out.println(arr[i]);

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				tiles[i][j] = arr[i+3*j];
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(tiles[j][i]);
			System.out.println();
		}
	}
}
