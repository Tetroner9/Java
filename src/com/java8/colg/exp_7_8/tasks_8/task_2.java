package com.java8.colg.exp_7_8.tasks_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static com.java8.colg.exp_7_8.tasks_8.Modifications.*;


class Modifications extends task_2 {

    static String prettifyString(String str) {
        String[] splitStrings = str.split("\\.");
        splitStrings[0] = " " + splitStrings[0];
        StringBuilder newString = new StringBuilder();
        for (String line : splitStrings) {
            newString.append(line).append(".\n");
        }

        return newString.toString();
    }

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

    static String replaceOccurrences(String str) {
        return str.replaceAll("SFIT", "St.Francis Institute of Technology");
    }

    static String longestWord(String str) {
        String[] words = str.split(" ");

        int index = 0;
        int elementLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > elementLength) {
                index = i;
                elementLength = words[i].length();
            }
        }
        longestWord = words[index];
        return words[index];
    }

    static String modifiedString(String str) {
        str = str.replaceAll("SFIT", "St.Francis Institute of Technology");
        String longWord = longestWord(str);
        String[] word = str.split(" ");
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList(word));
        for (String s : words) {
            if (Objects.equals(s, longWord)) {
                String newWord = "*" + s + "*";
                return str.replace(s, newWord);
            }
        }
        return longWord;
    }
}

public class task_2 {
    static String longestWord = "";
    static String normalString = "SFIT was established in 1999. SFIT has three UG Programs and two PG Programs. SFIT is accredited by NBA, approved by AICTE and is affiliated to the University of Mumbai. SFIT is certified with the Quality Management System Standards ISO 9001:2008 for providing undergraduate courses in Engineering & Technology.";
    static String prettifiedStr = prettifyString(normalString);
    static String changedWord = "SFIT";


    public static void main(String[] args) {
        System.out.println("SFIT is repeated " + countOccurrences(prettifiedStr, changedWord) + " times");
        System.out.println("\nReplaced Occurrences:\n" + replaceOccurrences(prettifiedStr));
        System.out.println("\nModified:\n" + modifiedString(prettifiedStr));
        System.out.println("\nLongest Word: \n " + longestWord);

    }
}