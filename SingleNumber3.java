package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[]{1,2,1,3,2,5};

        for(int element : singleNumber(nums))
        {
            System.out.print(element);
        }
    }

    public static int[] singleNumber(int[] nums)
    {
        int ab = 0;
        for (int n : nums) {
            ab ^= n;
        }

        int rightBit = ab & -ab;
        int a = 0;
        for (int n : nums) {
            if ((n & rightBit) != 0) {
                a ^= n;
            }
        }

        return new int[] {a, ab ^ a};
    }
}
