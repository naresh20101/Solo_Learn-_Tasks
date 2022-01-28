import java.util.Scanner;
class AsscciCon
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String..");
		String s1=s.nextLine();
		byte ch[]=s1.getBytes();
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		/*byte var[] = new byte[s1.length()];
		
		for(int i=0; i<var.length; i++)
		{
			var[i] = (byte)s1.charAt(i);
			System.out.println(var[i]);
		}
		*/
	}
}
		
		
		