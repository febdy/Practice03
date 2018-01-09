package com.javaex.problem05;

public class StringUtil {

	public static String concatString(String[] strArray) {
		String result = "";

		for (int i = 0; i < strArray.length; i++) {
			result += strArray[i];
		}

		return result;
	}

}
