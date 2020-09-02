package com.basics.java;
import java.util.Scanner;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int temp;
//	        Scanner s = new Scanner(System.in);
//	        System.out.print("Enter no. of elements you want in array:");
//	        int n = s.nextInt();
//	        int a[] = new int[n];
//	        System.out.println("Enter all the elements:");
		 
	        
	        int a[]={4, 3, 5, 9,5,2};
	        int length= a.length;
	        String res="";
	     
	        for (int i = 0; i < length; i++) 
	        {
	            for (int j = i + 1; j < length; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	            
	        }
	        
	        System.out.println("Ascending Order:");
	        for (int i = 0; i < length ; i++)	       
	        {
	            System.out.print(a[i]+"\t");
	        }
	        System.out.println(" ");
	       System.out.println("decending Order:");
	       for (int i = length-1; i >=0  ; i--) 
	        {
	            System.out.print(a[i]+"\t");
	        }
	       // System.out.print(a[length - 1]);
	    }
	}


