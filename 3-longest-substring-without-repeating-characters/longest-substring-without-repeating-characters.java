class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longSubStringLength=0;
        int length=s.length();
        int l =0;

        HashSet<Character> uniqueSet=new HashSet<>();
        for(int r=0;r<length;r++){
            if(uniqueSet.contains(s.charAt(r))){
                while(uniqueSet.contains(s.charAt(r))){
                    uniqueSet.remove(s.charAt(l));
                    l++;
                   
                }
                uniqueSet.add(s.charAt(r));


            }
           else{
                uniqueSet.add(s.charAt(r));
                int length1=calculateLength(l,r);
                longSubStringLength=Math.max(length1,longSubStringLength);
            }
            
        }
        return longSubStringLength;

    }

    public int calculateLength(int l, int r){
        return r-l+1;
    }


}