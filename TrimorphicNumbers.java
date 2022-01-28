import java.util.Scanner;
class TrimorphicNumbers
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
			System.out.println("Please Enter a number...");
			int a =s.nextInt();
			int cube=0;
			cube=(int)Math.pow(a,3);
			//while(cuble!=0)
			//{
				cube=cube%10;
				if(cube==a)
				{
					System.out.println("Yes Its Trimorphric Number..");
				}
				else
				System.out.println("Not a Trimorphric Number..");
	}
}
					
		