class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=0;
        right[nums.length-1]=0;
        for(int x=1;x<nums.length;x++)
            left[x]=left[x-1]+nums[x-1];
        
        int x=nums.length-2;
        while(x>=0){
            right[x]=right[x+1]+nums[x+1];
            x--;
        }

        for(int i=0;i<nums.length;i++)
            nums[i]=Math.abs(left[i]-right[i]);

        return nums;
    }
}