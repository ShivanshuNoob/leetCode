class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
            map.put(x,map.getOrDefault(x,0)+1);
        System.out.println(map);
        int operation=0;

        for(int x:map.keySet()){
            if(map.get(x)==1) return -1;

            
            operation+=map.get(x)/3;

            if(map.get(x)%3!=0) operation++;
            
    
        }

        return operation;
        
    }
    
}