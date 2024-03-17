class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map=new HashMap<>();

        int alphabet=97;
        for(char ch:key.toCharArray()){
            if(ch!=32 && !map.containsKey(ch))
            map.put(ch,(char)alphabet++);
        }
        System.out.println(map);
        
        String s="";
        for(char ch:message.toCharArray())
            if(ch!=32)
            s+=map.get(ch);
            else
            s+=" ";

        return s;
    }
}