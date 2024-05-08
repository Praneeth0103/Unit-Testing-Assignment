package com.practice;

import java.util.Scanner;

public class toUpperCase {
	public static void main(String[] args) {
		System.out.println(tc1());
		System.out.println(tc2());
//		System.out.println(tc3());
		System.out.println(tc4());
		System.out.println(tc5());
		System.out.println(tc6());
	}
	public static String convertToUpperCase(String input) {
		char[] ch=input.toCharArray();
		String result="";
		for(int i=0;i<ch.length;i++) {
			if(Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
				ch[i]=(char) (ch[i]-32);
			}
			result+=ch[i];
		}
		return result;
		
	}
	public static boolean tc1() {
		String expected="A";
		String input="a";
		String result=convertToUpperCase(input);
		if(result.equals(expected)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean tc2() {
		String expected="PRANEETH";
		String input="praneeth";
		String result=convertToUpperCase(input);
		if(result.equals(expected)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean tc3() {
		String expected=null;
		String input=null;
		String result=convertToUpperCase(input);
		if(result.equals(expected)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean tc4() {
		String expected="PRANEETH0103";
		String input="praneeth0103";
		String result=convertToUpperCase(input);
		if(result.equals(expected)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean tc5() {
		String expected="!@#$%%^";
		String input="!@#$%%^";
		String result=convertToUpperCase(input);
		if(result.equals(expected)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean tc6() {
		String expected="123456789";
		String input="123456789";
		String result=convertToUpperCase(input);
		if(result.equals(expected)) {
			return true;
		}
		else {
			return false;
		}
	}
}
