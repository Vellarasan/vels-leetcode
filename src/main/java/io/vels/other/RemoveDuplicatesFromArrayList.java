package io.vels.other;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3));

        // 1. Remove duplicates from arraylist using set
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list = null;
        list = new ArrayList<>(set);

        // 1. Remove duplicates without set using Streams
        list = list.stream().distinct().toList();

        //

        // 2. Reverse the arraylist
        Collections.reverse(list);

        // Return the second highest value from the list
        Collections.sort(list);
        Integer secondHighest = list.get(list.size() - 2);


    }

    private static List<Integer> mergeSortedArray(ArrayList<Integer> list1,
                                                  ArrayList<Integer> list2) {
        int i = 0;
        int j = 0;

        List<Integer> mergedList = new ArrayList<>();

        while (i < list1.size() && j < list2.size()) {
            // Compare each element
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list1.get(j));
                j++;
            }
        }

        // Check for left over if the list has different size
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        while (j < list1.size()) {
            mergedList.add(list1.get(j));
            j++;
        }

        return mergedList;
    }


    // Given two ArrayLists, find and return a new ArrayList containing only the elements that appear in both lists.
    private static List<Integer> commonElements(ArrayList<Integer> list1,
                                                ArrayList<Integer> list2) {

        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    commonElements.add(list1.get(i));
                }
            }
        }
        return commonElements;

    }
}
