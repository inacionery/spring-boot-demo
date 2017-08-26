package com.inacionery.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Inácio Nery
 */
@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public boolean binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        int start = 0;
        int end = sortedNumbers.length - 1;
        int mid;
        
        while (start <= end) {
            mid = (start + end) / 2;
            if (numberToSearchFor == sortedNumbers[mid])
                return true;
            if (numberToSearchFor < sortedNumbers[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        
        return false;
    }
}
