package com.JavaChallenges.qa;

import java.util.HashSet;

public class LongestUniqueSubstring {

    //Given a string, find the length of the longest substring without repeating characters.

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
