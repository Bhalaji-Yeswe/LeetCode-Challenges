package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[] {10,10,10,10,1};
        System.out.print(nums[findmin(nums)]);
    }

    public static int findmin(int[] nums)
    {
        int left = 0;
        int right = nums.length-1;

        while (left<right)
        {
            int mid = left+(right-left)/2;

            if(nums[mid]>nums[right])
                left=mid+1;
            else if(nums[mid]<nums[right])
                right=mid;
            else
                right--;
        }
        return right;
    }
}

// nums ---->  5   0   1   3   3   5
// index --->  0   1   2   3   4   5

//