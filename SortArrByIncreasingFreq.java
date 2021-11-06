package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[] {-1,1,-6,4,5,-6,1,4,1};
        int[] result = new int[nums.length];
        result = frequencySort(nums);
        for(int element : result)
        {
            System.out.println(element);
        }
    }

    public static int[] frequencySort(int[] nums)
    {
        int[] result = new int[nums.length];
        Arrays.sort(nums);
        Map<Integer,Integer> elementHolder = new HashMap<Integer,Integer>();
        int index=0;
        for(int element : nums)
        {
            elementHolder.put(element,elementHolder.getOrDefault(element,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> freqSort = new PriorityQueue<Map.Entry<Integer,Integer>>
                ((a,b) -> (a.getValue())- b.getValue());
        freqSort.addAll(elementHolder.entrySet());

        while (!freqSort.isEmpty())
        {
            Map.Entry<Integer,Integer> temp = freqSort.poll();
            int frequency = temp.getValue();
            while (frequency-- >0)
            {
                result[index]=temp.getKey();
                index++;
            }
        }
        return result;
    }
}
