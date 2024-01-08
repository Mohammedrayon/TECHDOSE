import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> m = new HashMap<>();
        for(String w:strs){
            char [] arr = w.toCharArray();
            Arrays.sort(arr);
            String newstr = new String(arr);
             m.putIfAbsent(newstr,new ArrayList<>());
             m.get(newstr).add(w);
        }
        return new ArrayList<>(m.values());
    }
}
