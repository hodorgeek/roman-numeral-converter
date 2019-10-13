package codechallenge;

import java.util.Arrays;
import java.util.List;

class Scratch6 {
    public static void main(String[] args) {
        List<Integer> inputs = Arrays.asList(1,2,3,4,6);
        System.out.println(balancedSum(inputs));
        inputs = Arrays.asList(1,2,3,3);
        System.out.println(balancedSum(inputs));
        inputs = Arrays.asList(1,2,1);
        System.out.println(balancedSum(inputs));
    }

    public static int balancedSum(List<Integer> sales) {
        int i = 0, j = sales.size() - 1;
        int leftSum=sales.get(0), rightSum = sales.get(j);
        while(i < j) {
            if(leftSum<rightSum) {
                i++;
                leftSum+=sales.get(i);
            }
            if(leftSum>rightSum) {
                j--;
                rightSum+=sales.get(j);
            }
            if(leftSum == rightSum) {
                if(j-i == 2) {
                    return i+1;
                } else {
                    i++;
                    leftSum+=sales.get(i);
                    j--;
                    rightSum+=sales.get(j);
                }
            }
        }
        return 0;
    }

}