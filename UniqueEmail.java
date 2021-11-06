package com.company;
//Email Generator
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.print(numUniqueNames(emails));
    }

    public static int numUniqueNames(String[] emails)
    {
        HashSet<String> sanitizedMails = new HashSet<String>();

        for(String mails : emails)
        {
            sanitizedMails.add(clearMails(mails));
        }
        return sanitizedMails.size();
    }

    public static String clearMails(String mails)
    {
        String localName = "";
        String domainName = "";
        int i = 0;
        while(mails.charAt(i)!='@')
        {
            while (mails.charAt(i)=='.')
            {
                i++;
            }
            if (mails.charAt(i)=='+')
            {
                while(mails.charAt(i)!='@') {
                    i++;
                }
            }
            else {
                localName += mails.charAt(i);
                i++;
            }
        }
        i++;
        while (i<mails.length())
        {
            domainName+=mails.charAt(i);
            i++;
        }
        return localName+'@'+domainName;
    }

}
