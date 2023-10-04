class Solution {
    public String solution(String new_id) {
        
        int firstLength = new_id.length();
        new_id = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "");
        
        while(new_id.contains("..")){
            new_id = new_id.replace("..",".");
        }
        
        if(new_id.startsWith(".")){
            new_id = new_id.replaceFirst(".","");
        }
        
        if(new_id.endsWith(".")){
            new_id = new_id.substring(0, new_id.length()-1);
        }
        
        if(new_id.isEmpty()){
            new_id = new_id.concat("a");            
        }
        
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            
            if(new_id.endsWith(".")){
                new_id = new_id.substring(0, new_id.length()-1);
            }
        }
        
        if(new_id.length() <= 2 ){
            while(new_id.length() < 3){
                new_id = new_id.concat(new_id.substring(new_id.length()-1, new_id.length()));
            }
            
        }
        
        return new_id;
    }
}