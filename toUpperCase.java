package com.practice;

import java.util.Scanner;

public class toUpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char ch[]=a.toCharArray();
		convertToCapital(ch);
	}
	public static void convertToCapital( char ch[]) {
		String s="";
		for (int i = 0; i < ch.length; ++i) {
			if(Character.isLowerCase(ch[i])&& Character.isAlphabetic(ch[i]))
			{
				ch[i]=(char) (ch[i]-32);
			}
			s+=ch[i];
		}
		System.out.println(s);
	}
}
