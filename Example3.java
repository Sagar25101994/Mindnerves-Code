package L1;

import java.util.HashSet;
import java.util.Set;

public class Example3 {

    public static void main(String[] args) {
        int[] arr1 = {21, 43, 54, 23, 67, 90, 84, 34, 45, 55, 76, 26, 48};
        int reverseCount = reverseCount(arr1);
        System.out.println(reverseCount);

        int[] arr2 = {21, 12, 24, 42};
        System.out.println(reverseCount(arr2));

        //no reverse numbers present in the below array
        int[] arr3 = {21, 22, 23, 24};
        System.out.println(reverseCount(arr3));
    }

    private static int reverseCount(int[] arr) {
        Set<Integer> visitedIntegers = new HashSet<>();
        int totalCount = 0;
        for(int no: arr){
            if(visitedIntegers.contains(reverse(no))){
                totalCount += 1;
            }else{
                visitedIntegers.add(no);
            }
        }
        return totalCount;
    }

    private static int reverse(int no) {
        return (no%10)*10 + (no/10);
    }

}
