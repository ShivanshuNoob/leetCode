class Solution {
    public boolean check(int[] nums) {
        
        int rt=0;
        for(int x=0;x<nums.length-1;x++){
            if(nums[x]>nums[x+1]){
                rt=x+1;
                break;
            }
        }
        int pt=rt;
        if(rt==0) return true;
        try{
            while(true){
                if(nums[rt]>nums[rt+1])
                    return false;
                else rt++;
            }
        }catch(Exception e){
            if(nums[rt]>nums[0])
                return false;
            for(int x=0;x<pt-1;x++){
                if(nums[x]>nums[x+1])   return false;
            }
        }
        return true;
    }
}