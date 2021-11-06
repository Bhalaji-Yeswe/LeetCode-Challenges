package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "121";
        String temp = "";

        for(int index=s.length()-1;index>=0;index--)
        {
            temp += s.indexOf();
        }
        if(temp==s)
            System.out.print("palindrome");
        else
            System.out.print("Not a Palindrome");
    }



    // 4 2 5 7 --->  4 5 2 7 or 2 5 4 7 or 4 7 2 5 or 2 7 4 5
    //i = 0    j = 1
    //
}
