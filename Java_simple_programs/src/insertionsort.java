
public class insertionsort {
	
	public static void main(String args[])
	
	{
		int a[] = {10,4,0,9,29,5};
		insertionsort is = new insertionsort();
		is.sort(a);
		printArray(a);
	}
	
	void sort(int[] a)
	{
		int len = a.length;
		int key;
		for(int i=1;i<len;i++)
		{
			key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]= a[j];
				j--;
			}
			a[j+1]=key;
		}
		
	}
	static void printArray(int a[])
    {
        int length = a.length;
        for (int i=0; i<length; ++i)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
