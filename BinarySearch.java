package com.company;

public class Main {

    public static void main(String[] args) {
	int[] num = {-1,0,3,5,9,12};
    int target = 12;
    int left = 0;
    int right = num.length-1;
    System.out.print(binarySearch(num,left,right,target));
    }
    public static int binarySearch(int[] num,int left,int right,int target)
    {
        if(left<=right)
        {
            int mid = (left+right)/2;
            if(num[mid]==target)
                return mid;
            if(num[mid]>target)
                return binarySearch(num,left,mid-1,target);

            return binarySearch(num,mid+1,right,target);
        }
        return -1;
    }
}
