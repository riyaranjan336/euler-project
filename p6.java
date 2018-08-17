class p6
{
	public static void main(String args[])
	{
		int s=0,a=0,p=0;
		for(int i=1;i<=100;i++)
		{
			s=s+i*i;
			a=a+i;
			p=a*a;
		}
		int sub=p-s;
		
		System.out.println(sub);
		
	}
}