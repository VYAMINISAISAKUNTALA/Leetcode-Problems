class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        

        int len = words.length;

        List<List<Integer>> result = new ArrayList<>();

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0;i<len;i++){
            hm.put(words[i], i);
        }

        for(int i =0;i<len;i++){
            String word = words[i];

            for(int j =0; j<= word.length();j++){

                String prefix = word.substring(0, j);
                String suffix = word.substring(j);

                if(isPalindrome(prefix)){
                    String reversed = new StringBuilder(suffix).reverse().toString();

                    if(hm.containsKey(reversed) && hm.get(reversed)!=i){
                        result.add(Arrays.asList(hm.get(reversed) ,i));
                    }
                }

                if(j != word.length()  && isPalindrome(suffix)){
                    String reverse = new StringBuilder(prefix).reverse().toString();

                    if(hm.containsKey(reverse) && hm.get(reverse) !=i){
                        result.add(Arrays.asList(i,hm.get(reverse)));
                    }
                }
            }
        }

        return result;

    }
    public boolean isPalindrome(String s){

        int left =0 , right = s.length()-1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }

}