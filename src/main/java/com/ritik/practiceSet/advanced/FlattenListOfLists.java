package com.ritik.practiceSet.advanced;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> grid = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        List<Integer> list = grid.stream()
                .flatMap(List::stream)
                .distinct()
                .toList();

        List<Integer> collect = grid.stream()
//                .collect(Collectors.flatMapping(List::stream, Collectors.toList()));
                .collect(Collectors.flatMapping(List::parallelStream, Collectors.toList()));
        System.out.println(collect);
    }
}
