package com.java8.colg.exp_7_8.tasks_8;

import static com.java8.colg.exp_7_8.tasks_8.Modified.ModifiedString;
import static com.java8.colg.exp_7_8.tasks_8.StringTest.*;

class StringTest {

    static int countOccurrences(String str, String word) {

        String[] a = str.split(" ");


        int count = 0;
        for (String s : a) {

            if (word.equals(s)) {
                count++;
            }

        }

        return count;
    }

    public static String ReplaceOccurences(String str){
        return str.replaceAll("SFIT","St.Francis Institute of Technology");
    }

    public static String LongestWord(String str){
        String[] word = str.split(" ");
        String longword = " ";
        for (int i = 0; i < word.length; i++)
            for (int j = 1 + i; j < word.length; j++)
                if (word[i].length() >= word[j].length()) {
                    longword = word[i];
                    longword = "*"+longword+"*";
                }
        return longword;
    }
}

class Modified extends StringTest{
    public static String ModifiedString(String str){


        return str.replaceAll("SFIT", "St.Francis Institute of Technology");
    }
}
public class task_2 {
    public static void main(String[] args) {
        String str = "SFIT was established in 1999. SFIT has three UG Programs and two PG Programs.\n" +
                "SFIT is accredited by NBA, approved by AICTE and is affiliated to the University of\n" +
                "Mumbai. SFIT is certified with the Quality Management System Standards ISO\n" +
                "9001:2008 for providing undergraduate courses in Engineering & Technology. ";
        String word = "SFIT";
        System.out.println("SFIT is repeated "+countOccurrences(str, word)+" times");
        System.out.println("\nReplaced Occurences: \n"+ReplaceOccurences(str));
        System.out.println("\nLongest Word: \n"+LongestWord(str));
        System.out.println("\nModified: \n"+ModifiedString(str));



    }

    }

