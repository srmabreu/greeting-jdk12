package com.features;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectors {

    public static void main(String[] args) {
        double mean = Stream.of(1,2,3,4,5)
                        .collect(Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (sum, n) -> sum/n
                        ));
        System.out.println(mean);
    }

}
