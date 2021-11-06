package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 8;
        int i = 1;

        while(n>=i)
        {
            n=n-i;
            i=i+1;
        }
        System.out.print(i-1);
    }
}
