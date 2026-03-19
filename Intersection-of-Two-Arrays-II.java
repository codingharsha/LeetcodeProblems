1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        Map<Integer, Integer> map = new HashMap<>();
4        List<Integer> list = new ArrayList<>();
5
6        for(int num: nums1){
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9
10        for(int num: nums2){
11            if(map.containsKey(num) && map.get(num) > 0){
12                list.add(num);
13                map.put(num, map.get(num) - 1);
14            }
15        }
16
17        int[] arr = new int[list.size()];
18        int i = 0;
19        for(int num: list){
20            arr[i++] = num;
21        }
22
23        return arr;
24    }
25}