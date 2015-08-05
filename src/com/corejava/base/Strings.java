package com.corejava.base;

public class Strings {

	public static void main(String[] args) {
		String str = "java\u2122";
		System.out.println(str);
		String s = str.substring(0, 4);
		System.out.println(s);
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "hel" + "lo";
		System.out.println(str1 == str2);//可能正确
		System.out.println(str1.equals(str2));
		System.out.println(str1.substring(0, 3));
		System.out.println(str1.substring(0, 3) == "hel");
		System.out.println(str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
		String str4 = "corejava";
		if (str4 != null && str4.length() != 0) {
			System.out.println("字符串既不是空串，也不是null串");
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append(str1);
		builder.append(" ");
		builder.append(str4);
		String str5 = builder.toString();
		System.out.println(str5);
	}

}
