import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i : nums)
            set.add(i);
        
        for(int i=0;i < nums.length;i++){
            if(!set.contains(i+1))
                res.add(i+1);
        }
        
        return res;
    }
    }