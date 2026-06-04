1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] freq = new int[26];
4
5        for(char c : s.toCharArray()){
6            freq[c - 'a']++;
7        }
8
9        for(char c : t.toCharArray()){
10            freq[c - 'a']--;
11        }
12
13        for(int i: freq){
14            if(i != 0) return false;
15        }
16
17        return true;
18    }
19}