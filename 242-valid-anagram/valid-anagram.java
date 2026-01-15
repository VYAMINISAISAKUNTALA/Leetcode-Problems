class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen){
            return false;
        }

        HashMap<Character,Integer> sMap=new HashMap<>();
        
        for(char c: s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            if(sMap.containsKey(c)){
                sMap.put(c,sMap.get(c)-1);
            }
        }

        for(char c:s.toCharArray()){
            if(sMap.get(c) >= 1){
                return false;
            }
        }
        return true;
    }
}