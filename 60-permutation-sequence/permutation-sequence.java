class Solution {
    public String getPermutation(int n, int k) {
        int[] factorial=new int[n+1];
        List<Integer> numbers=new ArrayList<>();

        factorial[0]=1;
        for(int i=1;i<=n;i++){
            numbers.add(i);
            factorial[i]=factorial[i-1] * i;
        }

        k--;

        StringBuilder result=new StringBuilder();
        for(int i=n;i>=1;i--){
            int f=factorial[i-1];
            int index = k / f;
            result.append(numbers.get(index));
            numbers.remove(index);
            k%=f;
        }
        return result.toString();
    }
}