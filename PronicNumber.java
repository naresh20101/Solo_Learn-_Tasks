import java.util.Scanner;
class PronicNumber
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		boolean c=false;
		for(int i=1; i<=a; i++)
		{
			if(i*(i+1)==a)
			{
				System.out.println("Pronic Number..");
				break;
			}
		}
	}
}
		
		