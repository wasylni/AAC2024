package com.example.advent2024;

import org.yaml.snakeyaml.util.Tuple;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class D5 {

    public Integer getAllInOrderSumMiddle(String printOrder, String printState) {
        List<Tuple<Integer, Integer>> order = findOrder(printOrder);
        List<List<Integer>> orderedPagesToCheck = getListOfOrdered(printState);
        List<List<Integer>> valid = new ArrayList<>();
        AtomicInteger result = new AtomicInteger();

        orderedPagesToCheck.forEach(pagePrintList -> {
            if (verifyPagePrintList(pagePrintList, order) != null) {
                valid.add(pagePrintList);
            }
        });

        valid.forEach(pageOrder -> {
            int middleIndex = pageOrder.size() / 2;
            result.set(result.get() + pageOrder.get(middleIndex));
        });

        return result.get();
    }

    public Integer getAllInOrderSumMiddleWithReorder(String printOrder, String printState) {
        List<Tuple<Integer, Integer>> order = findOrder(printOrder);
        List<List<Integer>> orderedPagesToCheck = getListOfOrdered(printState);
        List<List<Integer>> invalidList = new ArrayList<>();
        List<List<Integer>> valid = new ArrayList<>();
        AtomicInteger result = new AtomicInteger();

        orderedPagesToCheck.forEach(pagePrintList -> {
            if (verifyPagePrintList(pagePrintList, order) == null) {
                invalidList.add(pagePrintList);
            }
        });

        invalidList.forEach(pagePrintList -> {
            if (verifyPagePrintListAndReorder(pagePrintList, order) != null) {
                valid.add(pagePrintList);
            }
        });


        invalidList.forEach(pageOrder -> {
            int middleIndex = pageOrder.size() / 2;
            result.set(result.get() + pageOrder.get(middleIndex));
        });

        return result.get();
    }

    private List<Integer> verifyPagePrintListAndReorder(List<Integer> pagePrintList, List<Tuple<Integer, Integer>> order) {
        List<Tuple<Integer, Integer>> failedRulesList = new ArrayList<>();
        order.forEach(orderRule -> {
                    if (!checkRuleMet(orderRule, pagePrintList))
                        failedRulesList.add(orderRule);
                }
        );

        if (failedRulesList.size() > 0) {
            return applyFailedRules(failedRulesList, pagePrintList);
        }
        return null;
    }

    private List<Integer> applyFailedRules(List<Tuple<Integer, Integer>> failedRulesList, List<Integer> pagePrintList) {
        AtomicReference<List<Integer>> fixedList = new AtomicReference<>(new ArrayList<>());
        failedRulesList.forEach(rule -> {
            fixedList.set(reSuffle(rule, fixedList.get()));
        });

        return fixedList.get();
    }

    private List<Integer> reSuffle(Tuple<Integer, Integer> rule, List<Integer> fixedList) {
        System.out.println("before: "+fixedList);
        Comparator<Integer> customComparator = (a, b) -> {
            if (a == rule._1()) return -1; // 97 always comes first
            if (b == rule._1()) return 1;  // If comparing against 97, other numbers come after it
            if (a == rule._2()) return 1;  // 75 always comes last
            if (b == rule._2()) return -1; // If comparing against 75, other numbers come before it
            return 0;               // Preserve relative order for other numbers
        };
        // Sort the list using the custom comparator
        fixedList.sort(customComparator);
        System.out.println("after: "+fixedList); // Output: [97, 47, 61, 53, 75]
        return fixedList;
    }

    private List<Integer> verifyPagePrintList(List<Integer> pagePrintList, List<Tuple<Integer, Integer>> order) {
        AtomicInteger failedRules = new AtomicInteger(0);
        order.forEach(orderRule -> {
                    if (!checkRuleMet(orderRule, pagePrintList))
                        failedRules.getAndIncrement();
                }
        );

        if (failedRules.get() == 0) {
            return pagePrintList;
        } else {
            return null;
        }
    }


    private boolean checkRuleMet(Tuple<Integer, Integer> orderRule, List<Integer> pagePrintList) {
        int left = orderRule._1();
        int right = orderRule._2();

        int leftIndex = -1;
        int rightIndex = -1;


        if (left < right) {
            if (pagePrintList.contains(left) && pagePrintList.contains(right)) {
                leftIndex = pagePrintList.indexOf(left);
                rightIndex = pagePrintList.indexOf(right);
                if (!(leftIndex < rightIndex)) {
                    System.out.println("print pattern failed on rule  " + left + "|" + right);
                    pagePrintList.forEach(i -> System.out.print(i + " "));
                    System.out.println();

                    return false;
                }
            }
        }
        if (left > right) {
            if (pagePrintList.contains(left) && pagePrintList.contains(right)) {
                leftIndex = pagePrintList.indexOf(left);
                rightIndex = pagePrintList.indexOf(right);
                if (!(leftIndex < rightIndex)) {
                    System.out.println("print pattern failed on rule  " + left + "|" + right);
                    pagePrintList.forEach(i -> System.out.print(i + " "));
                    System.out.println();
                    return false;
                }
            }
        }
        return true;
    }


    private List<List<Integer>> getListOfOrdered(String printState) {
        List<List<Integer>> lines = new ArrayList<>();
        // Parse input into a list of pairs
        String[] pairs = printState.split("\n");
        for (String pair : pairs) {
            String[] pages = pair.split(",");
            lines.add(Arrays.stream(pages).map(Integer::parseInt).toList());
        }
        return lines;
    }

    private static List<Tuple<Integer, Integer>> findOrder(String printOrder) {
        List<Tuple<Integer, Integer>> pairsOfTp = new ArrayList<>();
        // Parse input into a list of pairs
        String[] pairs = printOrder.split("\n");

        for (String pair : pairs) {
            String[] parts = pair.split("\\|");
            int left = Integer.parseInt(parts[0].trim());
            int right = Integer.parseInt(parts[1].trim());
            Tuple<Integer, Integer> tp = new Tuple(left, right);
            pairsOfTp.add(tp);
        }
        return pairsOfTp;
    }


}