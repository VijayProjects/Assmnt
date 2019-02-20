/*Q. Given five positive integers, find the occurrences of maximum value that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example,
. Our minimum sum is and our maximum sum is . We would print*/
package com.pk.assign;


public class HackerSol3 {

	public static void main(String[] args) {
		String s="12:05:45PM";
		if(s.contains("PM")){
			if(Integer.parseInt(s.substring(0,2))!=12)
				s=Integer.parseInt(s.substring(0,2))+12+s.substring(2,8);
			else
				s=s.substring(0,8);
        }
		else if(s.contains("AM")) {
			if(Integer.parseInt(s.substring(0,2))!=12)
				s=s.substring(0,8);
			else
				s="00"+s.substring(2,8);
		}
		System.out.println(s);
		 
	}

}
