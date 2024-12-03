package com.example.advent2024;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D3 {

    static Integer calculateMulls(String inputData) {
        int total = 0;
        String regex = "mul\\(\\d+,\\d+\\)";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher for the input text
        Matcher matcher = pattern.matcher(inputData);

        // Find all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
            total = total + calculate(matcher.group());

        }
        return total;
    }

    private static int calculate(String text) {
        String regex = "mul\\((\\d+),(\\d+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            // Extract groups
            int firstNumber = Integer.parseInt(matcher.group(1)); // Group 1: First number
            int secondNumber = Integer.parseInt(matcher.group(2)); // Group 2: Second number

            System.out.println("First number: " + firstNumber);
            System.out.println("Second number: " + secondNumber);
            System.out.println("Sum: " + firstNumber + "*" +secondNumber +"="+(firstNumber*secondNumber));
            return (firstNumber*secondNumber);
        } else {
            System.out.println("No match found!");
        }
        return 0;
    }


}
