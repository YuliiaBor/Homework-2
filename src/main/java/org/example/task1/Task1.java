package org.example.task1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Exersice 1");
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);
        String str4 = str3.replace("P", "");
        String str5 = str4.replace("p", "");

        System.out.println("The concatenated string with replacements: " + str5);

    }
}









