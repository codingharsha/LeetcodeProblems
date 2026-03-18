1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> set = new HashSet<>();
4        Set<Integer> result = new HashSet<>();
5
6        for(int a: nums1){
7            set.add(a);
8        }
9
10        for(int x: nums2){
11            if(set.contains(x)){
12                result.add(x);
13            }
14        }
15
16        int[] arr = new int[result.size()];
17
18        int i = 0;
19        for(int num: result){
20            arr[i++] = num;
21        }
22
23        return arr;
24
25    }
26}