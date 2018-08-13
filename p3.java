public class p3 {

	public static void main(String[] args) {
	Double n=13195.0;
	for(int i=2;i<=n;i++)
	{
		while(n%i==0)
		{
			System.out.println(i);
			n=n/i;
		}
	}

	}

}