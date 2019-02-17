/*Q.Write a java program to exchange first half
 * with second half and vice versa.
 * input: java
 * output:vaja
 * input:program
 * output:ramgpro
 * */
package com.pk.assign;

public class Assignment4 {

	public static void main(String[] args) {
		String str="javac";
		int len=str.length();
		str=((len)%2==0 ? str.substring((len)/2)+str.substring(0, (len)/2) : str.substring(((len)/2)+1)+str.substring(len/2, (len/2)+1)+str.substring(0, (len)/2));
		System.out.println(str);

	}

}
