public class p3 {

	public static void main(String[] args) {
	Double n=600851475143.0;
	for(int i=2;i<=n;i++)
	{
		while(n%i==0)
		{
			n=n/i;
			while(n==1)
			{
				System.out.println(i);
				break;
			}
		}
	}

	}

}
