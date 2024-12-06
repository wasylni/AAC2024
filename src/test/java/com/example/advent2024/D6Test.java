package com.example.advent2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D6Test {

    @Test
    void t1() {
        Integer result = new D6().t1(inputTest);
        Assertions.assertEquals(41, result);

    }

    String inputTest =
            "....#.....\n" +
            ".........#\n" +
            "..........\n" +
            "..#.......\n" +
            ".......#..\n" +
            "..........\n" +
            ".#..^.....\n" +
            "........#.\n" +
            "#.........\n" +
            "......#...";
}