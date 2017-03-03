/*

https://leetcode.com/problems/reverse-string/

Difficulty: Easy

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

*/
public class Solution {
    public String reverseString(String s) {
        int i=s.length();
        char[] s1 = new char[i];
        while(i>0){
            s1[s1.length-i]=s.charAt(--i);
        }
        return new String(s1);
    }
}