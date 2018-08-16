class p5
{
	public static void main(String args[])
	{
	int n=1,p,c=0,m=0,k=0;
	int temp=n;
	while(n>0&&k<=0)
	{
		for(int i=1;i<=10;i++)
		{
			p=n%i;
			c++;
			while(p!=0)
			{
				c=0;
				break;
			}
			if(c==10)
			{
				k++;
				System.out.println(n);
			}	
		}
		n++;
	}
	}
}
	
	