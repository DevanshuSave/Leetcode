import java.util.ArrayList;
import java.util.List;

/*

https://leetcode.com/problems/fizz-buzz/

Difficulty: Easy

Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

*/

public class Fizzbuzz {
    public List<String> fizzBuzz(int n) {
        List <String> l = new ArrayList<String>();
        String s;
        for(int i=1;i<=n;i++) {
            s="";
            if(i%3==0) {
                s="Fizz";
            }
            if (i%5==0) {
                s+="Buzz";
            }
            if(i%3!=0 && i%5!=0) {
                s=""+i;
            }
            l.add(s);
        }
        return l;
    }
}