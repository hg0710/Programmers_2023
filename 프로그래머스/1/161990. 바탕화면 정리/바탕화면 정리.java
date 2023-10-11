import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        
        int first =0;
        int second =50;
        int third =wallpaper.length;
        int fourth =0;
        
        
        while(!wallpaper[first].contains("#")){
            first++;
        }
        while(!wallpaper[third-1].contains("#")){
            third--;
        }
        
        
        for(int i=0 ; i<wallpaper.length ;i++){
            
            if(wallpaper[i].contains("#") && wallpaper[i].indexOf("#")<=second){
                second = wallpaper[i].indexOf("#");
            }
            
            if(wallpaper[i].lastIndexOf("#")>=fourth){
                fourth = wallpaper[i].lastIndexOf("#") +1;
            }
       
        }
        
        return new int[]{first,second,third,fourth};
    }
}