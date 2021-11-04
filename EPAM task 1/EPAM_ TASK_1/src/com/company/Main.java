package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 6;
    if (n > 0)
        System.out.println(Math.pow(n,2));
    else if (n < 0)
        System.out.println(Math.abs(n));
    else
        System.out.println(0);
    }
}
