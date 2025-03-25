package io.vels.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SequencedCollection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseThis("abcd"));
    }

    private static String reverseThis(String str) {

        char[] charArray = str.toCharArray();

        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 4));
        l.stream()
                .map(eachInt -> eachInt * 2) // Function ==> apply() ==> (do and return)
                .filter(eachInt -> eachInt < 2) // Predicate ==> test() (do and return only boolean)
                .forEach(System.out::println); // Consumer ==> accept() ==> (do and return nothing)

        String sb =
                IntStream
                        .iterate(charArray.length - 1, i -> i >= 0, i -> i - 1)
                        .mapToObj(i -> String.valueOf(charArray[i]))
                        .collect(Collectors.joining());
        return sb;
    }
}
