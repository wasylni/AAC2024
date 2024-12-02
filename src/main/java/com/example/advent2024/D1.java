package com.example.advent2024;


import java.util.ArrayList;
import java.util.List;

public class D1 {
    Integer calculate(String input){
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

        return null;
    }

}
