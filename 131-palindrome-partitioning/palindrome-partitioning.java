class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res=new ArrayList<>();
        helper(s,new ArrayList<String>());
        return res;
    }

    public void helper(String s, List<String> currentPartitions){
        if(s.isEmpty()){
            res.add(new ArrayList<>(currentPartitions));
            return;
        }
        for(int partition=1;partition<=s.length();partition++){
            String prefix=s.substring(0, partition);
            String remaining=s.substring(partition);
            if(isPalindrome(prefix)){
                currentPartitions.add(prefix);
                helper(remaining,currentPartitions);
                currentPartitions.removeLast();
            }
        }
    }

    public boolean isPalindrome(String s){
        int l=0, r=s.length()-1;
        while(l <  r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}