import java.util.HashMap;

public class subarraysum {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            // int n=nums.length;
            //int [] sum = new int[nums.length +1];
            // int s=0,c=0;
            // sum[0]=0;
            // for(int i=1;i<=n;i++){
            //     sum[i]=sum[i-1]+nums[i-1];
              
            // }
            // for(int i=0;i<sum.length;i++){
            //     for(int j=i+1;j<sum.length;j++){
            //         if(sum[j]-sum[i]==k){
                        
            //             c++;
            //         }
            //     }
            // }
            //return c;
    
            HashMap<Integer,Integer> m = new HashMap<>();
            int s=0,c=0;
            m.put(0,1);
            for(int n:nums){
                s+=n;
                if(m.containsKey(s-k)){
                    c+=m.get(s-k);
                }
                m.put(s,m.getOrDefault(s,0)+1);
    
            }
            return c;
        }
    }
}
