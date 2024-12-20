package com.example.advent2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class D20Test {

    static D20 d20 = new D20();

    @Test
    void t1() {
        Integer result = d20.t1(inputTest);
        Assertions.assertEquals(41, result);

    }
//
//    @Test
//    void t2() {
//        Integer result = d20.t2(inputTest);
//        Assertions.assertEquals(6, result);
//
//    }

//    @Test
//    void tt1() {
//        Integer result = d20.t1(inputReal);
//        Assertions.assertEquals(4722, result);
//
//    }
//
//    @Test
//    void tt2() {
//        Integer result = d20.t2(inputReal);
//        Assertions.assertEquals(6, result);
//
//    }

    String inputTest =
                    "###############\n" +
                    "#...#...#.....#\n" +
                    "#.#.#.#.#.###.#\n" +
                    "#S#...#.#.#...#\n" +
                    "#######.#.#.###\n" +
                    "#######.#.#...#\n" +
                    "#######.#.###.#\n" +
                    "###..E#...#...#\n" +
                    "###.#######.###\n" +
                    "#...###...#...#\n" +
                    "#.#####.#.###.#\n" +
                    "#.#...#.#.#...#\n" +
                    "#.#.#.#.#.#.###\n" +
                    "#...#...#...###\n" +
                    "###############\n";

    String inputReal =
            "";
}