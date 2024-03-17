class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch:jewels.toCharArray())
            for(char cha:stones.toCharArray())
                if(ch==cha)
                    count++;

        return count;
    }
}