package com.vrnda.bo;

import java.util.TreeSet;

public class Solution {

	public static int distinctChars(String s) {
		// Frequency of each character
	    int freq[] = new int[26];
	    int count = 0;
	      
	    // Loop to count the frequency
	    // of each character of the String
	    for (int i = 0; i < s.length(); i++)
	        freq[s.charAt(i) - 'a']++;
	  
	    // If frequency is greater than 0
	    // then the character occured
	    for (int i = 0; i < 26; i++) {
	        if (freq[i] > 0)
	            count++;
	    }
	  
	    return count;
    

        
    }
	
	static int waysToSplit(String s)
	{
	    int n = s.length();
	    int answer = 0;
	      
	    // Loop to choose the partition
	    // index for the String
	    for (int i = 1; i < n; i++) {
	          
	        // Divide in two parts
	        String left = s.substring(0, i);
	        String right = s.substring(i, n);
	  
	        // Check whether number of distinct
	        // characters are equal
	        if (distinctChars(left) ==
	             distinctChars(right))
	            answer++;
	    }
	    return answer;
	}

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int result = sol.waysToSplit("babaa");
        System.out.println(result);
    }
    
    
    
}
