class p5
{
	public static void main(String args[])
	{
	int n=1,p,c=0,k=0;
	while(n>0&&k<=0)
	{
		for(int i=1;i<=20;i++)
		{
			p=n%i;
			c++;
			while(p!=0)
			{
				c=0;
				break;
			}
			if(c==20)
			{
				k++;
				System.out.println(n);
			}	
		}
		n++;
	}
	}
}
	
	
