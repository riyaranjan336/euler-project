class p4 {
        public static void main(String[] args) {
	int s=0,palin=0;
	for(int i=1;i<=9;i++)
	{
		for(int j=0;j<=9;j++)
		{
			for(int k=0;k<=9;k++)
			{
				for(int i1=1;i1<=9;i1++)
				{
					for(int j1=0;j1<=9;j1++)
					{			
						for(int k1=0;k1<=9;k1++)
						{
						s=0;
						int num=(((i*100)+(j*10)+k)*((i1*100)+(j1*10)+k1));
						int m=num;
						while(m>0)
						{
						int r=m%10;
						s=(s*10)+r;	
						m=m/10;
						}
						if(num==s && num>palin)
						palin=num;
						}
					}
				}
			}
		}
	}
	System.out.println(palin);
	}}