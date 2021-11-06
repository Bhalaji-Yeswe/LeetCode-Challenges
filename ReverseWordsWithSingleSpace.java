package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    String s = "  hello world  ";
        System.out.print(reverseStringWithSingleSpace(s));
    }

    public static String reverseStringWithSingleSpace(String s)
    {
        Stack tempString = new Stack();
        String result = "";
        int pointer = s.length()-1;
        boolean checkForFirstTime = false;
        //Base case
        if(s.length()==0 || s.isBlank())
        {
            return result;
        }

        while (pointer>=0)
        {
            while (s.charAt(pointer) !=' ')
            {
                tempString.push(s.charAt(pointer));
                pointer--;
                if(pointer<0)
                    break;
            }


            while (!tempString.empty())
            {
                result+=tempString.peek();
                tempString.pop();
                checkForFirstTime=true;
            }

            if(pointer>0 && checkForFirstTime)
            {
                if(s.charAt(pointer-1)!=' ') {
                    result += ' ';
                    checkForFirstTime = false;
                }
            }
            pointer--;
        }
        return result;
    }
}

// s = the  sky is blue
// result = blue is sky the

// 1. Consider a stack and a traversing pointer.
// 2. The pointer will traverse till each space and push the characters respectively to the stack
// 3. If a space is identified stop the respective traversal and start pop operation from stack to result.
// 4. after all elements popped add a single space and continue the operation till the last length of given string.

// "pointer" acts as a sliding window pointer for this approach.