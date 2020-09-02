package com.basics.java;

public class selectionsort {

	void selection_sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
        	int index = i;
            for (int j = i+1; j < n; j++)
            {
                if ( arr[index]>arr[j])
                {
                  index=j;
                }
            }
            // swap temp and arr[i]
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
    	selectionsort ss = new selectionsort();
        int arr[] = {64,1, 34, 25, 12, 22, 11, 90};
        ss.selection_sort(arr);
        System.out.println("Sorted array");
        ss.printArray(arr);
    }

}
