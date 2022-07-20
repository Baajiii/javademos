
public class challengeloop {
	public static void main(String[] args) {
		int i;
		int sum=0;
//		for(i=22;i<=98;i++)
//		{
//			if(i%2!=0)
//			{
//			System.out.println(i);
//			}
//		}
		// find the sum of all the number btw 1 to 100 which divisible by 3 and 5
		for(i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
  
