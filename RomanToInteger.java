package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "MCMXCIV";
        System.out.println(romantoInt(s));
    }

    public static int romantoInt(String s)
    {
        int countInt = 0;
        int i = 0;
        boolean check = false;
        HashMap<Character,Integer> dictionaryofRoman = new HashMap<Character,Integer>();
        dictionaryofRoman.put('I',1);
        dictionaryofRoman.put('V',5);
        dictionaryofRoman.put('X',10);
        dictionaryofRoman.put('L',50);
        dictionaryofRoman.put('C',100);
        dictionaryofRoman.put('D',500);
        dictionaryofRoman.put('M',1000);
        while(i<s.length())
        {
            if(s.charAt(i)=='I'  && i<s.length()-1)
            {
                if(s.charAt(i+1)=='X')
                {
                    countInt+=9;
                    i=i+1;
                    check = true;
                }

                else if(s.charAt(i+1)=='V')
                {
                    countInt += 4;
                    i=i+1;
                    check = true;
                }
            }
            else if(s.charAt(i)=='X' && i<s.length()-1)
            {
                if(s.charAt(i+1)=='L')
                {
                    countInt+=40;
                    i=i+1;
                    check = true;
                }

                else if(s.charAt(i+1)=='C')
                {
                    countInt+=90;
                    i=i+1;
                    check = true;
                }
            }
            else if(s.charAt(i)=='C' && i<s.length()-1)
            {
                if(s.charAt(i+1)=='D')
                {
                    countInt+=400;
                    i=i+1;
                    check = true;
                }

                else if(s.charAt(i+1)=='M')
                {
                    countInt+=900;
                    i=i+1;
                    check = true;
                }
            }
            if(check==false)
            {
                countInt+=dictionaryofRoman.get(s.charAt(i));
            }
            i=i+1;
            check=false;
        }
        return countInt;
    }
}
