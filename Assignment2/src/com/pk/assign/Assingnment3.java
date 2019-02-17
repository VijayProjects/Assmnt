/*Q.Write a java program to replace with given character with its occurance in 
 * given string*/
package com.pk.assign;

public class Assingnment3 {

	public static void main(String[] args) {
		/*String str="Prabhakarfgdtrsdhgkjtytrreafgffapytseaewrxfdzwaxazfdsdfadafdaeawreaweawa";
		StringBuilder sb=new StringBuilder();
		char ch='a';
		for(int i=0, count=1; i<str.length(); i++) {
			if(str.charAt(i)==ch) 
				sb.append(count++);
			else
				sb.append(str.charAt(i));
		}
		System.out.println(sb);
		*/
		
		StringBuilder sbText=new StringBuilder("Prabhakaasdfghjasdfghjasdfghasdfasdfasdasdasasasasasr");
		char ch='a';
		for(int i=0, count=1;i<sbText.length(); i++) {
			if(sbText.charAt(i)==ch)
				sbText.replace(i, i+1, String.valueOf(count++));
		}
		System.out.println(sbText);
	}
}
