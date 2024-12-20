package com.example.advent2024;

import java.util.*;
import java.util.stream.Collectors;

public class D20 {

    public Integer t1(String arginputs, int saving) {
        Tuple<Integer, Integer> proposedMove;
        String[][] map = convertTo2dArray(arginputs);
        Set<List<Tuple<Integer, Integer>>> breakRules = findAllPaths(map, true);
        Set<List<Tuple<Integer, Integer>>> respectRules = findAllPaths(map, false);
        int shortestPathadhereToRules = findListWithFewestElements(respectRules).size()-1;
        List<List<Tuple<Integer, Integer>>> filtered = breakRules.stream().filter(route -> route.size() < shortestPathadhereToRules).toList();
        List<Integer> listOfReduced = new ArrayList<>();

                filtered.stream().forEach(list-> {

                    listOfReduced.add((shortestPathadhereToRules - list.size())+1);

                });



        return listOfReduced.stream().filter(i-> i>=saving).collect(Collectors.toUnmodifiableList()).size();
    }


    public static <T> List<T> findListWithFewestElements(Set<List<T>> setOfLists) {
        return setOfLists.stream()
                .min(Comparator.comparingInt(List::size))
                .orElse(null);
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
    public static Set<List<Tuple<Integer, Integer>>> findAllPaths(String[][] grid, boolean requireBreak) {
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
        // visited[row][col][usedBreak? 0 or 1]
        boolean[][][] visited = new boolean[rows][cols][2];

        List<Tuple<Integer, Integer>> currentPath = new ArrayList<>();
        currentPath.add(new Tuple<>(startRow, startCol));
        visited[startRow][startCol][0] = true; // start with break not used

        dfs(grid, startRow, startCol, endRow, endCol, visited, currentPath, resultPaths, false, requireBreak);

        return resultPaths;
    }

    private static void dfs(String[][] grid,
                            int row, int col,
                            int endRow, int endCol,
                            boolean[][][] visited,
                            List<Tuple<Integer, Integer>> currentPath,
                            Set<List<Tuple<Integer, Integer>>> resultPaths,
                            boolean usedBreak,
                            boolean requireBreak) {

        // If we reached E, check if we match the requireBreak criteria
        if (row == endRow && col == endCol) {
            // If requireBreak is false, we want paths that never used the break (usedBreak == false)
            // If requireBreak is true, we want paths that used the break (usedBreak == true)
            if (usedBreak == requireBreak) {
                resultPaths.add(new ArrayList<>(currentPath));
            }
            return;
        }

        // Directions: up, down, left, right
        int[][] directions = {
                {-1, 0}, // up
                {1, 0},  // down
                {0, -1}, // left
                {0, 1}   // right
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValidMove(grid, newRow, newCol, visited, usedBreak)) {
                boolean newUsedBreak = usedBreak;
                if (isHash(grid, newRow, newCol) && !usedBreak) {
                    // We are using our single breach here
                    newUsedBreak = true;
                }

                visited[newRow][newCol][newUsedBreak ? 1 : 0] = true;
                currentPath.add(new Tuple<>(newRow, newCol));

                dfs(grid, newRow, newCol, endRow, endCol, visited, currentPath, resultPaths, newUsedBreak, requireBreak);

                // Backtrack
                currentPath.remove(currentPath.size() - 1);
                visited[newRow][newCol][newUsedBreak ? 1 : 0] = false;
            }
        }
    }

    private static boolean isValidMove(String[][] grid, int r, int c, boolean[][][] visited, boolean usedBreak) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return false;
        }

        String cell = grid[r][c];
        int stateIndex = usedBreak ? 1 : 0;
        if (visited[r][c][stateIndex]) {
            return false; // already visited in this state
        }

        // Allowed moves:
        // - "." or "E" always allowed if not visited
        // - "#" allowed only if we haven't used the break yet (usedBreak == false)
        // - "S" should not be stepped on again after starting
        if (".".equals(cell) || "E".equals(cell)) {
            return true;
        } else if ("#".equals(cell) && !usedBreak) {
            return true;
        } else if ("S".equals(cell)) {
            return false;
        }

        return false;
    }

    private static boolean isHash(String[][] grid, int r, int c) {
        return "#".equals(grid[r][c]);
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