// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         int flag =0;

//         for(int j=1 ;j<=n ;j++){
//             flag=0;
//             for(int i =1 ;i<=j ;i++){
//                 if(j%i==0){
//                     flag++;
//                 }
//             }
//             if(flag==2){
//                 answer++;
//             }
//         }
        
//         return answer;
//     }
// }
// 시간초과
import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Boolean> primeList = new ArrayList<Boolean>(n+1);
        primeList.add(false);
		primeList.add(false);
        
        for(int i=2; i<=n; i++ ){
            primeList.add(i, true);
        }    
            
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
			}
		}

		for(int i=0; i<=n; i++){
			if(primeList.get(i) == true){
                answer++;
			}
		}
        
        return answer;
    }
}