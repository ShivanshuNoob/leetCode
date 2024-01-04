class Solution {
    public int balancedStringSplit(String s) {
        int lcount=0;
        int rcount=0;
        int totalCount=0;
        
        for(char ch:s.toCharArray()){
            if(ch=='L')
                lcount++;
            else
                rcount++;
            if(lcount==rcount)
                totalCount++;
        }
        return totalCount;
    }
}