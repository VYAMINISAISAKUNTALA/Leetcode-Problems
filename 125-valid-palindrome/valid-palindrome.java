class Solution {
    public boolean isPalindrome(String s) {


        String str = s.toLowerCase();
        str= str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
        

        int strLength=str.length();

        
        StringBuilder reverseStr = new StringBuilder();

        for(int i=strLength-1;i>=0;i--){
            reverseStr.append(str.charAt(i));
        }

        return str.contains(reverseStr.toString());



    }
}