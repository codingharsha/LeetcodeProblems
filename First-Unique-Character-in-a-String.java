1class Solution {
2    public int firstUniqChar(String s) {
3        Map<Character, Integer> map = new HashMap<>();
4
5        for(char c: s.toCharArray()){
6            map.put(c, map.getOrDefault(c, 0) + 1);
7        }
8
9        for(int i = 0; i < s.length(); i++){
10            if(map.get(s.charAt(i)) == 1) return i;
11        }
12
13        return -1;
14    }
15}