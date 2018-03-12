/*

https://leetcode.com/problems/reverse-integer/?tab=Description

Difficulty: Easy

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

*/


public class ReverseInteger {
    public int reverse(int x) {
        long a=0;
        int flag=1;
        if (x<0){
            flag=-1;
            x*=-1;
        }
        while(x>0){
            a*=10;
            a+=x%10;
            x/=10;
        }
        if(Math.abs(a)>Math.pow(2,31))
            return 0;
        return flag*(int)a;
    }
}