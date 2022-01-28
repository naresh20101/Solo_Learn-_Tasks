import java.util.Scanner;
class FactorialZero
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number..");
		int x=s.nextInt();
		int fact=1;
		int remd;
		int count=0;
		while(x!=0)
		{
			fact*=x;
			x--;
		}
		System.out.println(fact);
		while(fact!=0)
		{
			remd=fact%10;
			
			if(remd==0)
			{
			count++;
			}
			fact=fact/10;
		}
		System.out.println("The Number of Zeros.."+ count);
	}
}
	
	