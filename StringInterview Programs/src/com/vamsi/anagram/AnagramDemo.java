package com.vamsi.anagram;

import java.util.Arrays;

public class AnagramDemo {
	
	
	static boolean anagram(char[] s1,char[] s2) {
		int n1= s1.length;
		int n2= s2.length;
		if(n1!=n2)
			return false;
			Arrays.sort(s1);
		Arrays.sort(s2);
			
			for(int i=0;i<n1;i++)
				if(s1[i]!=s2[i]) {
					return false;
				}
		
		return true;
		
	}

	public static void main(String[] args) {
		char s1[]= {'A','B','C'};
		char s2[]= {'C','A','B'};
		
		if(anagram(s1,s2))
			System.out.println("Two String are" + "anagram of each other");
		
		else
			System.out.println("Two String are not" + "anagram of each other");
	}

}
