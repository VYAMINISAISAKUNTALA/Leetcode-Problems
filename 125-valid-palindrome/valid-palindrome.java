class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();

        if(len == 1) return true;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<len;i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                str.append((char)(s.charAt(i) + ' '));
            }else if(s.charAt(i) >='a' && s.charAt(i) <='z' || s.charAt(i) >='0' && s.charAt(i) <='9'){
                str.append(s.charAt(i));
            }
        }
        int n = str.length();
        StringBuilder revStr=new StringBuilder();
        for(int i = n-1;i>=0;i--){
            revStr.append(str.charAt(i));
        }
        return str.toString().equals(revStr.toString());
    }
}