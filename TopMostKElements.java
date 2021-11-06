package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[] {1,1,1,2,2,3};
        for(int element : topKFrequent(nums,2))
        {
            System.out.print(element);
        }
    }

    public static int[] topKFrequent(int[] nums,int k)
    {
        HashMap<Integer,Integer> elementHolder = new HashMap<Integer,Integer>();

        for(int element : nums)
        {
            elementHolder.put(element,elementHolder.getOrDefault(element,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> freqSort = new PriorityQueue<Map.Entry<Integer,Integer>>
                ((a,b)->b.getValue()-a.getValue());
        freqSort.addAll(elementHolder.entrySet());
        int[] result = new int[k];
        int iterator = 0;
        while (k!=0)
        {
            Map.Entry<Integer,Integer> temp = freqSort.poll();
            result[iterator]=temp.getKey();
            k--;
            iterator++;
        }
        return result;
    }
}
