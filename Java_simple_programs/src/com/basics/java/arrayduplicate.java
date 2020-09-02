package com.basics.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String a = "i am here i am here my firend" ; String[] s= a.split(" ");
		 * System.out.println(s.toString());
		 */

		String s[] = { "abc", "def", "def", "mno", "xyz", "pqr", "xyz" };
		//int s[]={1,2,1,4,6,2,3,6};;
		
		int arraylength = s.length;
		System.out.println(arraylength);

		for (int i = 0; i < s.length; i++) {
			{
				for (int j = i + 1; j < s.length; j++) {
					if ((s[i].equals(s[j]))) {
						s[j] = s[arraylength - 1];
						arraylength--;
						j--;
					}
				}
			}
			String a1[] = Arrays.copyOf(s, arraylength);
			System.out.println();
			System.out.println("Array Without Duplicates  ");
			for (i = 0; i < a1.length; i++) {
				System.out.print(a1[i] + "\t");
			}
			System.out.println();
			System.out.println("---------------------------");
		}

		/* second option */

		String[] data = { "A", "C", "B", "D", "A", "B", "E", "D", "B", "C" };
		System.out.println("Original array         : " + Arrays.toString(data));

		List<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);

		System.out.print("Remove duplicate result: ");

		String[] result = new String[set.size()];
		set.toArray(result);
		for (String s11 : result) {
			System.out.print(s11 + ", ");
		}
	}
}
