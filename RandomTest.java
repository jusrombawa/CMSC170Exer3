import java.util.Random;

public class RandomTest
{
	public static void main(String args[])
	{
		Random r = new Random();
		int output;
		int [] list = new int[9];
		int [][] state = new int[3][3];
	
		for(int i = 0;i<9;i++)
		{
			
			output = r.nextInt(9) + 1;
			//check for duplicates
			for(int j=0;j<i;j++)
			{
				if(output == list[j])
				{
					i--;
					continue;
				}
			}
			list[i] = output;
		}
		
		for(int i =0; i<9;i++)
			System.out.println(list[i]);
	}
}
