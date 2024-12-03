package com.example.advent2024;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class D2 {

    static Integer howManySafe(String inputData) {
        AtomicInteger distanceBreach = new AtomicInteger();
        /* Split the input string into rows */
        String[] rows = inputData.split("\n");

        Arrays.stream(rows).toList().forEach(line -> {
            processLine(line, distanceBreach);
        });

        return distanceBreach.get();
    }

    private static void processLine(String line, AtomicInteger distanceBreach) {
        // Split the string by spaces and convert to an array of integers
        System.out.println(line + "*** :");
        String[] parts = line.split("\\s+");
        Integer trend = null;
        Boolean safe = true;
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
                safe = false;
                continue;
            } else if (trend < 0 && n1 - n2 > 0) {
                printTag("UNSAFE change direction");
                safe = false;
                continue;
            }

            int distance = Math.abs(n1 - n2) ;
            System.out.println("Distance between " + n1 + " and " + n2 + " is: " + distance);
            if (distance >= 4 || distance == 0) {
                printTag("UNSAFE equals");
                safe = false;
            }
        }
        if(safe){
            printTag("SAFE");
            distanceBreach.getAndIncrement();
        }

    }

    private static void printTag(String printTag) {
        System.out.println(printTag);
    }


}
