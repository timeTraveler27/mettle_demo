package com.mettle.duplicateFinder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <h1>Duplicate Finder</h1>
 * Returns the first duplicate number in a list
 * @author  Julius Eke
 * @since   02-08-2023
 */
public class DuplicateFinder {
    private static final String EMPTY_LIST_MSG = "The list is empty, some values are required";
    private static final String NO_DUP_MSG = "There are no duplicates";

    /**
     * @param numbers list of integers
     * @return String returns a string of the 1st duplicate or a message
     * @throws NullPointerException
     */
    public String findDuplicate(List<Integer> numbers) {
        try {
            Integer duplicateNum = null;
            int listSize = numbers.size();
            Set<Integer> testDuplicate = new HashSet<>();

            if (listSize == 0) {
                return EMPTY_LIST_MSG;
            }

            for (int i = 0; i < listSize; i++) {
                if (!testDuplicate.add(numbers.get(i))) {
                    duplicateNum = numbers.get(i);
                    break;
                }

                testDuplicate.add(numbers.get(i));
            }

            return duplicateNum == null ? NO_DUP_MSG : duplicateNum.toString();
        }
        catch (Exception ex){
            throw new NullPointerException("List cannot be null");
        }
    }
}
