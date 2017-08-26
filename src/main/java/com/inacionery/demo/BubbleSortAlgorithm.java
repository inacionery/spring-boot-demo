package com.inacionery.demo;

import org.springframework.stereotype.Component;

/**
 * @author Inácio Nery
 */
@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        boolean end = false;

        do {
            end = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int aux = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = aux;
                    end = true;
                }
            }
        } while (end);

        return numbers;
    }
}
