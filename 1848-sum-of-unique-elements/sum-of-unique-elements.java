class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
            map.put(x,map.getOrDefault(x,0)+1);
        
        for(int x:map.keySet())
            if(map.get(x)==1)
                sum=sum+x;
        
    return sum;
}
}