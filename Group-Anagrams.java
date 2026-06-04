1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for(String s: strs){
6            char[] arr = s.toCharArray();
7            Arrays.sort(arr);
8            String key = new String(arr);
9
10            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
11        }
12
13        return new ArrayList<>(map.values());
14    }
15    
16}