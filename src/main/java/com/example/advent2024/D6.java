package com.example.advent2024;



import java.util.*;

import com.example.advent2024.collection.Tuple;

public class D6 {

    Set<Tuple<Integer, Integer>> visitedNodes = new HashSet<>();
    Map<Tuple<Integer, Integer>, Integer> visitedWithCountTest = new HashMap<>();
    Set<Tuple<Integer, Integer>> obstaclesPositionSuccesfull = new HashSet<>();

    public Integer t1(String arginputs) {
        int i = 0;
        Tuple<Integer, Integer> proposedMove;
        String[][] map = convertTo2dArray(arginputs);
        proposedMove = findGuard(map);
        while(proposedMove!=null && i<100000){
            i++;
            proposedMove = move(map, proposedMove);
            printResultCalculatemoves(map);
        }
        System.out.println(i+" *****");
        return printResultCalculatemoves(map);
    }

    public Integer t2(String input) {
        t1(input);
        String[][] map = convertTo2dArray(input);
        String[][] mapOriginal = convertTo2dArray(input);
        Tuple<Integer, Integer> guardPosition = findGuard(map);

        HashSet<Tuple<Integer, Integer>> visitedPoints = new HashSet<>();
        visitedPointsMinusGuardInitialPosition(guardPosition, visitedPoints);

        visitedPoints.forEach(obstaclePosition-> {
            resetMap(map, mapOriginal);
            String previouslyInThatPoint = map[obstaclePosition._1()][obstaclePosition._2()];
            map[obstaclePosition._1()][obstaclePosition._2()]="O";
            searchForLoops(obstaclePosition, guardPosition, map);
            map[obstaclePosition._1()][obstaclePosition._2()]=previouslyInThatPoint;
//            System.out.println(i+" *****");
        });
        return obstaclesPositionSuccesfull.size();
    }

    private void resetMap(String[][] mapModified, String[][] mapBlueprint) {
        for (int row = 0; row < mapBlueprint.length; row++) {
            System.arraycopy(mapBlueprint[row], 0, mapModified[row], 0, mapBlueprint[row].length);
        }
    }

    private void visitedPointsMinusGuardInitialPosition(Tuple<Integer, Integer> guardPosition, HashSet<Tuple<Integer, Integer>> visitedPoints) {
        visitedNodes.forEach(n->{
            if(!n.equals(guardPosition)){
                visitedPoints.add(n);
            }

        });
    }

    private void searchForLoops(Tuple<Integer, Integer> obstaclePositionCheck, Tuple<Integer, Integer> proposedMove, String[][] map) {
        int i = 0;
        while(proposedMove !=null && i <1000){
            i++;
            if(visitedWithCountTest.get(proposedMove)==null){
                visitedWithCountTest.put(proposedMove, 1);
            }else{
                int val = visitedWithCountTest.get(proposedMove)+1;
                visitedWithCountTest.put(proposedMove, val);
                if (val>1000){
                    obstaclesPositionSuccesfull.add(obstaclePositionCheck);
                    visitedWithCountTest.clear();
                    return;
                }
            }
            proposedMove = move(map, proposedMove);
        }
        System.out.println("asserting position obstacle "+ i + " : " + obstaclePositionCheck);
    }

    Tuple<Integer, Integer> findGuard(String[][] map) {
        // Traverse the map using enhanced for loop
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                if (!Objects.equals(map[row][col], ".") && !Objects.equals(map[row][col], "#")) {
                    System.out.println("Element at [" + row + "][" + col + "] = " + map[row][col]);
                    return new Tuple<>(row, col);
                }
                System.out.println(); // New line after each row
            }
        }
        return null;
    }

   int printResultCalculatemoves(String[][] map) {
        int moves = 0;
        // Traverse the map using enhanced for loop
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                if (!Objects.equals(map[row][col], ".") && !Objects.equals(map[row][col], "#") ) {
                    moves++;
                    visitedNodes.add(new Tuple(row, col) {
                    });
                }
//                System.out.print(map[row][col]+" ");
            }

//            System.out.println();
        }
