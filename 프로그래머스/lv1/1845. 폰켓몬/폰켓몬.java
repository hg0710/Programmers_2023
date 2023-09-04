import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        
        for(int i =0; i<nums.length ; i++){
            h.put(nums[i], i );
        }
        if(h.size() > nums.length/2) return nums.length/2;
        
        return h.size();
    }
}