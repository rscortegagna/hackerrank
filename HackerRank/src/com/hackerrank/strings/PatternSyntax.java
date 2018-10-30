package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 */
public class PatternSyntax
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //PatternSyntaxException pse = null;
            try {
                Pattern.compile(pattern);
                System.out.println("123");
                return;
            } catch (PatternSyntaxException e) {
                System.out.println("456");
                return;
            }
        }
    }
}
