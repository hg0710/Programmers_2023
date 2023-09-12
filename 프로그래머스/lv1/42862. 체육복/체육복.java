import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostList = new ArrayList<Integer>();
        List<Integer> reserveList = new ArrayList<Integer>();
        
        for(int i : lost){
            lostList.add(i);
        }               
        for(int i : reserve){
            reserveList.add(i);
        }
        
        List<Integer> numList = new ArrayList<Integer>();
        //reserveList에서 같은거 제거 
        for(int i = 0 ; i<lostList.size() ; i++){
            if(reserveList.contains(lostList.get(i))){
                reserveList.remove(lostList.get(i));
                
                numList.add(lostList.get(i));
            }
        }
        //lostList에서 같은거 제거 
        for(int j = 0 ; j<numList.size() ; j++){
            lostList.remove(numList.get(j));
        }
        
        if(lostList.size()==0) return n;
        
        //reserveList에서 -1,+1차이나는거 제거
        for(int k =0 ; k<lostList.size() ;k++){
            int a = lostList.get(k);
            
            if(reserveList.contains(a-1)){
                reserveList.remove(Integer.valueOf(a-1));
            }else if(reserveList.contains(a+1)){
                reserveList.remove(Integer.valueOf(a+1));
            }else{
                n--;
            }
        }
        
        
        return n;

    }
}
