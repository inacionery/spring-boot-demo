package com.inacionery.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Inácio Nery
 */
@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
        
        return numbers;
    }

    private void sort(int[] numbers, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = split(numbers, start, end);

        sort(numbers, start, pivot - 1);

        sort(numbers, pivot + 1, end);
    }

    private int split(int[] numbers, int start, int end) {
        int pivot = numbers[start];
        int i = start + 1;
        int f = end;

        while (i <= f) {
            if (numbers[i] <= pivot) {
                i++;
            }
            else if (pivot < numbers[f]) {
                f--;
            }
            else {
                int aux = numbers[i];
                numbers[i] = numbers[f];
                numbers[f] = aux;
                i++;
                f--;
            }
        }

        numbers[start] = numbers[f];
        numbers[f] = pivot;

        return f;
    }
}
