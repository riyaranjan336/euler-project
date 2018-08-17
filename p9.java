class p9
{
	public static void main(String args[])
	{
	int i=1,j=i+1,k=j+1,s=0;
	int a,b,c,p;
	for(i=1;i<j;i++)
	{
		for(j=2;j<k;j++)
		{
			for(k=3;k<=1000;k++)
			{
				s=i+j+k;
			if(i<j&&j<k)
			{
				if(s==1000)
				{
					a=i*i;
					b=j*j;
					c=k*k;
					if(a+b==c){
					System.out.println(i+"  "+j+"  "+k);
					p=i*j*k;
					System.out.println(p);
					break;
				}}
			}	
			}
		}
	}	
	}
}