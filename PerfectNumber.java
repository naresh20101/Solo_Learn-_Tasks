import java.util.Scanner;
class PerfectNumber
{
	public static void main(String ar[])
	{
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int sum=0;
			int x=a;
			for(int i=1; i<a; i++)
			{
				if(a%i==0)
				{
					sum+=i;
					System.out.println("The Proper divisors are...."+ i);
				}
			}
			if(sum==x)
			{
				System.out.println("Yes its perfect number...");
			}
			else
				System.out.println("No its Not a Perfect Number...");
	}
}