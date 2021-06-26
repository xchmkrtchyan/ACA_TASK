package com.company.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,4,2,5,6);
        System.out.println(integers.stream().reduce((sum, integer) -> sum + integer).get());
        List<Integer> sum = integers.stream().filter((integer -> integer % 2 == 0)).reduce((integer, integer2) -> integer + integer2).stream().collect(Collectors.toList());
        System.out.println(sum);
    }
}
