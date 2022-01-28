import java.util.Scanner;
class FisherNumber
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number..");
		int x=s.nextInt();
		int temp=0;;
		int result=1;
		for(int i=1; i<=x; i++)
		{
			if(x%i==0)
			{
				result*=i;
			}
			
		}
		temp=x*x*x;
		if(result==temp)
		{
			System.out.println("FisherNumber..");
		}
		else
		System.out.println(" not FisherNumber..");
		}
}