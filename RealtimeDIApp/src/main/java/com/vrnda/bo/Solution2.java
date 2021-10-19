package com.vrnda.bo;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		int N = 7, k = 3; 
		String word = "qwertyuioplkjhgfdsazxcvbnm";
		char[] chars = new char[N];
		for (int i = 0; i<k; i++) {
			chars[i] = word.charAt(i);
			chars[N-i-1] = word.charAt(i);
		}
		for (int i =0; i<chars.length; i++) {
			if (chars[i] == '\u0000') {
				chars[i] = word.charAt(word.length() - 1);
			}
		}
		
		System.out.println(String.valueOf(chars));
	}

}
