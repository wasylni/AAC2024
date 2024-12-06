package com.example.advent2024;

public class D6 {

    public Integer t1(String arginputs) {
        String[][] array = convertTo2dArray(arginputs);
    return null;
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



}