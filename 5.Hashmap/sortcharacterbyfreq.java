import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortcharacterbyfreq {
        public String frequencySort(String s) {
            HashMap<Character,Integer> m = new HashMap<>();
            for(char c: s.toCharArray()){
                m.put(c,m.getOrDefault(c,0)+1);
            }
            List<Map.Entry<Character, Integer>> arr = new ArrayList<>(m.entrySet());
            arr.sort((a,b)->b.getValue()-a.getValue());
            StringBuilder sb= new StringBuilder();
            for(Map.Entry<Character,Integer> e : arr){
                char k = e.getKey();
                int v = e.getValue();
                for(int  j=0;j<v;j++){
                    sb.append(k);
                }
            }
            return sb.toString();
        }
    }

