
public class maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {11,7,8,12,33,44,55,58,66,1,59};
		max(a);

	}

	private static void max(int[] a) {
		// TODO Auto-generated method stub
	int max=a[0];
	int secondmax=a[0];
	for(int i=0;i<a.length;i++)
	{
		if (a[i]>max)
		{
			secondmax=max;
			max=a[i];
		}
		
		else if(a[i]>secondmax)
		{
			secondmax=a[i];
		}
	}
	System.out.println("2nd Max value is:" +secondmax+" max vaue is"+max);
	}

}
