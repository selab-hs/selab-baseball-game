package service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RandomNumberGenerateService {
    public String getNonDuplicateNumber() {
        Set<Integer> numbers = createNonDuplicateNumber();

        return process(numbers);
    }

    private Set<Integer> createNonDuplicateNumber() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 3) {
            numbers.add((int) (Math.random() * 9) + 1);
        }
        return numbers;
    }

    private String process(Set<Integer> numbers){
        Iterator<Integer> numbersInOrder = numbers.iterator();
        String processedNumber = "";
        while (numbersInOrder.hasNext()){
            processedNumber += numbersInOrder.next();
        }
        return processedNumber;
    }
}