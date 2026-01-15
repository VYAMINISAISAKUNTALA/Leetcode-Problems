class Solution {
    public boolean isPalindrome(String s) {

        
        
        String str = s.toLowerCase();
        str= str.replaceAll("[^a-zA-Z0-9]","");

        if(str.length() < 1){
            return true;
        }
        
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}