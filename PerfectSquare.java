import java.util.Scanner;
class PerfectSquare
{
	public static void main(String ar[])
	{
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			boolean c= false;
			 for(int i=1; i<=a; i++)
			{
				if(i*i==a)
				{
					System.out.println("Factors are.."+ i+ "*" +i);
					c=true;
				}
			}
			if(c== true)
			{
				System.out.println("Yes its perfect number...");

			}
			else
				System.out.println("No its not perfect number...");
	}
}