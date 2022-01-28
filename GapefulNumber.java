import java.util.Scanner;
class GapefulNumber
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int First=0, Last=0, divisible=0;
		int x=a;
		Last=a%10;
		while(a!=0)
		{	
		First=a%10;
		a=a/10;
		}
		divisible=First*10+Last;
		if(x%divisible==0)
		{
			System.out.println("Yes its Gapeful Numer..");
		}
		else
			System.out.println("No its not..");
	}
}
		