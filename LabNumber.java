import java.util.Scanner;
class LabNumber
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numner..");
		int num=s.nextInt();
		int c=-1;
		boolean bol=false;
		int a[]=new int[num];
		L1:for(int i=1; i<=num; i++)
		{
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					continue L1;
				}
			}
				c++;
				a[c]=i;
		}
		/*for(int i=0; i<num; i++)
		{
		System.out.println(a[i]);
		}*/
		for(int i=0; i<num/2; i++)
		{
			if((num%a[i]==0)  )
			{
				if(num%(a[i]*a[i])==0)
					bol=true;
					break;
			}
		}
		if(bol==true)
			System.out.println("Lab Number..");
		else
		System.out.println("Not a LabNumber..");
		
	}
}
				
	
