import java.util.HashMap;

public class findmaxlength {
        public int findMaxLength(int[] nums) {
            HashMap<Integer,Integer> m = new HashMap<>();
            int currsum=0,len=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) currsum+=-1;
                else currsum+=nums[i];
    
                if(currsum==0 && len<i+1) len=i+1;
                
                else if(m.containsKey(currsum)) len=Math.max(i-m.get(currsum),len);
    
                else m.put(currsum,i);
            }
            return len;
        }
    }