//       System.out.println(" ==============================                            ");
//       System.out.println(" ==============================                            ");
        return moves;
    }


    Tuple<Integer, Integer> move(String[][] map, Tuple<Integer, Integer> startPosition) {
        int columns = map.length;
        int rows = map[0].length;
        if(startPosition._1()<0 || startPosition._2()<0){
            return null;
        }else if(startPosition._1()>=columns || startPosition._2()>=rows){
            return null;
        }
        String directionIndicator = map[startPosition._1()][startPosition._2()];
        printResultCalculatemoves(map);
        return moveGuard(directionIndicator, startPosition, map);
    }

    private Tuple<Integer, Integer> moveGuard(String directionIndicator, Tuple<Integer, Integer> guardPosition, String[][] map) {
        Tuple<Integer, Integer> proposedMoveToPosition = null;
        try{
        Integer columns = guardPosition._1();
        Integer rows = guardPosition._2();
        if (Objects.equals(directionIndicator, "^")) {
            proposedMoveToPosition = new Tuple<>(columns - 1, rows);
            if (checkObstaclePresent(map, proposedMoveToPosition)) {
                proposedMoveToPosition = avoidObstacle(map, directionIndicator, proposedMoveToPosition, guardPosition);
            } else {
                proposedMoveToPosition = moveToNewPosition(map, directionIndicator, guardPosition, proposedMoveToPosition);
            }

        }
        if (Objects.equals(directionIndicator, ">")) {
            proposedMoveToPosition = new Tuple<>(columns, rows + 1);
            if (checkObstaclePresent(map, proposedMoveToPosition)) {
                proposedMoveToPosition = avoidObstacle(map, directionIndicator, proposedMoveToPosition, guardPosition);
            } else {
                proposedMoveToPosition = moveToNewPosition(map, directionIndicator,guardPosition, proposedMoveToPosition);
            }

        }
        if (Objects.equals(directionIndicator, "v")) {
            proposedMoveToPosition = new Tuple<>(columns + 1, rows);
            if (checkObstaclePresent(map, proposedMoveToPosition)) {
                proposedMoveToPosition = avoidObstacle(map, directionIndicator, proposedMoveToPosition, guardPosition);
            } else {
                proposedMoveToPosition = moveToNewPosition(map, directionIndicator, guardPosition,proposedMoveToPosition);
            }

        }
        if (Objects.equals(directionIndicator, "<")) {
            proposedMoveToPosition = new Tuple<>(columns, rows - 1);
            if (checkObstaclePresent(map, proposedMoveToPosition)) {
                proposedMoveToPosition = avoidObstacle(map, directionIndicator, proposedMoveToPosition, guardPosition);
            } else {
                proposedMoveToPosition = moveToNewPosition(map, directionIndicator, guardPosition,proposedMoveToPosition);
            }
        }}catch(Exception e){
            //skip
        }
        return proposedMoveToPosition;
    }

    private Tuple<Integer, Integer> moveToNewPosition(String[][] map, String directionIndicator, Tuple<Integer, Integer> guardPosition, Tuple<Integer, Integer> proposedMoveToPosition) {
        map[guardPosition._1()][guardPosition._2()]="X";
        map[proposedMoveToPosition._1()][proposedMoveToPosition._2()]=directionIndicator;
        return proposedMoveToPosition;
    }


    private Tuple<Integer, Integer> avoidObstacle(String[][] map,
                                                  String directionIndicator,
                                                  Tuple<Integer, Integer> proposedGuardMove,
                                                  Tuple<Integer, Integer> guardPosition) {
        if(checkObstaclePresent(map, proposedGuardMove)){
            if (Objects.equals(directionIndicator, "^")) {
                map[guardPosition._1()][guardPosition._2()] = ">";
            }
            if (Objects.equals(directionIndicator, ">")) {
                map[guardPosition._1()][guardPosition._2()]  = "v";
            }
            if (Objects.equals(directionIndicator, "v")) {
                map[guardPosition._1()][guardPosition._2()]  = "<";
            }
            if (Objects.equals(directionIndicator, "<")) {
                map[guardPosition._1()][guardPosition._2()]  = "^";
            }


        }

return guardPosition;
    }

    private boolean checkObstaclePresent(String[][] map, Tuple<Integer, Integer> newPosition) {
        return Objects.equals(map[newPosition._1()][newPosition._2()], "#")||Objects.equals(map[newPosition._1()][newPosition._2()], "O");
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