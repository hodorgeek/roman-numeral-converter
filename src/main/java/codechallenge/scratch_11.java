package codechallenge;

import java.util.*;
import java.util.Map.Entry;

// red hat
class Scratch11 {
    public static void main(String[] args) {
        System.out.println(countPairs(Arrays.asList(1, 3, 46, 1, 3, 9), 47));
    }


    public static int countPairs(List<Integer> arr, long k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            long diff = k - arr.get(i);
            if (map.containsKey((arr.get(i)))) {
                int existing = map.get(arr.get(i));
                map.put(arr.get(i), ++existing);
            } else {
                if (!map.containsKey((int) (diff)))
                    map.put((int) diff, 0);
            }
        }
        Set<Entry<Integer, Integer>> entries = map.entrySet();
        for (Entry<Integer, Integer> entry : entries) {
            System.out.println(entry);
            if (entry.getValue() > 0) {
                count++;
            }
        }
        return count;
    }
}