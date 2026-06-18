1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4
5        for(int num: nums){
6            freq.put(num, freq.getOrDefault(num, 0) + 1);
7        }
8
9        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
10        list.sort((a,b) -> b.getValue() - a.getValue());
11
12        int[] result = new int[k];
13
14        for(int i = 0; i < k; i++){
15            result[i] = list.get(i).getKey();
16        }
17
18        return result;
19    }
20}