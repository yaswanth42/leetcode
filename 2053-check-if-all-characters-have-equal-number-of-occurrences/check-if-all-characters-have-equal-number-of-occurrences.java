import java.util.*;
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for (char c:s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Set<Integer> freqSet=new HashSet<>(map.values());
        return freqSet.size()==1;
    }
}
