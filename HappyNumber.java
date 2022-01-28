import java.util.Scanner;
class HappyNumber
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number...");
		int a=s.nextInt();
		int sum=0;
		int result=a;
		int rem=0;
		/*L1: while(a>0)
		{
			 rem=a%10;
			sum+=(rem*rem);
			a=a/10;
			if(a==0 && sum!=1)
				a=sum;	
			
			
			else
			
			System.out.println("happy number");	
		break;
			}*/
		L1:for(int i=1; sum!=4; i++)
			{
				L2:while(a>0)
				{
				 rem=a%10;
			sum+=(rem*rem);
			a=a/10;
				}
		
			
			 if(a==0 && sum!=1)
			{
				a=sum;
				sum=0;
				
			}
			
			if(sum==1)
			{
				System.out.println("happy number");	
				break L1;
			}
			}
			//else
			//System.out.println(" not happy number");	
				
	}
}