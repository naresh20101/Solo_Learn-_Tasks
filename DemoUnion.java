class DemoUnion
{
	public static void main(String ar[])
	{
		int SetA[]={1,2,3};
		int SetB[]={2,4,6};
		int SetU[]=new int[(SetA.length)+(SetB.length)];
		int temp[]=new int [SetU.length];int temp1=0;int count=0;
		for(int i=0; i<SetU.length; i++)
		{
			if(i<3)
			SetU[i]=SetA[i];
			else
				SetU[i]=SetB[i-3];
		}
		for(int i=0; i<SetU.length; i++)
		{	
				for(int j=i+1; j<SetU.length; j++)
				{
					if(SetU[i]==SetU[j])//123246
					{count++;
						temp1=SetU[i];
						SetU[i]=SetU[j];
						SetU[j]=temp1;
					}
				}
		}
		for(int i=0;i<SetU.length-count;i++)
		{
			System.out.print(SetU[i]);
		}
	}
	
}