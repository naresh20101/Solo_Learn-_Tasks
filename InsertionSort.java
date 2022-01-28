class InsertionSort
{
	public static void main(String ar[])
	{
		int []a={8,2,11,45,22,1};
		for(int i=1; i<a.length; i++)
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i =0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}

				