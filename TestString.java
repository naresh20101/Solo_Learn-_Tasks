class TestString
{
	public static void main(String ar[])
{
	String s1="Naresh";
	String s2=" Kumar";
	String s3="Naresh";
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));

	//  By ==operator it only compares references not values
	System.out.println(s1==s3);
	//by compareTo method 
System.out.println(s1.compareTo(s2));
System.out.println(s1.concat(s2));
String s4="Khatri";
String s5="naresh20101";
String s6=s4.concat(s5).concat("@gmail.com");
System.out.println(s6);
for(int i=0; i<s5.length(); i++)
{
	System.out.println(s5.charAt(i));}

	//The contains methods searches the sequence of characters
	System.out.println(s5.contains("20"));
	System.out.println(s5.endsWith("naresh"));
	System.out.println(s5.endsWith("101"));



}
}
	