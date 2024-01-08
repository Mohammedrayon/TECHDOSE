import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findallanagram {
    public List<Integer> findAnagrams(String s, String p) {
        int sl=s.length();
        int pl=p.length();
        int [] arr1 = new int[26];//pl
        int [] arr2 = new int[26];//sl
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<pl;i++){
            arr1[p.charAt(i)-'a']++;  
        }
        int l=0,r=pl-1;
        while(l<sl-pl+1){
            for(int i=l;i<=r;i++){
                arr2[s.charAt(i)-'a']++;
            }
            if(Arrays.equals(arr1,arr2)) res.add(l);
            l++;
            r++;
            Arrays.fill(arr2,0);
        }
        return res;
    }
}

