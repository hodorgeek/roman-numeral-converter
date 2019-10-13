package codechallenge;

import java.util.ArrayList;
import java.util.HashMap;

class Scratch2 {
    public static void main(String[] args) {
        int A[] = {2, -2, 3, 0, 4, -7};
        System.out.println(solution(A));
        int B[] = {0, 0, 0, 0};
        System.out.println(solution(B));
        System.out.println(Thread.currentThread().getThreadGroup());
    }

    public static int solution(int[] A) {
        int MAX_CONST = 1000000000;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;
        int fragmentCount = 0;
        boolean isThereNonZero = false;
        for (int i = 0; i < A.length; i++) {
            if (!isThereNonZero && A[i] != 0) {
                isThereNonZero = true;
                break;
            }
        }
        if(!isThereNonZero) {
            return -1;
        }
        for (int i = 0; i < A.length; i++) {

            sum += A[i];

            if (sum == 0) {
                fragmentCount++;
            }

            ArrayList<Integer> list = new ArrayList<>();

            if (map.containsKey(sum)) {
                list = map.get(sum);
                for (int it = 0; it < list.size(); it++) {
                    fragmentCount++;
                }
            }
            list.add(i);
            map.put(sum, list);
        }
        if (fragmentCount > MAX_CONST || !isThereNonZero) {
            return -1;
        }
        return fragmentCount;
    }
}