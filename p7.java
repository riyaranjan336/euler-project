class p7{
	public static void main(String args[])
	{
	int n=2,p,c=0,k=0;
	while(n>0)
	{
		for(int i=2;i<=n;i++)
		{
			p=n%i;
			if(p==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			k++;
			if(k==10001)
			{
			System.out.println(n);
			}
		}
		c=0;
	n++;
	}
	}
}
