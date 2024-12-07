package com.example.advent2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D6Test {

    static D6 d6 = new D6();

    @Test
    void t1() {
        Integer result = d6.t1(inputTest);
        Assertions.assertEquals(41, result);

    }

    @Test
    void t2() {
        Integer result = d6.t2(inputTest);
        Assertions.assertEquals(6, result);

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

    String inputReal =
            "..#.....................#............#....#...........#...............................#.....#.....................................\n" +
                    ".................#............................#.............##..#...............................#....#..#.........#...............\n" +
                    ".............................................##.........................................#....................#...............#...#\n" +
                    "...##....................#...............#.....#....................#......##..............#............................#....#....\n" +
                    ".................................#..#..............#...........#.............#..#........................#............#...........\n" +
                    ".................#.........................#...........................#........................#........................#........\n" +
                    "...#....................................#....#.........#................#...............#.....#................#.....#............\n" +
                    ".............#.#..........................................................#...#..................#....#.......#.....#...#.........\n" +
                    ".....#........................#....##...#............................................................#............................\n" +
                    "..................#...#.........................................#..................#.............................#.#........#.....\n" +
                    "......#...............................#.#..........##..#...........#.........................#.......#....................#.......\n" +
                    ".................................#..............#...............#........#..........#.........#............#.........#.......#...#\n" +
                    "..#..#............#...#.....................#...............#............#.#........................#........#...............#....\n" +
                    "..............#..#.#........................#.........#...........##.......#..........#.....................#..............#...#..\n" +
                    "..........................#.................##...................................#....#.........#.................................\n" +
                    "..................#..#........#....#...............#..............#.......#.......#......................................#..#...#.\n" +
                    "..........#.#.................#.........#...................#.......................##......#....................#.......#........\n" +
                    "..........#.........#...#......................................................................#.....#............#........#......\n" +
                    "...##.............#...........................................................#..#....................##.#...#.#..#.........#..#..\n" +
                    ".....#......#.............................#.......#...#...#...............#.....#............#........#..#.#......................\n" +
                    "........#................#.........#.......................................................................#..........#...........\n" +
                    ".......#........................................#..........#...............................#..#...................................\n" +
                    "..................##.......#.......#.....#............#.......#...#.........#....##...............#..#.............#..........#...\n" +
                    ".......#...........#...........#...........................#.............#.........#..#........................#.##...............\n" +
                    ".....................................................................#........#....#...........................................#..\n" +
                    "....#...........#......#.........#....................................#.................................#......#..................\n" +
                    "...#........................................#..#...............................#.....................#.#......#...................\n" +
                    "..#.....#.................................#.................#....#............................................#......#............\n" +
                    "...................................................##...........#.......#.............#.................#.......#.................\n" +
                    "..........................................................##..............#....#....#.............#...............................\n" +
                    "........................................................#.....................................#................................#..\n" +
                    "..............##....#..#..........#...........#......#..#....#.......#................#............................#..#...#.......\n" +
                    "..........................#....................#.................................................#................................\n" +
                    "#................................................#.....................#..#...............##........#...#...#.........#...........\n" +
                    "...........#.................................#..#....................#.#.......#..........................#.......#.......#.......\n" +
                    "..............................#......#......#.................#.................#.................#.#.............#..#.#..........\n" +
                    ".......................#....................#....................................#.....#.#.......#............................#...\n" +
                    "...............................................................................................#.#................................\n" +
                    "#..................#.....#...............................#..............#...#.....................................................\n" +
                    "..........................................................#.................................................#.....................\n" +
                    "..........#.........................#.....................................................#.........#..........#................#.\n" +
                    "........#..............#..#......................................#.........#............#.................................#.......\n" +
                    ".......#.........................................................#.........#................#...............................#.....\n" +
                    "...........#............................................#...#.............................#.....^................................#\n" +
                    "................#.............#...#..............................#..................................#.............................\n" +
                    ".........................................................................................................#........................\n" +
                    ".................................................#........#.......................#.#.....#......................#................\n" +
                    ".........#.........#...#....................................................#.....................................................\n" +
                    "##.##..#...................................#......................................................................................\n" +
                    ".................#...........................................................................................#........#...........\n" +
                    ".........................................................................#........................#....#......................#...\n" +
                    "..............#......................#........#..........................#.........#..............................................\n" +
                    ".......................#............................................................................##............................\n" +
                    ".....#.................#........#...#...............#.............................#......................#........................\n" +
                    "....#...................................................................................#............##...........................\n" +
                    "................#............................#............................................#.......................................\n" +
                    ".......................................................................................................#......#...................\n" +
                    "......................................................................................#...#.......................................\n" +
                    "...............................................#........#..........#............................#..............#.......#..........\n" +
                    "..............#.....................#........#..#............................#...#..#.#...................................#.......\n" +
                    "..........#...............................#............................#...........................................#..............\n" +
                    "....#............#.#....#......................................................................#..................................\n" +
                    ".......................#.......................#................................#..............#.....................#.........#..\n" +
                    "...........#.........................#.............#.#........#........#..........................................#...............\n" +
                    ".......#......................#....................#...............................#......................#...........#...........\n" +
                    "............#.....................................................................................................................\n" +
                    "....#.......#............................................................#.........#.............#..........#....#..........#.....\n" +
                    ".......#.........................................................................#..................#..#....#.......#.............\n" +
                    "............................#....#.......#......#.......#.....................#.................#.................................\n" +
                    ".......................................................#.............#..........................#.................................\n" +
                    "....................................#.....................................##......................#............................#..\n" +
                    "..............#...............#....................#.......................#................#......................#..............\n" +
                    "....................#...........................#...................................................................#.............\n" +
                    "...#..........................#...........................#............................................................#..........\n" +
                    "..............#.................#.............................#..#.......#.......................#.##.............................\n" +
                    "....................#.....#...#..............................................#......#...........#.................#..#....#.......\n" +
                    "#......................................#.....................#..#..#.#...........#.............#.................................#\n" +
                    ".....................#...........................................................#..........#............##..........#............\n" +
                    ".......#..................................#...............#..........#....#...................................................#...\n" +
                    ".............#.................#...........................#..............#.................................................#.....\n" +
                    "...............................#......................................##...................................#.#......#..........#..\n" +
                    ".................##....................#.................................................#......................#................#\n" +
                    "........#....................................#..........#.........................#..................#......................#.....\n" +
                    "...#....#...........................#..............................#.#..........................#.................................\n" +
                    ".#...................................#..#......#.................................................................#................\n" +
                    ".................................#...........#................#.#........................#....................................##..\n" +
                    "#..#.....##...............#................................................................#....#......#.........................#\n" +
                    ".#....#......................................................#.........................#.......................................#..\n" +
                    ".#..............................................#.................................................................#...............\n" +
                    "...............#..........................................#...#...............................#.#..#.#........#...................\n" +
                    "..............#................................#.......#..................................#.........................#........#....\n" +
                    ".......................##..................................................#......................................................\n" +
                    "..............................#...............................##..................................................................\n" +
                    "#....................#...........................................................#.............................#..................\n" +
                    "#..................................................................#...#..........................................................\n" +
                    "#..#........#...................................#..#..........##..............#...................................................\n" +
                    ".......................#.....................#....................................................................................\n" +
                    ".....................#...........#.............................................................#........................#....#....\n" +
                    "...............#............................................................................##...#..........................#.....\n" +
                    "...#......................................#.......................................................................................\n" +
                    "....#...........................#.........#.................................................#..........#...#........#....#........\n" +
                    "......#....#.#............................#..........................................#........................................#...\n" +
                    "...........#...#.............................................#......................#..................#.....................#....\n" +
                    "...#..........#........#..........#.......#..............#.............................#.......................#................#.\n" +
                    "...........#...............#...........................................................#..........................................\n" +
                    "..#..........##.................................................#...#...............#.......................#...............##....\n" +
                    ".......................#..............#.............#......................................................#..................#...\n" +
                    "..............#..#........##..........#...................................................#.............##....................#...\n" +
                    "...................#..................................................#................#......#.....#.........#.#...#.............\n" +
                    "..................#.................................................#.................................................#.........#.\n" +
                    "......................................#.#........#.....#...#..........#..............#.........................#...#..............\n" +
                    ".................................#..............#..#.....................#................#.............#..#..#...................\n" +
                    ".........#.......#.#..............#..#...............#.................#..................................#..#....................\n" +
                    ".............................#....#.......##..................................................................................##..\n" +
                    ".....................................................................................#........#.......#......#....................\n" +
                    "........#...........#..........#..........#............................#...............#........#.#...........................#...\n" +
                    ".#.................#...#..............#...#...................#........#...............#..........................................\n" +
                    ".........#............................................##........#......#.....................#.......................#............\n" +
                    ".......................................#..........#..#......#........#..........#..........................#....................#.\n" +
                    "....#......#..........................#....................#.......................................#.....###.......#..............\n" +
                    ".......#..................#....#.......................................................................#..........................\n" +
                    "....#........................#.............................................................#.......#..........................#...\n" +
                    "......................#.................................#..........#................#..#.........................#................\n" +
                    "...........#....................................................#..............#...........................#......................\n" +
                    ".....#................#........#...#....#........#............#...............#.......................#..#.........#..............\n" +
                    "#..................................................#...........................#....#...........#.................................\n" +
                    "....#.#.....................................#.#...............#................#....................................#.............\n" +
                    "............#....................#.#.#...............................................#...................##.......................\n" +
                    "...##..............#........................#.............#.......#...........#.#.##..............................#....##.........\n" +
                    "......#...........#....................................................#.........................##...............................";
}