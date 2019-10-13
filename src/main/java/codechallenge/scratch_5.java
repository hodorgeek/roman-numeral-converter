package codechallenge;

import java.util.Arrays;
import java.util.List;

class Scratch5 {
    public static void main(String[] args) {
        List<Integer> inputs = Arrays.asList(4,13,10,21);
        System.out.println(moves(inputs));
        inputs = Arrays.asList(6,3,4,5);
        System.out.println(moves(inputs));
        inputs = Arrays.asList(5,8,5,11,4,6);
        System.out.println(moves(inputs));
    }

    public static int moves(List<Integer> a) {
        int minMoveCount = 0;
        int i = 0, j = a.size() - 1;
        while(i < j) {
            if(a.get(i) % 2 == 0) {
                i++;
                continue;
            }
            if(a.get(j) % 2 != 0) {
                j--;
                continue;
            }
            if(a.get(i) % 2 != 0 && a.get(j) % 2 == 0) {
                minMoveCount++;
                i++;
                j--;
            }
        }
        return minMoveCount;
    }

}