package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[]{1,0,-1,0,-2,2};
        System.out.print(fourSum(nums,0));
    }

    public static List<List<Integer>> fourSum(int[] nums,int target)
    {
        Arrays.sort(nums);
        return kSum(nums,target,0,4);
    }

    public static List<List<Integer>> kSum(int[] nums,int target,int start,int k)
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int avg_val = target/k;

        if(nums.length==start)
            return res;

        if(nums[start]>avg_val || nums[nums.length-1]<avg_val)
            return res;

        if(k==2)
            return twoSum(nums,target,start);

        for(int i=start;i<nums.length;i++)
        {
            if(i==start || nums[i-1]!=nums[i])
            {
                for(List<Integer> subset : kSum(nums,target-nums[i],i+1,k-1))
                {
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    res.get(res.size()-1).addAll(subset);
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> twoSum (int [] nums,int target,int index)
    {
        int low = index;
        int high = nums.length-1;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp;
        while (low<high)
        {
            int currentSum = nums[low] + nums[high];
            if(currentSum<target || (low<index&&nums[low]==nums[low-1]))
                ++low;
            else if(currentSum>target || (high<nums.length-1&&nums[high]==nums[high+1]))
                --high;
            else
                res.add(Arrays.asList(nums[low++],nums[high--]));
        }
        return res;
    }
}
