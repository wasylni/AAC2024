package com.example.advent2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class D2 {

    static Integer howManySafe(String inputData) {
        AtomicInteger distanceBreach = new AtomicInteger();
        /* Split the input string into rows */
        String[] rows = inputData.split("\n");

        Arrays.stream(rows).toList().forEach(line -> {
            if (processLine(line))
                distanceBreach.getAndIncrement();
        });

        return distanceBreach.get();
    }


    public static Integer howManySafeIgnoreOne(String inputData) {
        AtomicInteger distanceBreach = new AtomicInteger();
        /* Split the input string into rows */
        String[] rows = inputData.split("\n");

        Arrays.stream(rows).toList().forEach(line -> {
            if (processLineIgnoreOne(line))
                distanceBreach.getAndIncrement();
        });

        return distanceBreach.get();
    }

    private static boolean processLine(String line) {
        // Split the string by spaces and convert to an array of integers
        System.out.println(line + "*** :");
        String[] parts = line.split("\\s+");
        Integer trend = null;
        for (int i = 0; i < parts.length; i++) {
            if (i + 1 >= parts.length) {
                break;
            }

            int n1 = Integer.parseInt(parts[i]);
            int n2 = i + 1 < parts.length ? Integer.parseInt(parts[i + 1]) : Integer.parseInt(parts[i]);


            if (trend == null) {
                trend = n1 - n2;
            } else if (trend > 0 && n1 - n2 < 0) {
                printTag("UNSAFE change direction");
                return false;
            } else if (trend < 0 && n1 - n2 > 0) {
                printTag("UNSAFE change direction");
                return false;
            }

            int distance = Math.abs(n1 - n2);
            System.out.println("Distance between " + n1 + " and " + n2 + " is: " + distance);
            if (distance >= 4 || distance == 0) {
                printTag("UNSAFE equals");
                return false;
            }
        }

        printTag("SAFE");
        return true;

    }


    private static boolean processLineIgnoreOne(String line) {
        // Split the string by spaces and convert to an array of integers
        System.out.println(line + "*** :");
        String[] parts = line.split("\\s+");

        if (processLine(line)) {
            return true;
        }

        for (int i = 0; i < parts.length; i++) {
            String lineReducedRecord = getLineReducedRecord(parts, i);
            if (processLine(lineReducedRecord)) {
                return true;
            }
        }
        return false;
    }

    private static String getLineReducedRecord(String[] parts, int i) {
        List<String> listCopy = Arrays.stream(parts).toList();
        List<String> listCopyReduced = new ArrayList<>(listCopy);
        listCopyReduced.remove(i);

        return String.valueOf(listCopyReduced).replaceAll(",", "")
                .replaceAll("\\[", "")
                .replaceAll("\\]", "");
    }

    private static void printTag(String printTag) {
        System.out.println(printTag);
    }
}
