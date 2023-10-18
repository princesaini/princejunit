package com.testing;

public class Addition {
    int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Addition add = new Addition();

        System.out.println(add.add(1, 1));
    }
}