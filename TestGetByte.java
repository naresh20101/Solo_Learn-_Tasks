// String getByte method used to convert string into byte array
class TestGetByte
{
	public static void main(String ar[])
{
	String s1="Naresh";
	byte []x=s1.getBytes();
	for(int i=0; i<x.length; i++)
	{
		System.out.println("THE ASCCI CODE OF.."+" "+s1.charAt(i)+ " " + "is "+ x[i]);
	}
		System.out.print(s1);
}
}