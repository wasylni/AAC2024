package com.example.advent2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class D4 {

    public Integer convertInputToStrings(String arginputs) {
        String[][] array = convertTo2dArray(arginputs);

        List<String> result = getAllStrings(array);
        int occurences = countOccurences("XMAS", result);
        occurences = occurences + countOccurences("SAMX", result);
        System.out.println(occurences);
        return occurences;
    }

    public Integer traverseXmassTask2(String arginputs) {
        Set<String> testPattern = Set.of("MMASS", "SSAMM", "MSAMS", "SMASM");

        String[][] array = convertTo2dArray(arginputs);
        List<String> result = traversArrayInSearchOfXmass(array, testPattern);
        return result.size();
    }

    private List<String> traversArrayInSearchOfXmass(String[][] array, Set<String> pattern) {
        List<String> allFound = new ArrayList<>();

        for (int i = 0; i < array.length; i++) { // Outer loop for rows
            for (int j = 0; j < array[i].length; j++) { // Inner loop for columns
                StringBuilder sb = new StringBuilder();
                try {
                    // Access each element
                    //first element of x
                    String first = array[i][j];
                    //second element of x
                    String second = array[i][j + 2];
                    //third element of x
                    String third = array[i + 1][j + 1];
                    //fourt element of x
                    String fourth = array[i + 2][j];
                    //fifth element of x
                    String fifth = array[i + 2][j + 2];
                    sb.append(first).append(second).append(third).append(fourth).append(fifth);
                    String result = sb.toString();

                    if (pattern.contains(result)) {
                        allFound.add(result);
                    }

                } catch (Exception e) {
                }
            }
        }
        System.out.println(allFound);
        return allFound;
    }


    private int countOccurences(String search, List<String> result) {
        AtomicInteger resultCount = new AtomicInteger();
        result.forEach(input ->
                {
                    List<Integer> res = findWord(input, search);
                    resultCount.set(resultCount.get() + res.size());
                }
        );
        return resultCount.get();
    }

    public List<Integer> findWord(String textString, String word) {
        List<Integer> indexes = new ArrayList<>();
        String lowerCaseTextString = textString.toLowerCase();
        String lowerCaseWord = word.toLowerCase();

        int index = 0;
        while (index != -1) {
            index = lowerCaseTextString.indexOf(lowerCaseWord, index);
            if (index != -1) {
                System.out.println("found in:" + textString);
                indexes.add(index);
                index++;
            }
        }
        return indexes;
    }

    private String[][] convertTo2dArray(String input) {

        // Split the input string by new lines to get rows
        String[] rows = input.split("\n");

        // Initialize the 2D array
        String[][] array2D = new String[rows.length][];

        // Split each row by commas to get columns
        for (int i = 0; i < rows.length; i++) {
            array2D[i] = rows[i].split("");
        }

        // Print the 2D array
        for (String[] row : array2D) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println("*");
        }
        return array2D;
    }


    public static List<String> getAllStrings(String[][] array) {
        List<String> horizontal = new ArrayList<>();
        List<String> vertical = new ArrayList<>();
        List<String> diag1 = new ArrayList<>();
        List<String> diag2 = new ArrayList<>();


        int rows = array.length;
        int cols = array[0].length;

        // Horizontal Strings
        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                sb.append(array[i][j]);
            }
            horizontal.add(sb.toString());
        }

        // Vertical Strings
        for (int j = 0; j < cols; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                sb.append(array[i][j]);
            }
            vertical.add(sb.toString());
        }

        // Top-left to Bottom-right Diagonals
        for (int k = 0; k < rows + cols - 1; k++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                int j = k - i;
                if (j >= 0 && j < cols) {
                    sb.append(array[i][j]);
                }
            }
            if (sb.length() > 0) {
                diag1.add(sb.toString());
            }
        }

        // Top-right to Bottom-left Diagonals
        for (int k = 0; k < rows + cols - 1; k++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                int j = cols - 1 - k + i;
                if (j >= 0 && j < cols) {
                    sb.append(array[i][j]);
                }
            }
            if (sb.length() > 0) {
                diag2.add(sb.toString());
            }
        }

        horizontal.addAll(vertical);
        horizontal.addAll(diag1);
        horizontal.addAll(diag2);
        return horizontal;
    }


}