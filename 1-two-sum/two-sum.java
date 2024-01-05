class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x=0;x<arr.length;x++){
            map.put(arr[x],x);
        }
        for(int x=0;x<arr.length;x++){
            if(map.containsKey(target-arr[x]) && map.get(target-arr[x])!=x)
                return new int[] {x, map.get(target-arr[x])};

        }
        System.out.println(map);
        return null;
    }
}