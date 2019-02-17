//Q. Write a java program to find occurances of character in given string as follows
//Input:java
/*Output
 * j-1
 * a-2
 * v-1*/
package com.pk.assign;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment2 {

	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();;
		long start=System.currentTimeMillis();
		String str="hippopopotamus";
		
		for(int i=0; i<str.length();i++) {
			char c=str.charAt(i);
			/*int count=1;
			//System.out.println(str.lastIndexOf('a', 9));
			if(str.lastIndexOf(c, i-1)>0)
				continue;
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(j)==c)
					count++;
			}
			System.out.println(c+"-"+count);*/
			
			
			
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		/*map.forEach((k,v)->
		System.out.println(k+"-"+v));*/
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start+" ms");

	}

}
