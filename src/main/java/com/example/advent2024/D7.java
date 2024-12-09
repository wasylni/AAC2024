package com.example.advent2024;


import com.example.advent2024.collection.Tuple;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class D7 {

    public Long t1(String arginputs) {
        AtomicLong addUp = new AtomicLong();
        Tuple<Long, Long> proposedMove;
        List<Map.Entry<Long, List<Long>>> numbersRawData = convertData(arginputs);

        numbersRawData.forEach(entry -> {
            Long sum = entry.getKey();
            List<String> equations = generateEquationsWithJoin(entry.getValue(), "||");

            // Evaluate and print each equation and its result
            for (String equation : equations) {
                long result = evaluateEquation(equation);
                if (result == sum) {
//                    System.out.println(equation + " = " + result + "matches sum: " + sum);
                    addUp.set(addUp.get() + result);
                    return;

                }
            }

        });

        return addUp.get();
    }


    public Long t2(String arginputs) {
        AtomicLong addUp = new AtomicLong();
        List<Map.Entry<Long, List<Long>>> numbersRawData = convertData(arginputs);
        List<Map.Entry<Long, List<Long>>> onesNotFound = new ArrayList<>();
        Set<Long> foundSums = new HashSet<>();

        numbersRawData.forEach(entry -> {
            Long sum = entry.getKey();
            List<String> equations = generateEquationsWithJoin(entry.getValue(), "||");

            // Evaluate and print each equation and its result
            for (String equation : equations) {
                long result = evaluateEquation(equation);
                if (result == sum) {
//                    System.out.println(equation + " = " + result + "matches sum: " + sum);
                    addUp.set(addUp.get() + result);
                    foundSums.add(sum);
                    return;
                }
            }
        });

//======
        numbersRawData.forEach(number -> {
            if (!foundSums.contains(number.getKey())) {
                onesNotFound.add(number);
            }
        });

        onesNotFound.forEach(entry -> {
            Long sum = entry.getKey();
            List<String> equations = generateEquationsWithJoin(entry.getValue(), null).stream().filter(equasion -> equasion.contains("||")).collect(Collectors.toUnmodifiableList());

            // Evaluate and print each equation and its result
            for (String equation : equations) {
                long result = evaluateEquationWithJoin(equation);
                if (result == sum) {
                    System.out.println(equation + " = " + result + "matches sum: " + sum);
                    addUp.set(addUp.get() + result);
                    foundSums.add(sum);
                    return;
                }
            }
        });


        return addUp.get();
    }


    public static List<String> findExpressions(List<Long> numbers, long targetSum) {
        List<String> results = new ArrayList<>();
        backtrack(numbers, 0, numbers.get(0), "" + numbers.get(0), targetSum, results);
        return results;
    }

    private static void backtrack(List<Long> numbers, int index, long currentValue, String expression, long targetSum, List<String> results) {
        if (index == numbers.size() - 1) {
            if (currentValue == targetSum) {
                results.add(expression);
            }
            return;
        }

        long nextNumber = numbers.get(index + 1);

        // Option 1: Use "+" operator
        backtrack(numbers, index + 1, currentValue + nextNumber, expression + " + " + nextNumber, targetSum, results);

        // Option 2: Use "*" operator
        backtrack(numbers, index + 1, currentValue * nextNumber, expression + " * " + nextNumber, targetSum, results);

        // Option 3: Use "||" operator to concatenate
        String concatenated = "" + currentValue + nextNumber;
        long concatenatedValue = Long.parseLong(concatenated);
        backtrack(numbers, index + 1, concatenatedValue, expression + " || " + nextNumber, targetSum, results);
    }


    // Generate all equations using the numbers and +, *, || operators
    private static List<String> generateEquationsWithJoin(List<Long> numbers, String excludeOperator) {
        List<String> equations = new ArrayList<>();
        int n = numbers.size();

        // There are 3^(n-1) combinations of operators for n numbers
        int combinations = (int) Math.pow(3, n - 1);

        // Iterate over all combinations
        for (int i = 0; i < combinations; i++) {
            StringBuilder equation = new StringBuilder();
            int temp = i;

            // Build the equation based on the current combination of operators
            for (int j = 0; j < n; j++) {
                equation.append(numbers.get(j)); // Append the number
                if (j < n - 1) {
                    // Decide the operator based on the ternary representation of `i`
                    int operator = temp % 3;
                    temp /= 3;

                    switch (operator) {
                        case 0:
                            equation.append("+");
                            break;
                        case 1:
                            equation.append("*");
                            break;
                        case 2:
                            equation.append("||");
                            break;
                    }
                }
            }

            // Add the equation to the list
            equations.add(equation.toString());
        }

        return excludeOperator == null ? equations : equations.stream().filter(op -> !op.contains(excludeOperator)).toList();
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


    // Evaluate a mathematical equation in string form
    private static long evaluateEquationWithJoin(String equation) {
         String[] equations = equation.split("\\|\\|");
        for (int i = 0; i < equations.length; i=i+1) {
            if(i>0 && (equations[i].contains("+") || equations[i].contains("*"))){
                equations[i] = equations[i-1].concat(equations[i]);
                equations[i-1]="";
            }
            long result = evaluateEquation(equations[i]);

            equations[i] = String.valueOf(result);
        }

        StringBuilder joinedResult= new StringBuilder();
        for (int i = 0; i < equations.length; i=i+1) {
            joinedResult.append(equations[i]);
        }
        return Long.parseLong(joinedResult.toString());
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
//            System.out.print("sum: " + sum + " = ");
            for (String part : numbers) {
                numbersList.add(Long.parseLong(part));
//                System.out.print(Long.parseLong(part) + " ");
            }
//            System.out.println();
            entries.add(new AbstractMap.SimpleEntry<>(sum, numbersList));
        }

        return entries;
    }


}