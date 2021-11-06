package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[] {1,0,2};

        if (checkSort(nums,nums.length)){
            System.out.print(nums);
        }
        else
        {
            for(int element:quickSort(nums,0,nums.length-1))
            {
                System.out.print(element);
            }
        }
    }

    public static boolean checkSort(int[] nums,int index)
    {
        if(index==1 || index==0)
            return true;

        if(nums[index-1]<nums[index-2])
            return false;

        return checkSort(nums,index-1);
    }

    public static int[] quickSort(int[] nums,int low,int high)
    {
        if(low<high)
        {
            int pivot = partitionArr(nums,low,high);
            quickSort(nums,low,pivot-1);
            quickSort(nums,pivot+1,high);
        }
        return nums;
    }

    public static int partitionArr(int[] nums,int low,int high)
    {
        int i=low-1;
        int pivot = nums[high];

        for(int j=low;j<=high-1;j++)
        {
            if(nums[j]<pivot)
            {
                i++;

                if(i!=j)
                    swap(nums,i,j);
            }
        }
        swap(nums,i+1,high);
        return (i+1);
    }

    public static void swap(int[]nums,int i,int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
