package com.example.advent2024;

import org.yaml.snakeyaml.util.Tuple;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
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

        if (!failedRulesList.isEmpty()) {
            return applyFailedRules(failedRulesList, pagePrintList);
        }
        return null;
    }

    private List<Integer> applyFailedRules(List<Tuple<Integer, Integer>> failedRulesList, List<Integer> pagePrintList) {
        AtomicReference<List<Integer>> fixedList = new AtomicReference<>(new ArrayList<>(pagePrintList));
        int count = 0;

        failedRulesList.forEach(rule -> {
            List<Integer> list = new ArrayList<>(fixedList.get());
            fixedList.set(new ArrayList<>(reShuffle2(rule, list)));
        });

        while (count < 5 && !failedRulesPass(failedRulesList, fixedList.get())) {
            System.out.println("***");
            System.out.println("***");
            System.out.println("***");
            System.out.println("***");
            failedRulesList.forEach(rule -> {
                List<Integer> list = new ArrayList<>(fixedList.get());
                fixedList.set(new ArrayList<>(reShuffle2(rule, list)));
            });
            count++;
        }

        return fixedList.get();
    }

    private boolean failedRulesPass(List<Tuple<Integer, Integer>> failedRulesList, List<Integer> pagePrintList) {
        AtomicBoolean fixedList = new AtomicBoolean(true);

        failedRulesList.forEach(rule -> {
            if(!checkRuleMet(rule, pagePrintList)){
                fixedList.set(false);
            }
        });
        return fixedList.get();
    }


    private List<Integer> reShuffle2(Tuple<Integer, Integer> rule, List<Integer> fixedList) {
        System.out.println("before: "+fixedList + " for rule:"+ rule._1() +"|"+ rule._2());
        List<Integer> specialNumbers = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();


        for (int num : fixedList) {
            if (num == rule._1() || num == rule._2()) {
                specialNumbers.add(num);
            } else {
                otherNumbers.add(num);
            }
        }

        specialNumbers.sort((a, b) -> {
            if (a == rule._1()) return -1;
            if (b == rule._1()) return 1;
            if (a == rule._2()) return 1;
            if (b == rule._2()) return -1;
            return 0;
        });

        // Merge back: insert specialNumbers into their original positions
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> specialIterator = specialNumbers.iterator();
        for (int num : fixedList) {
            if (num == rule._1() || num == rule._2()) {
                result.add(specialIterator.next());
            } else {
                result.add(num);
            }
        }

        System.out.println("after: "+result);
        return result;
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