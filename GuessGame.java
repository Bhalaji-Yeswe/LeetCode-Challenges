package com.company;

class GuessGame{
    public static int guess(int num)
    {
        int pick = 7;
        if(num>pick)
            return 1;
        else if(num<pick)
            return -1;
        else
            return 0;
    }
}
public class Main extends GuessGame{

    public static void main(String[] args) {
        int num = 10;
	    System.out.print(guessNumber(num));
    }

    public static int guessNumber(int num)
    {
        int left = 0;
        int right = num;
        while (left<=right)
        {
            int mid = (left+right)/2;

            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==-1)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
}
