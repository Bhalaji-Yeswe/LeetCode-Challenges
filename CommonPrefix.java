package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String strs[] = {"flower","flow","flight"};
        int length = 0;
        String temp = strs[0];
        String result="";
        for(int i=1;i<strs.length;i++)
        {
            if(temp.length()<=strs[i].length())
                length = temp.length();
            else
                length = strs[i].length();
            for(int j=0;j<length;j++)
            {
                if(temp.charAt(j)==strs[i].charAt(j))
                {
                    result += temp.charAt(j);
                }
                else {
                    break;
                }
            }
            temp = result;
            result="";
        }
        System.out.print(temp);
    }
}
