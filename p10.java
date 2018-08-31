class p10{
	public static void main(String ar[])
	{
	int i,j,flag,n,m;
	long s=0;
	for(n=3;n<=2000000;n+=2)
	{
	flag=0;m=0;
		for(i=3;(i*i)<=n;i+=2)
			if(n%i==0)
			{
				m=0;flag=1;break;
			}
			if(flag==0)
			m=n;
			if(m!=0)
			{
				s+=m;
			}
	}
	s+=2;
	System.out.println(s);
	}
}
	