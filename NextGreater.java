package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};
        int[] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++)
        {
            result[i] = nextGreater(searchIndex(nums2,nums1[i]),nums2);
        }

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]);
        }
    }
    public static int nextGreater(int start,int[] nums2)
    {
        for(int i = start+1;i<nums2.length;i++)
        {
            if(nums2[i]>nums2[start])
                return nums2[i];
        }
        return -1;
    }
    public static int searchIndex(int[] nums2,int target)
    {
        int front = 0;
        int back = nums2.length-1;
        int answer = -1;
        while (front<=back)
        {
            if(nums2[front]==target || nums2[back]==target)
            {
                answer = (nums2[front]==target) ? front : back;
                break;
            }
            front++;
            back--;
        }
        return answer;
    }
}

//nums1   --> 4 1 2
//nums2   --> 1 3 4 2
//result  --> -1 3 -1
//  1. The result array should be in size of nums1 array.
//  2. Search for the element from num1 to find the index value. - Two pointer approach
//  3. Then find the next greater element and push to result array