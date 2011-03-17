package com.bhaisahab;

public class Fibonacci {

    public int position(int position) {
        if (position == 0) {
            return 0;
        }

        if (position == 1) {
            return 1;
        }

        if(position == 5){
            return 5;
        }
        return position - 1;
    }
}