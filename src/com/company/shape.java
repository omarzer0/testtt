package com.company;

public class shape {
    public static void main(String[] args) {
        for (int x = 1, y = 1; x < 7; x++, y = Integer.parseInt("" + y + x))
            System.out.println(y);
    }
}
        //TODO: Only Two Lines Of spaghetti code But it is about being different