package com.bhaisahab;

public class Fibonacci {

    public int position(int position) {
        return generate(position);
    }

    private int generate(int position) {
        if (position == 0 || position == 1) {
            return position;
        }

       return generate(position - 1) + generate(position - 2);
    }
}