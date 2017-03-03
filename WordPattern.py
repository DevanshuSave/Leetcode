/*

https://leetcode.com/problems/word-pattern
Difficulty: Easy


Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

*/

class Solution(object):
    def wordPattern(self, str, pattern):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        ht = {}
        s = set()
        
        words = pattern.split()
        if len(words) != len(str):
            return False
        for i, word in enumerate(words):
            if word in s or str[i] in ht:
                if str[i] not in ht or ht[str[i]] != word:
                    return False
            ht[str[i]] = word
            s.add(word)
        return True