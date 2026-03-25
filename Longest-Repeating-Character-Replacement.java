1class Solution {
2    public int characterReplacement(String s, int k) {
3        HashMap<Character, Integer> freq = new HashMap<>();
4        int res = 0, i = 0, maxFreq = 0;
5
6        for(int j = 0; j < s.length(); j++){
7            char c = s.charAt(j);
8
9            freq.put(c, freq.getOrDefault(c, 0) + 1);
10            maxFreq = Math.max(maxFreq, freq.get(c));
11
12            while((j - i + 1) - maxFreq > k){
13                char left = s.charAt(i);
14                freq.put(left, freq.get(left) - 1);
15                i++;
16            }
17
18            res = Math.max(res, j - i + 1);
19        }
20
21        return res;
22    }
23}