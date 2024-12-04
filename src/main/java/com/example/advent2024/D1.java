package com.example.advent2024;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class D1 {
    Integer calculate(String input) {
        // Lists to store the separated numbers
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Split the input into lines
        String[] lines = input.split("\\n");

        for (String line : lines) {
            // Split each line into two numbers
            String[] parts = line.trim().split("\\s+");
            list1.add(Integer.parseInt(parts[0])); // First number
            list2.add(Integer.parseInt(parts[1])); // Second number
        }

        // Print the two lists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        Collections.sort(list1);
        Collections.sort(list2);

        // Print the two lists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Iterate and calculate differences
        System.out.println("Differences (list2 - list1):");
        int result = 0;
        for (int i = 0; i < list1.size(); i++) {
            int difference = Math.abs(list2.get(i) - list1.get(i));
            result = result + difference;
            System.out.println("Index " + i + ": " + list2.get(i) + " - " + list1.get(i) + " = " + difference);
        }

        System.out.println("**** Result for D1 is " + result);
        return result;
    }

    Integer calculateSimilarity(String input) {
        final int[] totalSimilarityScore = {0};
        // Lists to store the separated numbers
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        // Split the input into lines
        String[] lines = input.split("\\n");

        for (String line : lines) {
            // Split each line into two numbers
            String[] parts = line.trim().split("\\s+");
            list1.add(Integer.parseInt(parts[0])); // First number
            list2.add(Integer.parseInt(parts[1])); // Second number
        }
        list1.forEach(numberL1 -> {
            int similarityNo = getReocurrenceCount(numberL1, list2);
            totalSimilarityScore[0] = (int) (totalSimilarityScore[0] + (numberL1 * similarityNo));
        });

        return totalSimilarityScore[0];
    }

    private static int getReocurrenceCount(Integer numberL1, List<Integer> list2) {
        AtomicInteger found = new AtomicInteger();
        list2.forEach(numberL2 ->
                {
                    if (comparenumbers(numberL1, numberL2)) {
                        found.set(found.get() + 1);
                    }
                }

        );
        return found.get();
    }

    private static boolean comparenumbers(int numberL1, int number2) {
        if (number2 == numberL1) {
            System.out.println(numberL1);
            return true;
        }

        return false;
    }

}
