package com.array_programs;

import java.util.Arrays;
import java.util.Collections;

public class SortFirstHalfInAscendingSecondHalfInDescending {

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 9, 8, 3, 1, 7};
        System.out.println("Previous Array : " + Arrays.toString(arr));
        int[] res = sort(arr);
        System.out.println("After sorting : " + Arrays.toString(res));
    }

    private static int[] sort(int[] arr) {
        int mid = arr.length / 2;

       
        int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
        
        Integer[] secondHalf = Arrays.stream(Arrays.copyOfRange(arr, mid, arr.length))
                                     .boxed()
                                     .toArray(Integer[]::new);

        Arrays.sort(firstHalf);

       
        Arrays.sort(secondHalf, Collections.reverseOrder());

    
        int[] res = new int[arr.length];
        
        System.arraycopy(firstHalf, 0, res, 0, firstHalf.length);
        
        for (int i = mid; i < arr.length; i++) {
            res[i] = secondHalf[i - mid];
        }

        return res;
    }
}
