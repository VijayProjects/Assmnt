//Q.Write a java program to find mid element in LinkedList
package com.pk.assign;

import java.util.LinkedList;

public class Assignment1 {

	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		//li.add(5);
		//li.add(6);
		//li.add(7);
		
		int s=li.size();
		int i=s/2;
		/*for(int j:li) {
			System.out.print(j+" ");
		}
	
		System.out.println("\n"+s+" "+ i+" "+li.get(i));*/
		//String result=((s%2!=0)?((li.get(i))+""):(li.get(i-1)+", "+li.get(i)));
		System.out.println("mid ele:"+((s%2!=0)?((li.get(i))+""):(li.get(i-1)+", "+li.get(i))));
	}

}
