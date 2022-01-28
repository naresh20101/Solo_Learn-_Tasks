//getChars is a string method in which it copies the string into char array.\
class TestGetChars
{
	public static void main(String ar[])
	{
	String s1="I am Naresh Kumar";
	char ch[]=new char[10];
	try{ 
		s1.getChars(5,15,ch,0);
		System.out.println(ch);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}

