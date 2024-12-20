package com.example.advent2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class D2Test {

    @Test
    void testD2() {
        Integer result = D2.howManySafe(testInput);
        Assertions.assertEquals(2, result);
    }

    @Test
    void testD2Case2() {
        Integer result = D2.howManySafeIgnoreOne(testInput);
        Assertions.assertEquals(4, result);
    }

    String testInput = "" +
            "7 6 4 2 1\n" +
            "1 2 7 8 9\n" +
            "9 7 6 2 1\n" +
            "1 3 2 4 5\n" +
            "8 6 4 4 1\n" +
            "1 3 6 7 9\n";

    String testReal = "16 19 21 24 21\n" +
            "15 18 19 22 24 25 25\n" +
            "80 81 83 84 87 89 93\n" +
            "6 7 8 9 10 13 18\n" +
            "60 62 61 64 66 67\n" +
            "76 79 81 84 82 80\n" +
            "70 73 72 74 74\n" +
            "67 68 71 74 73 77\n" +
            "56 57 60 59 61 64 67 74\n" +
            "37 38 39 40 40 43\n" +
            "90 92 95 95 96 97 94\n" +
            "80 83 86 86 86\n" +
            "44 47 49 49 51 54 58\n" +
            "69 71 74 74 81\n" +
            "66 68 72 75 77\n" +
            "34 35 39 41 38\n" +
            "58 60 63 67 70 72 72\n" +
            "43 46 47 51 52 53 56 60\n" +
            "35 36 37 41 44 50\n" +
            "63 64 67 69 71 72 78 80\n" +
            "19 22 23 30 28\n" +
            "20 21 24 30 30\n" +
            "75 78 80 83 90 91 95\n" +
            "16 17 20 22 23 29 31 36\n" +
            "22 21 24 26 28\n" +
            "87 84 87 88 86\n" +
            "48 46 48 51 51\n" +
            "40 37 40 43 44 48\n" +
            "77 75 78 79 81 84 86 91\n" +
            "43 41 40 42 44\n" +
            "32 30 31 32 35 32 29\n" +
            "87 84 81 83 83\n" +
            "43 41 44 47 48 45 49\n" +
            "49 48 51 53 54 57 54 61\n" +
            "68 66 69 69 72 75 77\n" +
            "9 7 8 10 10 12 11\n" +
            "77 74 77 77 77\n" +
            "5 2 4 4 8\n" +
            "34 33 36 36 42\n" +
            "11 9 13 15 18 21\n" +
            "22 21 22 23 27 24\n" +
            "68 67 70 74 77 80 82 82\n" +
            "87 86 87 91 95\n" +
            "26 23 27 28 30 35\n" +
            "23 20 21 28 31\n" +
            "85 83 89 92 95 96 94\n" +
            "32 31 38 40 40\n" +
            "40 38 40 41 43 49 51 55\n" +
            "22 19 21 23 29 35\n" +
            "86 86 89 91 94 96 98\n" +
            "72 72 73 75 77 78 76\n" +
            "42 42 45 48 49 49\n" +
            "41 41 43 46 48 49 53\n" +
            "35 35 37 39 41 43 48\n" +
            "85 85 86 83 86 87 88 91\n" +
            "20 20 19 20 21 20\n" +
            "13 13 14 13 15 18 18\n" +
            "48 48 50 48 50 54\n" +
            "26 26 23 25 30\n" +
            "62 62 64 66 66 67\n" +
            "31 31 32 34 35 35 38 37\n" +
            "11 11 14 14 14\n" +
            "6 6 9 12 12 13 14 18\n" +
            "5 5 5 7 9 14\n" +
            "87 87 91 92 95 96 99\n" +
            "61 61 65 67 64\n" +
            "77 77 78 82 85 85\n" +
            "48 48 52 53 57\n" +
            "69 69 70 74 81\n" +
            "29 29 30 32 35 37 44 46\n" +
            "52 52 54 56 57 63 64 62\n" +
            "42 42 45 47 48 51 57 57\n" +
            "57 57 60 65 69\n" +
            "28 28 33 34 36 38 44\n" +
            "41 45 48 50 52 55 58\n" +
            "79 83 84 85 86 83\n" +
            "69 73 74 77 79 81 81\n" +
            "14 18 21 22 24 28\n" +
            "26 30 33 36 43\n" +
            "8 12 13 12 14 16 17\n" +
            "84 88 91 92 89 92 94 92\n" +
            "30 34 32 34 37 37\n" +
            "3 7 5 6 9 10 14\n" +
            "31 35 37 35 36 39 45\n" +
            "59 63 65 66 67 67 68\n" +
            "13 17 18 21 21 18\n" +
            "72 76 78 79 82 82 82\n" +
            "4 8 9 9 10 13 14 18\n" +
            "42 46 49 49 52 57\n" +
            "17 21 24 28 29\n" +
            "64 68 69 73 75 78 77\n" +
            "57 61 63 67 67\n" +
            "11 15 19 22 26\n" +
            "78 82 83 87 94\n" +
            "34 38 45 47 48 49 52\n" +
            "44 48 55 56 55\n" +
            "45 49 52 57 59 60 63 63\n" +
            "48 52 55 62 66\n" +
            "14 18 20 27 34\n" +
            "9 15 18 20 23 25\n" +
            "4 10 11 12 14 17 18 16\n" +
            "4 10 12 13 15 17 17\n" +
            "18 23 24 25 27 31\n" +
            "27 33 35 37 40 42 47\n" +
            "16 22 24 21 22 25 27\n" +
            "42 49 52 49 47\n" +
            "39 44 45 43 44 46 49 49\n" +
            "29 36 39 42 45 46 43 47\n" +
            "37 42 43 42 45 48 53\n" +
            "54 60 63 63 65\n" +
            "66 71 73 76 76 79 77\n" +
            "56 62 62 64 66 66\n" +
            "69 76 79 82 83 83 87\n" +
            "77 84 84 87 93\n" +
            "76 81 85 87 89 91 94\n" +
            "70 77 81 82 85 87 89 87\n" +
            "14 20 22 26 28 28\n" +
            "56 61 65 68 72\n" +
            "78 85 86 90 95\n" +
            "22 29 30 36 39 40 42 44\n" +
            "18 25 27 28 35 38 39 38\n" +
            "15 21 24 25 27 34 34\n" +
            "21 26 27 33 36 40\n" +
            "42 48 49 51 52 57 64\n" +
            "97 96 94 91 88 89\n" +
            "74 71 68 67 66 66\n" +
            "67 64 61 58 57 53\n" +
            "63 61 60 57 54 52 51 44\n" +
            "41 40 37 35 34 35 33\n" +
            "53 50 52 51 52\n" +
            "31 28 25 24 23 20 22 22\n" +
            "25 24 27 25 24 21 18 14\n" +
            "82 80 78 81 78 76 70\n" +
            "36 33 32 31 31 30\n" +
            "66 65 65 64 63 61 59 61\n" +
            "82 79 79 76 75 72 72\n" +
            "94 92 90 90 87 85 81\n" +
            "22 19 19 18 13\n" +
            "39 38 35 34 31 29 25 24\n" +
            "72 70 67 63 62 59 58 59\n" +
            "28 26 23 19 19\n" +
            "24 22 20 16 13 10 9 5\n" +
            "63 62 58 57 52\n" +
            "27 25 23 21 16 14 13 11\n" +
            "76 74 72 65 64 65\n" +
            "25 23 17 14 14\n" +
            "78 77 76 69 68 67 64 60\n" +
            "78 76 70 68 66 65 63 58\n" +
            "63 66 64 63 62 61 60 57\n" +
            "61 63 60 57 54 53 56\n" +
            "90 92 89 88 85 83 82 82\n" +
            "41 42 39 38 36 35 33 29\n" +
            "15 17 15 12 11 9 3\n" +
            "77 79 78 77 80 79 76\n" +
            "43 46 44 45 44 41 42\n" +
            "27 30 33 32 32\n" +
            "18 19 16 13 16 12\n" +
            "16 17 14 12 10 8 11 6\n" +
            "77 80 80 78 75\n" +
            "31 34 34 32 34\n" +
            "3 6 5 5 2 2\n" +
            "76 78 75 72 69 69 65\n" +
            "43 45 43 43 41 35\n" +
            "36 39 38 35 33 29 28\n" +
            "81 84 81 77 75 78\n" +
            "40 42 38 36 33 32 29 29\n" +
            "29 31 29 28 25 24 20 16\n" +
            "80 82 79 76 75 71 69 63\n" +
            "49 52 50 47 46 41 39\n" +
            "78 79 78 77 72 69 66 67\n" +
            "12 13 11 5 5\n" +
            "12 15 14 9 8 7 6 2\n" +
            "44 46 45 43 38 36 30\n" +
            "61 61 58 56 53 52 50 47\n" +
            "35 35 32 31 28 30\n" +
            "46 46 44 42 42\n" +
            "80 80 77 76 72\n" +
            "63 63 60 59 56 55 49\n" +
            "77 77 80 78 75 73\n" +
            "52 52 51 52 53\n" +
            "12 12 11 9 10 10\n" +
            "60 60 63 61 58 54\n" +
            "67 67 69 67 62\n" +
            "95 95 93 93 92 91\n" +
            "53 53 52 52 51 48 51\n" +
            "67 67 67 66 63 63\n" +
            "11 11 10 7 7 3\n" +
            "26 26 23 21 20 20 13\n" +
            "80 80 78 74 73 72 70 67\n" +
            "54 54 53 49 52\n" +
            "63 63 62 59 55 53 53\n" +
            "61 61 57 55 51\n" +
            "69 69 68 66 62 55\n" +
            "85 85 82 75 74 73 72\n" +
            "47 47 42 40 39 37 34 36\n" +
            "60 60 59 58 55 52 47 47\n" +
            "77 77 75 69 68 64\n" +
            "53 53 52 45 44 43 36\n" +
            "43 39 36 33 30 29 26 23\n" +
            "65 61 60 57 54 56\n" +
            "55 51 48 47 45 42 42\n" +
            "52 48 47 45 43 41 37\n" +
            "29 25 24 23 22 17\n" +
            "38 34 37 35 32 29 28 26\n" +
            "24 20 19 17 15 14 17 20\n" +
            "33 29 28 25 26 26\n" +
            "38 34 35 32 31 27\n" +
            "33 29 27 24 23 24 23 17\n" +
            "36 32 32 31 29 26\n" +
            "13 9 8 5 3 1 1 4\n" +
            "6 2 1 1 1\n" +
            "78 74 73 72 72 70 69 65\n" +
            "44 40 40 37 30\n" +
            "41 37 33 30 28\n" +
            "88 84 83 79 78 75 73 74\n" +
            "12 8 4 2 1 1\n" +
            "65 61 57 54 50\n" +
            "85 81 77 74 68\n" +
            "76 72 66 64 62\n" +
            "97 93 90 87 81 84\n" +
            "64 60 53 51 48 48\n" +
            "56 52 50 45 43 39\n" +
            "56 52 49 43 40 39 36 30\n" +
            "60 53 51 50 48\n" +
            "36 31 29 26 25 24 26\n" +
            "55 50 48 47 44 42 41 41\n" +
            "90 85 83 81 77\n" +
            "89 82 80 77 70\n" +
            "56 49 52 49 47\n" +
            "9 3 5 3 6\n" +
            "9 4 5 4 4\n" +
            "18 12 14 12 8\n" +
            "66 59 58 56 53 54 49\n" +
            "97 90 88 87 84 82 82 80\n" +
            "60 55 53 52 52 54\n" +
            "12 5 5 4 4\n" +
            "26 19 19 16 15 11\n" +
            "68 62 60 57 56 56 54 47\n" +
            "59 52 48 46 45 42\n" +
            "21 16 12 9 12\n" +
            "99 92 91 88 84 81 81\n" +
            "58 52 49 45 43 42 38\n" +
            "48 41 38 36 35 34 30 23\n" +
            "31 26 24 18 15 13\n" +
            "18 13 11 6 8\n" +
            "99 93 88 85 84 84\n" +
            "85 78 75 73 68 64\n" +
            "86 81 75 72 66\n" +
            "5 9 7 9 6\n" +
            "22 26 29 32 29 31 34 34\n" +
            "22 29 30 32 34 39 45\n" +
            "52 45 43 41 40 37 32 34\n" +
            "30 32 34 39 43\n" +
            "11 16 18 22 22\n" +
            "68 72 75 76 79 82 86 85\n" +
            "69 74 76 80 84\n" +
            "65 65 63 61 57 55 53 48\n" +
            "26 25 20 17 15 12 9\n" +
            "27 29 28 23 21 16\n" +
            "49 53 54 57 59 62 66\n" +
            "72 72 73 80 82 85\n" +
            "44 47 49 50 54 55 57 57\n" +
            "20 19 17 19 21\n" +
            "18 18 22 24 26 29 31 32\n" +
            "48 52 54 54 56 56\n" +
            "72 76 79 78 84\n" +
            "64 60 57 53 48\n" +
            "48 44 42 40 37 33 32 35\n" +
            "52 52 48 45 44 41 38 40\n" +
            "70 76 78 80 80 87\n" +
            "55 54 52 48 44\n" +
            "39 38 32 31 30 28 22\n" +
            "8 8 5 1 1\n" +
            "43 48 50 53 57\n" +
            "29 32 29 27 28 26 27\n" +
            "44 49 51 53 60 61 65\n" +
            "16 17 10 8 8\n" +
            "36 31 28 25 22 20 20 17\n" +
            "61 54 51 44 42 39 35\n" +
            "96 90 88 84 83 80 79\n" +
            "55 58 57 53 50 50\n" +
            "41 46 48 50 48 54\n" +
            "7 11 12 14 14 17 23\n" +
            "79 82 81 77 74 77\n" +
            "34 28 24 21 22\n" +
            "77 81 84 86 87 90 94 94\n" +
            "67 74 77 79 80 83 87 90\n" +
            "94 90 89 84 80\n" +
            "65 64 63 60 60\n" +
            "40 44 47 48 52 53 55\n" +
            "35 35 34 33 32 29 27 29\n" +
            "75 82 85 88 90 89 88\n" +
            "92 88 88 87 86 83 80\n" +
            "99 92 91 86 84\n" +
            "11 9 6 2 5\n" +
            "57 57 50 48 44\n" +
            "21 18 19 23 28\n" +
            "30 33 31 31 30 27 23\n" +
            "22 22 22 19 14\n" +
            "61 57 54 54 52 45\n" +
            "81 81 84 82 80\n" +
            "93 93 90 88 91 90 87 83\n" +
            "29 36 40 41 47\n" +
            "84 83 84 86 86 88\n" +
            "33 37 38 45 52\n" +
            "56 60 64 65 66 67 71\n" +
            "98 98 97 96 96 94 94\n" +
            "96 89 86 84 77 74 68\n" +
            "51 45 44 43 36 36\n" +
            "66 63 70 73 79\n" +
            "84 79 76 74 71 71 70 70\n" +
            "27 23 22 19 14 13 10 5\n" +
            "91 84 83 82 80 76\n" +
            "13 14 17 20 21 26 26\n" +
            "96 97 96 93 89 88 86\n" +
            "39 45 46 43 44 45\n" +
            "87 80 76 75 72 72\n" +
            "86 88 89 90 92 93 92 91\n" +
            "45 45 48 50 57 54\n" +
            "65 63 65 67 70 67\n" +
            "38 34 32 32 30 27 25 21\n" +
            "17 21 23 20 22 23 26 28\n" +
            "65 66 71 74 75\n" +
            "6 6 9 12 15 18 22\n" +
            "76 78 76 78 80 81 88\n" +
            "32 25 24 22 21 21\n" +
            "49 50 52 54 54 56 59 59\n" +
            "16 13 16 19 20 27 29\n" +
            "71 71 73 71 70\n" +
            "75 69 66 66 65 58\n" +
            "58 55 57 60 61 64 66 73\n" +
            "52 53 53 51 48 47 44\n" +
            "28 21 19 17 15 11 7\n" +
            "57 60 61 64 61 63 65 69\n" +
            "8 5 8 9 10 14\n" +
            "65 58 56 56 53 51 54\n" +
            "68 67 69 76 80\n" +
            "21 21 21 18 17 14 12 8\n" +
            "67 66 68 66 63 60 54\n" +
            "26 27 25 20 19 17 14 16\n" +
            "31 30 33 34 34\n" +
            "53 55 59 62 60\n" +
            "96 92 95 93 90 89 83\n" +
            "13 18 20 23 26 25 29\n" +
            "36 36 36 35 36\n" +
            "61 61 58 56 52 49 46\n" +
            "38 35 38 41 38 40 39\n" +
            "11 14 13 10 8 2\n" +
            "11 14 15 21 18\n" +
            "50 53 53 51 48 47 47\n" +
            "27 25 23 25 23 26\n" +
            "48 48 45 44 45 42 45\n" +
            "66 62 61 59 54 51 53\n" +
            "6 6 8 5 7 8 9 14\n" +
            "67 67 65 68 69 72 72\n" +
            "66 64 65 66 73 70\n" +
            "94 92 94 95 97 99\n" +
            "90 89 86 85 84 82 82 78\n" +
            "77 77 81 84 87 87\n" +
            "31 36 38 36 39 41 42 42\n" +
            "73 69 68 67 68 66 66\n" +
            "14 12 11 10 7 4 6 6\n" +
            "29 25 23 22 19 17 16 10\n" +
            "80 81 80 78 79 79\n" +
            "9 7 7 9 10 7\n" +
            "88 84 81 79 79 79\n" +
            "27 28 29 32 33 35 38 42\n" +
            "13 11 8 8 6 5 8\n" +
            "30 37 44 47 48\n" +
            "53 54 61 62 65 68 74\n" +
            "54 54 51 44 41 38 35 35\n" +
            "38 38 35 30 28 25 28\n" +
            "83 90 93 96 94\n" +
            "70 74 75 77 80 81 82\n" +
            "71 74 71 70 68 67 68\n" +
            "35 35 33 36 39 41 45\n" +
            "32 29 27 23 23\n" +
            "45 49 51 53 56 61 61\n" +
            "20 20 18 19 13\n" +
            "64 60 58 55 52\n" +
            "2 2 2 5 6 10\n" +
            "68 69 67 65 63 63\n" +
            "67 71 74 76 79 79\n" +
            "42 37 34 32 31 29 28 26\n" +
            "24 28 31 35 37 40 42 49\n" +
            "79 77 80 80 80\n" +
            "58 51 50 50 47 46 42\n" +
            "23 28 35 37 40 43 43\n" +
            "26 30 31 33 32 35 39\n" +
            "53 55 58 58 62\n" +
            "88 82 80 78 75 77 75\n" +
            "70 68 69 70 70 72 79\n" +
            "27 29 31 31 34 36 38 39\n" +
            "3 4 5 6 7 9 9 15\n" +
            "46 45 41 38 37 31\n" +
            "51 52 52 55 56 59 56\n" +
            "69 68 69 73 73\n" +
            "78 84 86 86 88 89 93\n" +
            "14 7 9 8 6 3 6\n" +
            "28 26 24 22 19 16 15 11\n" +
            "86 86 81 78 75 74\n" +
            "50 43 39 37 35 30\n" +
            "54 60 64 65 66 63\n" +
            "54 54 51 48 45\n" +
            "74 74 74 77 80 81 82 81\n" +
            "21 21 18 14 11 9 5\n" +
            "49 54 55 57 57\n" +
            "79 78 77 75 74 71 70 64\n" +
            "15 15 18 20 22\n" +
            "98 91 90 89 87 86 89 83\n" +
            "95 91 90 86 83\n" +
            "69 67 71 73 76 80\n" +
            "57 57 55 52 52\n" +
            "74 74 75 78 82 79\n" +
            "47 43 45 43 41 40 38 39\n" +
            "70 74 76 78 79 79 83\n" +
            "88 88 90 93 94 93\n" +
            "83 83 85 86 86\n" +
            "55 56 57 58 62 64 67 68\n" +
            "86 86 91 94 94\n" +
            "75 76 77 74 77 80 83 86\n" +
            "51 58 58 61 64 67 68 68\n" +
            "67 63 62 61 59 56 54 50\n" +
            "97 91 89 88 87 86 79\n" +
            "54 47 45 48 47 44 42 38\n" +
            "22 19 22 19 20 22 26\n" +
            "29 26 24 23 20 13 11 11\n" +
            "3 3 4 6 10 16\n" +
            "52 56 57 62 66\n" +
            "94 96 96 93 88\n" +
            "70 70 70 73 76 79 79\n" +
            "36 35 38 37 36 33 31\n" +
            "31 31 32 35 36 41\n" +
            "17 14 12 11 8 6 9 5\n" +
            "96 92 91 84 81 81\n" +
            "76 72 68 66 65 65\n" +
            "1 4 6 7 11 12 16\n" +
            "57 52 51 50 52 51 51\n" +
            "1 5 6 7 9 12 15 14\n" +
            "66 66 69 68 70\n" +
            "47 43 42 35 33\n" +
            "59 57 59 64 65 67 67\n" +
            "19 19 19 21 24 26 28\n" +
            "51 51 49 47 40\n" +
            "52 50 47 47 47\n" +
            "92 89 89 86 81\n" +
            "34 30 33 32 29 25\n" +
            "6 10 13 14 15 20\n" +
            "51 47 46 44 40 37 36 32\n" +
            "62 58 58 56 53 50 52\n" +
            "26 26 24 23 20 19 15\n" +
            "36 34 33 32 25 24 23 26\n" +
            "53 54 55 56 56\n" +
            "29 29 30 27 25 25\n" +
            "70 75 77 79 85\n" +
            "18 18 16 16 13 10\n" +
            "80 85 87 90 91 94\n" +
            "56 59 56 56 54 52 55\n" +
            "22 18 20 18 17 16\n" +
            "12 10 11 14 18 20 21 22\n" +
            "94 96 93 86 85 83\n" +
            "54 56 54 52 51 53 51 49\n" +
            "72 75 71 69 66 64 58\n" +
            "41 45 46 47 54 56 59\n" +
            "71 71 75 77 81\n" +
            "14 17 16 13 15 11\n" +
            "4 4 9 10 12 16\n" +
            "71 72 73 76 79 76\n" +
            "67 69 66 67 65 58\n" +
            "32 34 31 30 29 28 25 23\n" +
            "38 35 35 33 30\n" +
            "48 49 52 55 58 59 62 67\n" +
            "45 51 52 52 54\n" +
            "28 34 36 38 38 36\n" +
            "12 15 11 9 5\n" +
            "36 33 36 37 41 43 46 43\n" +
            "91 90 86 83 80 77\n" +
            "48 55 61 63 64 66 65\n" +
            "55 55 56 56 62\n" +
            "64 64 59 58 57 56 50\n" +
            "16 13 11 10 7 5 8\n" +
            "26 26 31 32 34 41\n" +
            "58 57 50 48 46 42\n" +
            "23 19 18 16 17\n" +
            "15 18 21 24 27 29 32\n" +
            "63 60 57 55 54 52 51\n" +
            "84 82 80 77 76 75\n" +
            "40 42 44 46 48 51 53\n" +
            "91 89 86 84 81\n" +
            "37 40 41 42 45 46 49 52\n" +
            "90 87 85 84 83 81 78 76\n" +
            "9 10 11 13 14 16\n" +
            "35 34 31 28 26 24 22 21\n" +
            "96 95 93 90 87 86\n" +
            "45 46 49 52 53 55 57\n" +
            "54 56 58 61 62\n" +
            "44 47 48 50 53\n" +
            "79 81 82 83 86 87\n" +
            "15 17 18 19 22 25 26 27\n" +
            "26 29 30 33 35\n" +
            "90 89 87 86 85 83 80\n" +
            "79 80 82 83 84\n" +
            "42 45 47 49 50\n" +
            "89 88 87 86 83 82 80\n" +
            "22 23 24 26 28\n" +
            "51 48 46 43 40 37 36\n" +
            "1 3 5 7 8 10 12\n" +
            "87 84 83 81 80 78 77 76\n" +
            "76 74 71 69 66 63 61\n" +
            "20 21 23 26 29 31 33 34\n" +
            "48 47 45 42 41 40 39\n" +
            "56 53 52 51 48 45 42 39\n" +
            "31 32 34 36 39 41\n" +
            "40 37 35 33 30 27 25 22\n" +
            "76 74 73 70 68 66\n" +
            "67 64 62 60 59\n" +
            "35 34 31 28 25 22\n" +
            "93 91 90 88 85 83 81\n" +
            "7 10 11 14 16 17 20\n" +
            "37 35 34 31 28\n" +
            "58 59 60 63 64 66 68\n" +
            "13 12 11 9 7 5 4 1\n" +
            "80 77 74 73 71 68 65 63\n" +
            "93 91 89 88 87 84 81 79\n" +
            "87 84 81 78 77 75\n" +
            "70 72 75 78 80 82 83 86\n" +
            "69 67 65 63 60 59 56 53\n" +
            "23 20 17 16 15\n" +
            "64 65 68 70 71 72\n" +
            "79 80 81 84 86\n" +
            "15 18 21 23 25 27\n" +
            "39 36 35 33 30 27 24 22\n" +
            "54 53 51 50 47\n" +
            "68 67 65 63 61 59\n" +
            "99 97 95 93 92 91 88\n" +
            "71 68 65 63 61 59\n" +
            "66 64 63 60 58 57\n" +
            "51 53 56 58 61 63\n" +
            "84 87 89 91 92 95\n" +
            "30 31 34 37 38 39\n" +
            "57 58 59 61 63 66\n" +
            "62 64 65 68 70 71 72 73\n" +
            "23 21 20 17 15 14 12 11\n" +
            "53 56 58 60 62 63 64\n" +
            "76 74 72 70 68 66 64 61\n" +
            "88 85 84 83 80 78\n" +
            "41 38 37 34 33 31 29\n" +
            "33 35 37 39 42 45\n" +
            "34 32 29 26 24\n" +
            "95 93 90 87 84 82 79 78\n" +
            "21 24 25 28 31\n" +
            "83 86 88 91 94 96 98\n" +
            "83 81 79 78 77 74 71 69\n" +
            "84 83 80 79 76 75 74\n" +
            "35 32 31 28 26 23 22 20\n" +
            "48 46 44 41 38 37\n" +
            "89 91 93 94 97 99\n" +
            "14 16 17 18 20\n" +
            "23 22 19 16 13 10\n" +
            "78 80 81 82 84 85 88\n" +
            "25 23 22 21 20\n" +
            "33 32 29 28 26 24 21 19\n" +
            "80 78 76 73 72 69\n" +
            "82 81 79 78 76 73\n" +
            "54 51 48 45 44\n" +
            "34 32 29 27 24 21 19 16\n" +
            "70 69 66 63 61 58 55 52\n" +
            "29 26 24 21 18 15 13 12\n" +
            "81 84 86 87 88 91 93 94\n" +
            "85 82 79 76 73 70 68 67\n" +
            "82 81 80 77 76 75 72\n" +
            "42 39 38 36 35\n" +
            "71 74 77 80 81 83\n" +
            "32 35 36 37 40\n" +
            "59 57 54 53 52\n" +
            "36 33 31 30 27 25 23\n" +
            "89 86 83 81 79 76 74 73\n" +
            "76 77 80 83 86 88\n" +
            "72 70 69 66 65\n" +
            "27 25 24 21 19 16\n" +
            "57 60 63 66 69 70 73 75\n" +
            "34 35 36 38 40 43 46\n" +
            "26 28 29 32 35 37 38 41\n" +
            "14 12 9 7 5\n" +
            "11 14 17 18 21 24\n" +
            "47 45 42 39 36 33\n" +
            "52 55 58 59 60 63\n" +
            "83 81 80 78 76 74 71 70\n" +
            "10 11 13 15 16 17 20 22\n" +
            "67 66 63 61 58 55\n" +
            "83 86 89 91 93\n" +
            "78 81 84 87 89\n" +
            "51 49 46 45 42 40 38\n" +
            "69 66 63 62 61 60 58\n" +
            "69 70 72 75 78 80 83\n" +
            "26 29 30 33 34 35\n" +
            "48 45 43 41 38\n" +
            "76 73 70 69 67 66\n" +
            "67 70 73 76 78 81\n" +
            "48 46 43 41 38 36\n" +
            "77 75 73 70 69\n" +
            "4 6 9 10 12 14 17 20\n" +
            "21 23 24 27 29 30 31\n" +
            "77 75 74 73 70 69 66\n" +
            "18 17 16 14 12\n" +
            "46 44 41 39 38\n" +
            "29 26 25 24 21 19\n" +
            "5 7 9 10 11 12 14 15\n" +
            "67 64 63 60 57 55 54\n" +
            "26 29 30 31 33 36 38\n" +
            "27 29 30 32 35\n" +
            "27 25 23 22 20 19 16 14\n" +
            "51 53 55 58 59 60\n" +
            "22 19 17 16 15 12 11\n" +
            "29 26 23 22 19 16 14 12\n" +
            "5 7 9 10 13\n" +
            "51 52 55 56 57 58 59\n" +
            "46 49 50 53 54 57 58\n" +
            "48 47 46 45 43 42 40 37\n" +
            "57 59 61 63 66 69\n" +
            "60 58 55 53 51 48 47\n" +
            "89 88 86 85 82 80 79\n" +
            "47 45 42 41 38 36 34\n" +
            "93 92 89 86 85 83\n" +
            "46 49 52 54 55 57 58 60\n" +
            "47 49 51 54 57 58 61 62\n" +
            "35 38 41 42 45 48 49\n" +
            "45 47 49 52 55 58\n" +
            "60 57 55 52 51 49 47 44\n" +
            "62 61 58 56 55 53 50 47\n" +
            "49 47 44 43 40 39 38 37\n" +
            "56 53 50 49 48 46 44 41\n" +
            "42 41 39 37 34 33\n" +
            "57 55 52 50 47 45\n" +
            "86 83 81 78 75 73 70\n" +
            "13 12 9 8 7 4\n" +
            "4 5 6 8 11 13 16\n" +
            "25 23 22 19 17 16 14\n" +
            "85 88 89 90 91 92 93 96\n" +
            "89 88 85 84 81 79 78\n" +
            "37 39 42 43 46 49 50\n" +
            "78 76 73 71 68 67 66\n" +
            "44 45 48 49 51 54 57\n" +
            "61 60 58 56 55 54 52 50\n" +
            "13 16 19 20 23 24\n" +
            "50 47 44 43 41\n" +
            "21 23 24 27 28 31 34\n" +
            "22 25 28 31 32\n" +
            "25 26 29 31 33 35\n" +
            "87 89 91 93 95 98\n" +
            "16 17 20 21 23 24\n" +
            "71 72 75 78 80 81\n" +
            "79 82 84 85 88\n" +
            "69 66 63 60 59 57 54 53\n" +
            "42 40 39 37 34 33 30\n" +
            "62 64 67 68 70 71 74\n" +
            "22 24 27 30 33 34 35\n" +
            "13 11 10 8 7 5\n" +
            "98 97 94 92 91 90\n" +
            "24 27 30 32 34 36 38 40\n" +
            "7 10 11 12 14 15 18\n" +
            "75 76 79 80 83 86 89 90\n" +
            "17 14 12 11 8 7\n" +
            "60 61 62 64 65 66 68\n" +
            "67 68 71 72 74\n" +
            "50 53 54 55 56 58\n" +
            "68 65 64 61 60 58 55 54\n" +
            "85 84 83 82 79\n" +
            "54 57 58 60 61\n" +
            "70 71 74 76 78 81 84 86\n" +
            "28 27 26 23 22 21\n" +
            "88 90 91 93 96 99\n" +
            "39 38 37 36 33 31 30\n" +
            "41 43 44 46 47\n" +
            "70 68 65 63 60 59 58 55\n" +
            "61 60 59 57 55 53 52 49\n" +
            "54 52 51 50 47 45 44\n" +
            "11 14 15 18 19 20 21\n" +
            "76 73 70 68 65 64 61\n" +
            "45 46 49 52 53 54\n" +
            "51 50 47 44 41\n" +
            "27 29 30 33 36 38 39\n" +
            "27 25 22 21 20\n" +
            "56 57 58 60 63 65 66 67\n" +
            "8 6 5 3 1\n" +
            "51 49 46 45 42 39 38 36\n" +
            "75 73 71 68 65\n" +
            "77 78 81 82 83\n" +
            "74 72 69 68 65 63 61\n" +
            "19 21 24 25 27\n" +
            "24 26 28 29 32 33 36 39\n" +
            "57 56 55 52 49\n" +
            "63 62 59 57 56 53\n" +
            "44 47 49 51 53 54 55\n" +
            "26 25 22 19 16\n" +
            "78 76 73 71 68 66\n" +
            "74 72 69 68 66 63 60\n" +
            "32 33 35 36 37 39 40 41\n" +
            "24 26 28 29 32 35\n" +
            "65 63 62 61 60 59 56 54\n" +
            "53 50 48 47 46 43\n" +
            "61 58 56 55 53 52 51 49\n" +
            "48 46 45 43 40 38\n" +
            "15 12 11 8 6 5 4\n" +
            "31 28 26 23 22\n" +
            "54 55 56 58 60 62 63 66\n" +
            "65 67 69 72 74 76\n" +
            "46 49 52 54 56\n" +
            "35 34 32 29 26\n" +
            "12 11 9 6 4\n" +
            "19 18 16 13 10 9\n" +
            "35 32 31 30 29\n" +
            "51 53 55 56 58 60 62\n" +
            "23 20 19 16 14 11\n" +
            "14 17 18 19 21 23\n" +
            "3 4 7 9 10 13\n" +
            "37 35 32 31 28 26 24 22\n" +
            "17 20 21 23 24 27\n" +
            "37 40 42 44 47 48 51 52\n" +
            "77 76 73 71 70 69 66\n" +
            "91 90 88 87 86 85 82 80\n" +
            "71 68 65 62 59 58 57\n" +
            "6 8 10 11 13 16 17\n" +
            "28 29 31 34 37 39 41 44\n" +
            "2 5 8 9 10 13 15\n" +
            "67 65 63 62 59 56 53 51\n" +
            "5 6 9 10 13 16 19 21\n" +
            "84 86 87 90 91 93 95 97\n" +
            "46 47 49 52 54\n" +
            "74 72 71 70 69\n" +
            "8 9 11 14 17 19 20 23\n" +
            "28 25 22 19 18 16 15\n" +
            "29 30 32 33 34 36 37 40\n" +
            "73 74 75 77 79 82\n" +
            "37 36 35 34 32 30 27\n" +
            "15 16 17 18 20\n" +
            "71 70 69 66 65 63 61\n" +
            "26 24 21 18 15\n" +
            "66 69 72 75 78\n" +
            "94 91 90 89 87 86\n" +
            "46 48 49 51 52 55 58\n" +
            "27 24 22 19 17 16 13\n" +
            "65 66 68 71 73 76 79\n" +
            "59 58 56 54 53 51\n" +
            "35 36 39 40 41 43 45\n" +
            "22 25 27 29 31 34 36 39\n" +
            "33 35 36 37 38\n" +
            "88 87 86 84 81 79\n" +
            "43 40 38 35 32 30 27\n" +
            "34 36 39 40 43 45 47\n" +
            "27 26 24 23 21 18 15 14\n" +
            "56 55 54 52 49 48 45 43\n" +
            "26 27 30 33 36 39\n" +
            "87 90 92 93 94 97 98 99\n" +
            "67 66 63 62 60 58 55\n" +
            "86 84 81 80 77 75 73\n" +
            "64 61 58 57 55\n" +
            "64 65 67 70 72 73\n" +
            "86 89 92 94 96 99\n" +
            "50 47 46 44 42 39 37 36\n" +
            "77 80 82 85 87 89\n" +
            "69 66 65 63 60\n" +
            "33 36 37 39 41 43 45 46\n" +
            "73 74 75 78 81 82\n" +
            "52 49 48 45 42 41 38 35\n" +
            "23 20 19 18 17\n" +
            "34 36 37 38 41 44\n" +
            "52 54 56 57 60 62 64 67\n" +
            "15 18 19 20 23 25\n" +
            "13 12 11 8 6 3\n" +
            "15 16 18 21 24 26 27\n" +
            "64 66 69 72 73 76 79 80\n" +
            "40 41 43 45 46 48 50 52\n" +
            "24 26 29 31 33 34 36\n" +
            "52 50 48 46 44 41 40 37\n" +
            "24 21 18 15 12 11\n" +
            "77 80 81 82 84 85 87 88\n" +
            "59 56 55 54 53\n" +
            "51 50 47 45 42 40\n" +
            "66 69 70 73 75 77 79 80\n" +
            "43 46 49 50 51\n" +
            "62 64 67 69 71 73 75\n" +
            "66 68 71 74 76 78 79 80\n" +
            "14 12 9 7 4\n" +
            "26 29 31 33 36 39\n" +
            "70 71 74 76 77\n" +
            "82 83 86 89 91 93 95\n" +
            "55 52 51 49 48\n" +
            "18 17 16 13 11\n" +
            "26 28 29 32 35 36 39\n" +
            "34 37 38 41 43 44 47 48\n" +
            "61 64 65 68 69 71 73\n" +
            "84 86 88 90 93\n" +
            "52 55 56 59 61 64 65 68\n" +
            "16 18 21 23 26 28 30 32\n" +
            "9 12 13 16 18\n" +
            "20 21 23 26 28 29 30 33\n" +
            "89 88 85 84 83 80 78 76\n" +
            "71 70 67 65 62\n" +
            "36 34 32 29 27 25\n" +
            "86 84 82 81 78 77\n" +
            "36 39 40 43 45 47 48\n" +
            "80 77 76 73 72 71\n" +
            "24 21 20 19 17 14 12 9\n" +
            "39 37 35 34 33 30 27\n" +
            "44 47 50 51 53 56 58 61\n" +
            "66 64 62 59 58 56 53 50\n" +
            "62 60 58 56 55 52\n" +
            "67 69 72 75 77\n" +
            "62 64 66 67 68 69 70 73\n" +
            "41 43 45 48 51\n" +
            "40 42 43 45 47\n" +
            "33 35 37 38 40 41\n" +
            "17 18 20 23 24 25 28 30\n" +
            "16 17 19 21 23\n" +
            "57 59 61 64 66 68 69 72\n" +
            "99 96 94 93 90\n" +
            "76 77 80 81 82 83 85\n" +
            "21 19 17 15 12 11\n" +
            "65 68 71 73 76 79\n" +
            "7 10 11 14 17 20 21\n" +
            "80 79 76 73 70\n" +
            "76 79 81 83 84 87 89\n" +
            "82 81 79 76 75\n" +
            "50 47 45 44 43 42 40\n" +
            "97 95 93 91 89 86 83\n" +
            "88 89 91 93 95 96\n" +
            "13 11 9 7 6 3 2\n" +
            "74 76 79 82 85 87 90 93\n" +
            "93 90 88 87 85\n" +
            "51 49 46 44 43 40 39\n" +
            "6 7 10 13 16 17 20\n" +
            "77 75 73 70 69 66 64 63\n" +
            "30 33 34 35 38\n" +
            "49 51 52 54 56\n" +
            "22 24 25 28 30\n" +
            "18 19 22 24 27 30 33 35\n" +
            "83 84 87 89 92\n" +
            "32 35 36 37 40 43\n" +
            "18 17 16 14 13 10 9\n" +
            "53 51 49 46 45 42\n" +
            "64 65 68 70 72\n" +
            "72 69 68 65 64\n" +
            "55 53 50 49 46 43 42 39\n" +
            "53 52 50 48 45 42 39\n" +
            "71 73 75 78 81\n" +
            "83 85 86 89 91 94\n" +
            "84 85 87 89 92 93\n" +
            "27 24 23 22 19 18\n" +
            "19 22 24 26 27\n" +
            "58 57 56 55 52 49 47\n" +
            "80 79 76 75 74\n" +
            "89 86 83 80 77 74\n" +
            "18 20 21 22 25\n" +
            "30 29 27 26 24\n" +
            "79 80 81 82 83 86 88\n" +
            "83 81 78 77 76 73 71\n" +
            "7 8 11 13 16\n" +
            "28 27 26 25 22\n" +
            "27 30 31 32 34 37\n" +
            "87 86 83 81 80 79 78 75\n" +
            "19 21 23 26 27 30 32\n" +
            "38 40 43 45 48 51 52 55\n" +
            "1 2 3 5 6 8 10\n" +
            "24 21 19 16 14\n" +
            "61 59 56 54 52 51 49 48\n" +
            "39 37 34 32 30 27 24\n" +
            "41 43 44 45 47\n" +
            "86 85 84 81 80 79 76 74\n" +
            "38 41 44 45 46 49 51\n" +
            "50 53 54 57 58 59 62 65\n" +
            "88 89 90 91 94 95 98 99\n" +
            "73 76 78 81 83 85\n" +
            "34 35 36 39 41 42\n" +
            "26 29 30 33 34\n" +
            "49 46 44 41 40\n" +
            "66 69 70 73 75 76 77 78\n" +
            "31 34 37 38 39 41\n" +
            "58 60 63 65 66 68\n" +
            "75 73 72 71 70 69 66 63\n" +
            "68 71 73 76 79 81\n" +
            "50 52 55 56 57 58 61 64\n" +
            "98 95 94 93 90\n" +
            "40 37 34 32 30\n" +
            "73 76 77 80 81 84 85\n" +
            "65 64 63 61 59 58\n" +
            "52 53 55 57 58 60 61 63\n" +
            "66 69 72 73 74 77\n" +
            "77 76 73 71 68 67 66 63\n" +
            "20 17 15 14 12 10 8\n" +
            "69 67 65 63 62 61 59 56\n" +
            "89 86 84 82 80\n" +
            "46 47 48 51 53 54 56\n" +
            "72 69 68 65 64 61 59 56\n" +
            "33 35 37 40 43 46 48\n" +
            "62 60 58 56 55 54 53 50\n" +
            "99 97 96 93 92 90 88\n" +
            "39 42 45 47 48 51\n" +
            "74 75 76 79 81 82 83 86\n" +
            "64 66 67 69 72\n" +
            "38 35 34 33 30\n" +
            "19 16 14 11 9 7 6 5\n" +
            "66 65 62 60 57 55\n" +
            "34 32 31 30 27\n" +
            "76 75 74 73 71\n" +
            "29 30 33 34 36 38\n" +
            "33 36 39 41 44\n" +
            "25 26 28 29 31 33 36\n" +
            "13 11 8 7 6 4\n" +
            "94 92 89 86 84 82\n" +
            "54 51 50 49 46 44 43 41\n" +
            "2 3 5 8 11 12 15\n" +
            "30 31 34 36 38\n" +
            "20 23 26 29 30 32 35 36\n" +
            "61 64 65 68 71\n" +
            "51 54 57 60 63\n" +
            "21 22 23 26 27 30 33 35\n" +
            "17 20 22 25 28 29\n" +
            "44 42 39 36 34 31 30 29\n" +
            "27 24 21 20 19 17\n" +
            "32 30 29 28 26 24 21 19\n" +
            "44 45 48 50 53 54 56\n" +
            "89 86 83 81 80 78 75 72\n" +
            "70 67 64 63 62 60\n" +
            "52 53 54 57 59\n" +
            "27 29 32 33 36 39 40 42\n" +
            "32 34 35 36 39 42 45 48\n" +
            "61 64 66 68 71 72 74\n" +
            "33 30 28 27 24 23 20\n" +
            "31 29 27 24 21 19\n" +
            "21 20 19 17 15 12\n" +
            "42 44 47 50 53 55 56\n" +
            "77 79 80 83 86 87 88 91\n" +
            "37 36 33 31 30 28 27 24\n" +
            "13 16 19 22 25 26 29\n" +
            "35 34 33 32 29 27 25\n" +
            "50 52 53 56 57 59\n" +
            "77 74 72 70 69 68 65\n" +
            "88 91 92 93 96\n" +
            "76 78 81 82 83\n" +
            "64 66 68 69 70 73 74 75\n" +
            "68 67 66 65 62 60 58\n" +
            "57 56 55 52 50 48 46\n" +
            "61 59 58 56 53\n" +
            "15 12 9 6 5 3\n" +
            "70 68 66 64 61 60 57 54\n" +
            "75 78 81 83 84 85 87\n" +
            "24 26 27 29 30 31 34 36\n" +
            "53 56 59 60 63 66\n" +
            "1 3 5 7 8 9\n" +
            "89 87 84 82 79 78 76 75\n" +
            "30 27 25 22 21\n" +
            "37 36 34 31 30 29\n" +
            "19 18 15 12 11 8 7 6\n" +
            "60 58 55 54 52 50 48\n" +
            "7 8 9 12 15 17\n" +
            "89 90 93 94 96\n" +
            "27 24 23 22 21 19 17 16\n" +
            "22 20 19 18 15 14 12\n" +
            "85 86 88 90 92 95 96\n" +
            "38 39 40 42 45\n" +
            "24 25 28 31 33 34\n" +
            "70 69 68 67 65 63 62\n" +
            "15 13 12 9 7 4 2\n" +
            "49 48 45 42 41\n" +
            "57 60 62 63 66 68\n" +
            "31 34 37 38 40\n" +
            "27 28 29 30 33 36\n" +
            "36 34 31 30 29 28 27\n" +
            "53 51 49 46 43\n" +
            "95 92 90 88 85 83\n" +
            "74 73 72 70 67 64\n" +
            "23 20 17 16 14 13\n" +
            "95 92 89 87 85 82 81 79\n" +
            "36 35 34 32 31 30 29\n" +
            "50 52 54 57 60 63 64\n" +
            "58 61 62 63 64 65 68 70\n" +
            "39 40 42 43 45 48 51\n" +
            "85 84 81 79 77 74\n" +
            "45 46 47 49 52\n" +
            "15 16 17 20 21 22\n" +
            "86 83 80 78 76 73 70 68\n" +
            "51 54 57 59 62\n" +
            "71 73 76 77 79 80\n" +
            "68 69 72 74 77 78 79 81\n" +
            "13 11 8 6 5 3\n" +
            "50 52 53 56 57 59 60\n" +
            "60 62 64 66 69\n" +
            "80 83 84 86 88\n" +
            "8 10 11 14 16\n" +
            "43 46 47 50 53 56\n" +
            "55 54 51 50 48 45 43\n" +
            "66 68 71 74 75\n" +
            "84 86 87 88 90 93\n" +
            "38 37 36 33 30 27 26\n" +
            "29 31 34 37 39\n" +
            "12 10 9 6 4\n" +
            "72 69 67 65 63 62\n" +
            "23 25 26 29 30 32\n" +
            "70 71 74 77 80 81 84 87\n";


}