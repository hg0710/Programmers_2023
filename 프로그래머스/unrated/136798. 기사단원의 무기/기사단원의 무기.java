class Solution {
    public int solution(int number, int limit, int power) {
       
        int[] knight = new int[number];
        
        for(int i = 1 ; i <= number ; i++){
            int cnt = 0;
            for(int j = 1 ; j*j <=i ; j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt +=2;
            }
            knight[i-1] = cnt;
        }
        
        int sum = 0; 
        
        for(int k =0 ; k < knight.length ;k++){
            if(knight[k] > limit){
                knight[k] = power;
            }
            sum += knight[k];
        }
        
        return sum;
    }
}