package com.example.advent2024;


import com.example.advent2024.collection.Tuple;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class D7 {

    public Long t1(String arginputs) {
        AtomicLong addUp = new AtomicLong();
        Tuple<Long, Long> proposedMove;
        List<Map.Entry<Long, List<Long>>> numbersRawData = convertData(arginputs);

        numbersRawData.forEach(entry ->{
            Long sum = entry.getKey();
            List<String> equations = generateEquations(entry.getValue());

            // Evaluate and print each equation and its result
            for (String equation : equations) {
                long result = evaluateEquation(equation);
                if(result == sum){
                    System.out.println(equation + " = " + result + "matches sum: "+sum);
                    addUp.set(addUp.get() + result);
                    return;

                }
            }

        });

        return addUp.get();
    }



    // Generate all equations using the numbers and +, * operators
    private static List<String> generateEquations(List<Long> numbers) {
        List<String> equations = new ArrayList<>();
        int n = numbers.size();

        // There are 2^(n-1) combinations of operators for n numbers
        int combinations = 1 << (n - 1); // 2^(n-1)

        // Iterate over all combinations
        for (int i = 0; i < combinations; i++) {
            StringBuilder equation = new StringBuilder();

            // Build the equation based on the current combination of operators
            for (int j = 0; j < n; j++) {
                equation.append(numbers.get(j)); // Append the number
                if (j < n - 1) {
                    // Decide the operator based on the bit in `i`
                    if ((i & (1 << j)) != 0) {
                        equation.append("*");
                    } else {
                        equation.append("+");
                    }
                }
            }

            // Add the equation to the list
            equations.add(equation.toString());
        }

        return equations;
    }

    // Evaluate a mathematical equation in string form
    private static long evaluateEquation(String equation) {
        String[] tokens = equation.split("(?<=[+*])|(?=[+*])"); // Split numbers and operators
        long result = Long.parseLong(tokens[0]); // Initialize with the first number

        // Evaluate the equation
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            long nextNumber = Long.parseLong(tokens[i + 1]);
            if (operator.equals("+")) {
                result += nextNumber;
            } else if (operator.equals("*")) {
                result *= nextNumber;
            }
        }

        return result;
    }

    private List<Map.Entry<Long, List<Long>>> convertData(String input) {
        List<Map.Entry<Long, List<Long>>> entries = new ArrayList<>();
        // Split the input string by new lines to get rows
        String[] rows = input.split("\n");

        // Split each row by commas to get columns
        for (int i = 0; i < rows.length; i++) {
            String[] line = rows[i].split(":");
            Long sum = Long.valueOf(line[0]);
            String[] numbers = line[1].trim().split(" ");

            List<Long> numbersList = new ArrayList<>();
            System.out.print("sum: "+ sum + " = ");
            for (String part : numbers) {
                numbersList.add(Long.parseLong(part));
                System.out.print(Long.parseLong(part)+" ");
            }
            System.out.println();
            entries.add(new AbstractMap.SimpleEntry<>(sum, numbersList));
        }

        return entries;
    }




}