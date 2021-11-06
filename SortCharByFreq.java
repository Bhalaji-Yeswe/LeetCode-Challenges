package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	    String s = "tree";
        System.out.print(frequencySort(s));
    }

    public static String frequencySort(String s)
    {
        String result = "";
        HashMap<Character, Integer> elementHolder = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++)
        {
            elementHolder.put(s.charAt(i),elementHolder.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> freqSort = new PriorityQueue<Map.Entry<Character,Integer>>
                ((a,b)-> (b.getValue()-a.getValue()));

        freqSort.addAll(elementHolder.entrySet());
        while (!freqSort.isEmpty())
        {
            Map.Entry<Character,Integer> temp = freqSort.poll();
            int frquency = temp.getValue();

            while (frquency-- > 0)
            {
                result+=temp.getKey();
            }
        }
        return result;
    }
}

//tree --> eert or eetr
//Mapped all the characters as key with values as it occurrence.
//Then use PriorityQueue which makes the character to hold the value that occurs most times as priority
//Traverse PriorityQueue for result.