package com.javalive.mostBasic.firstWeek.day8;

public class StringVsStringBufferVsStringBuilder {
	public static void StrConcat(String str1) {
		str1 = str1 + "ITaspirants.";
		System.out.println(str1.hashCode());
	}

	public static void StrBufConcat(StringBuffer str2) {
		str2.append("ITaspirants.");
		System.out.println(str2.hashCode());
	}

	public static void StrBuildConcat(StringBuilder str3) {
		str3.append("ITaspirants.");
		System.out.println(str3.hashCode());
	}

	public static void main(String[] args) {
		
		//Please refer the hash code before and after change in respective objects of
		//String, StringBuffer and StringBuilder which indirectly tells about the memory location.
		//Same hashCode refer to the same objects.
		//Here you will observe that String object before and after the concatenation have different
		//haseCode while that for StringBuffer and StringBuilder have same hashCode which proves that
		//String objects are immutable while StringBuffer and StringBuilder objects are mutable in nature.
		String str1 = "Hello!";
		System.out.println(str1.hashCode());
		StrConcat(str1);
		System.out.println("The final String is - " + str1);

		StringBuffer str2 = new StringBuffer("Hello!");
		System.out.println(str2.hashCode());
		StrBufConcat(str2);
		System.out.println("The final String is - " + str2);

		StringBuilder str3 = new StringBuilder("Hello!");
		System.out.println(str3.hashCode());
		StrBuildConcat(str3);
		System.out.println("The final String is -" + str3);
	}
}
