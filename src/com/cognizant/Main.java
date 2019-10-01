package com.cognizant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.maxOfTwoNumbers(1,2));
        System.out.println(m.maxOfThree(10,10,100));
        System.out.println(m.isCharacterAVowel('a'));
        System.out.println(m.reverseString("Hello"));
    }

    private int maxOfTwoNumbers(int n1, int n2){
        return n1>n2 ? n1 : n2;
    }

    private int maxOfThree(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }

    private boolean isCharacterAVowel(char c){
        switch (c){
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                return true;
            default: return false;
        }
    }
    private String reverseString(String arr){
        String newStr = "";
        for (int i = arr.length()-1; i >=0 ; i--) {
            newStr+=arr.charAt(i);
        }
        return newStr;
    }

    private String findLongestWord(String[] strArray){
        String longest = strArray[0];
        for (String str:strArray) {
            if (str.length()>longest.length())
                longest=str;
        }
        return longest;
    }

    private String[] filterLongWords(String[] strArray, int i){
        ArrayList<String> strings = new ArrayList<>();
        for (String str:strArray) {
            if (str.length()>i){
                strings.add(str);
            }
        }
        return (String[]) strings.toArray();
    }
}
