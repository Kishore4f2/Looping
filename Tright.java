public class Tright
{
	public static void main(String[] args) 
	{
	    int k = 1;


		//rows
		for(int i=1;i<=6;i++)
		{
			//cols
			for(int j=1;j<=i;j++)
			{
			    if(k<=21)
					System.out.print(k++ +" ");
				else
				    System.out.print(" ");
			}
			//new line 
			System.out.println();
		}
	}
}
