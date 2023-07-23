class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int sum =0;
        
        
        String[] arr = str.split("");
        
        for(String i : arr){
            sum += Integer.parseInt(i);
        }
        
        if(x % sum ==0) return true;
        else return false;
    }
}