import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topkelement {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(m.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        int [] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=entryList.get(i).getKey();
        }
        return arr;
    }
}
