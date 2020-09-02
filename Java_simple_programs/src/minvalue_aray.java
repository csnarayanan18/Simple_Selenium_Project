
public class minvalue_aray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,5,1,21,3,4,0};
		min(a);

	}

	private static void min(int[] a) {
		// TODO Auto-generated method stub
		int min=a[0];
		int second_min=a[0];
		for(int i=1;i<a.length;i++)
		{
			//if(min>a[i])
				if(a[i]<min)
			{
				second_min=min;
				min=a[i];
			}
			//else if(second_min>a[i])
				else if(a[i]<second_min)
			{
				second_min=a[i];
			}
		}
		
		System.out.println("min value : "+min+" 2nd min value is "+second_min);
	}

}
