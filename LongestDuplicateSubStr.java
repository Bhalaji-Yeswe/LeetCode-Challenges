package com.company;

public class Main {

    public static void main(String[] args) {
	    String s = "ahczbhcdehcz";
        System.out.print(longestdupString(s));
    }

    public static String longestdupString(String s)
    {
        int pointer = s.length()-1;
        int max = -1;
        String temp="";
        String res = "";
        boolean[] visited = new boolean[s.length()];
        for(int index=0;index<s.length();index++)
        {
            while (index<pointer) {
                if (findIndex(s, index+1, s.length() - 1, s.charAt(index),visited[pointer]) != -1) {
                    int last = findIndex(s,index+1,s.length()-1,s.charAt(index),visited[pointer]);
                    visited[last]=true;
                    temp = findDuplicate(s,index,last);
                }
                if(max<=temp.length())
                {
                    max=temp.length();
                    res=temp;
                }
                pointer--;
            }
            pointer=s.length()-1;
        }
        return res;
    }

    public static String findDuplicate(String s,int start,int end)
    {
        String leftTemp="";
        String rightTemp="";
        int rightStart = start;
        int rightEnd = end;
        while (rightStart!=rightEnd &&rightEnd<=s.length()-1)
        {
            if(s.charAt(rightStart)==s.charAt(rightEnd))
            {
                rightTemp+=s.charAt(rightStart);
                rightStart++;
                rightEnd++;
            }
            else {
                break;
            }
        }
        return rightTemp;
    }
    public static int findIndex(String s,int start,int end,char target,boolean lastVisisted)
    {
        while (start<=end && lastVisisted!=true)
        {
            if(s.charAt(start)==target)
                return start;
            start++;
        }
        return -1;
    }
}
