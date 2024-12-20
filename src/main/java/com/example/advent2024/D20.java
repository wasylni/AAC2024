package com.example.advent2024;

import java.util.*;

public class D20 {

    public Integer t1(String arginputs) {
        Tuple<Integer, Integer> proposedMove;
        String[][] map = convertTo2dArray(arginputs);
        Set<List<Tuple<Integer, Integer>>> result = findAllPaths(map);
        return result.size();
    }


    public static class Tuple<T, U> {
        public final T first;
        public final U second;

        public Tuple(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tuple)) return false;
            Tuple<?, ?> tuple = (Tuple<?, ?>) o;
            return Objects.equals(first, tuple.first) &&
                    Objects.equals(second, tuple.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    public static Set<List<Tuple<Integer, Integer>>> findAllPaths(String[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Find S and E positions
        int startRow = -1, startCol = -1;
        int endRow = -1, endCol = -1;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if ("S".equals(grid[r][c])) {
                    startRow = r;
                    startCol = c;
                } else if ("E".equals(grid[r][c])) {
                    endRow = r;
                    endCol = c;
                }
            }
        }

        // If we didn't find S or E, return empty set
        if (startRow == -1 || startCol == -1 || endRow == -1 || endCol == -1) {
            return Collections.emptySet();
        }

        Set<List<Tuple<Integer, Integer>>> resultPaths = new HashSet<>();
        boolean[][] visited = new boolean[rows][cols];

        List<Tuple<Integer, Integer>> currentPath = new ArrayList<>();
        currentPath.add(new Tuple<>(startRow, startCol));
        visited[startRow][startCol] = true;

        dfs(grid, startRow, startCol, endRow, endCol, visited, currentPath, resultPaths);

        return resultPaths;
    }

    private static void dfs(String[][] grid,
                            int row, int col,
                            int endRow, int endCol,
                            boolean[][] visited,
                            List<Tuple<Integer, Integer>> currentPath,
                            Set<List<Tuple<Integer, Integer>>> resultPaths) {

        // If we reached E, add a copy of the current path to the results
        if (row == endRow && col == endCol) {
            resultPaths.add(new ArrayList<>(currentPath));
            return;
        }

        // Possible movements: up, down, left, right
        int[][] directions = {
                {-1, 0}, // up
                {1, 0},  // down
                {0, -1}, // left
                {0, 1}   // right
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValidMove(grid, newRow, newCol, visited)) {
                visited[newRow][newCol] = true;
                currentPath.add(new Tuple<>(newRow, newCol));

                dfs(grid, newRow, newCol, endRow, endCol, visited, currentPath, resultPaths);

                // Backtrack
                currentPath.remove(currentPath.size() - 1);
                visited[newRow][newCol] = false;
            }
        }
    }

    private static boolean isValidMove(String[][] grid, int r, int c, boolean[][] visited) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return false;
        }
        if (visited[r][c]) {
            return false;
        }
        String cell = grid[r][c];
        // We can step onto "." or "E". Cannot step onto "#" or "S" again.
        return (".".equals(cell) || "E".equals(cell));
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
            System.out.println();
        }
        return array2D;
    }


}