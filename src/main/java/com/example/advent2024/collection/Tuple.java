package com.example.advent2024.collection;


import java.util.Objects;

public class Tuple<I extends Object, I1 extends Object> {
    private final Integer first;
    private final Integer second;

    public Tuple(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<Number, Number> tuple = (Tuple<Number, Number>) o;
        return first == tuple.first && second == tuple.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second); // Returns an integer
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public I1 _1() {
        return (I1) first;
    }


    public I1 _2() {
        return (I1) second;
    }
}
