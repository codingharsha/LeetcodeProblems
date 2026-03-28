1class Solution {
2    public List<Integer> findClosestElements(int[] arr, int k, int x) {
3        int start = 0;
4        int end = arr.length - 1;
5
6        while(end - start >= k){
7            if(Math.abs(arr[start] - x) > Math.abs(arr[end] - x)){
8                start++;
9            }else{
10                end--;
11            }
12        }
13
14        ArrayList<Integer> result = new ArrayList<>(k);
15        for(int i = start; i <= end; i++){
16            result.add(arr[i]);
17        }
18
19        return result;
20    }
21}