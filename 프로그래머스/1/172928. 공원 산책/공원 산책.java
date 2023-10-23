import java.util.*;
class Solution {
    public List<Integer> solution(String[] park, String[] routes) {
        
        List<Integer> start = new ArrayList<Integer>();
        List<List<Integer>> x = new ArrayList<>();
        
        for(int i =0 ; i< park.length ; i++){
            String[] parks = park[i].split("");
            for(int j =0; j<parks.length ; j++){
                if(parks[j].equals("S")){
                    start.add(i);
                    start.add(j);  
                }
                if(parks[j].equals("X")){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    x.add(list);                          
                }
            }
        }
     
        
        for(int k =0; k<routes.length ;k++){
            String[] way = routes[k].split(" ");
            
            int count = Integer.parseInt(way[1]);   
            
            int a = start.get(0);
            int b = start.get(1);
            //(+1,0)
            if(way[0].equals("S")){
                if(park.length > count + a){
                    start.set(0,count + a);                
                }
                for(int l =0 ; l<x.size() ; l++){
                    if(b == x.get(l).get(1)){
                        if(a < x.get(l).get(0) && x.get(l).get(0) <= a +count){
                            start.set(0,a);
                        }
                    }
                }
            }
            //(-1,0)
            if(way[0].equals("N")){
                if(a -count >=0){
                    start.set(0,a- count);
                }
                for(int l =0 ; l<x.size() ;l++){
                    if(b == x.get(l).get(1)){
                        if(a > x.get(l).get(0) && x.get(l).get(0) >= a - count){
                            start.set(0,a);
                        }
                    }
                }
            }
            //(0,+1)
            if(way[0].equals("E")){
                if(park[0].length() > count+ b){
                    start.set(1,count+ b);
                }
                for(int l =0 ; l<x.size() ; l++){
                    if(a == x.get(l).get(0)){
                        if(b < x.get(l).get(1) && x.get(l).get(1) <= b +count){
                            start.set(1,b);
                        }
                    }
                }
            }
            //(0,-1)
            if(way[0].equals("W")){
                if(b -count >=0){
                    start.set(1,b - count);
                }
                for(int l =0 ; l<x.size() ; l++){
                    if(a == x.get(l).get(0)){
                        if(b > x.get(l).get(1) && x.get(l).get(1) >= b -count){
                            start.set(1,b);
                    
                        }
                    }
                }
            }
            
            
        }
        
        return start;
    }
}

