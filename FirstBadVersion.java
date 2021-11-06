package com.company;
class VersionControl{
    public static boolean isBadVersion(int num)
    {
        int bad =4;
        if(num<bad)
            return false;
        else
            return true;
    }
}
public class Main extends VersionControl{

    public static void main(String[] args) {
        int num=10;
	    System.out.print(firstBadVersion(num));
    }

    public static int firstBadVersion(int num)
    {
        int left = 0;
        int right = num;
        while (left<right)
        {
            int mid = left+(right-left)/2;

            if(isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}
