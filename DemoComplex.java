import java .util.Scanner;
class DemoComplex
{
	public static void main(String ar[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers..");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int result1=(a*d)+(b*c);
		int result2=(a*c)-(b*d);
		System.out.println(result1+ ","+ result2);
	}
}
		
