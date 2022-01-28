import java.util.Scanner;
class MagicSquare
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many elements are in a Matrix...?");
		int Size=s.nextInt();
		int a[][]=new int[Size][Size];
		int sumc=0;
		int sumd=0;
		int sumr=0;
		for(int i=0; i<Size; i++)
		{
				for(int j=0; j<Size; j++)
				{
					
					a[i][j]=s.nextInt();
				}
		}
		System.out.println("The Elements of a Matrix are..");
		for(int i=0; i<Size; i++)
		{
			for(int j=0; j<Size; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i=0; i<Size; i++)
		{
			for(int j=0; j<Size; j++)
			{
				if(i==j)
				{
				sumd+=a[i][j];
				}
				if(j==0)
				{
					sumc+=a[i][j];
				}
				sumr+=a[i][j];
			}
			
		}
		if(sumc==sumd && sumd==sumr)
		{
			//if(sumd==sumr)
			System.out.println(" Yes Given Matrix is a Magic Matrix..");
		}
		else
			System.out.println(" No Given Matrix is not  a Magic Matrix..");
	}
}
			
			
				
