package week6.Chapter8Exercises;

import java.util.Scanner;

public class CategoriseStrings {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter up to 10 strings (stop to finish entering strings): ");
        String currentStr = input.nextLine();
        final String quitValue = "finish";
        if (!currentStr.toLowerCase().equals(quitValue)){
            stringArray[0] = currentStr;
            index = 1;
        }
        while (!currentStr.toLowerCase().equals(quitValue)){
            System.out.println("Enter next string or finish: ");
            currentStr = input.nextLine().toLowerCase();
            if (!currentStr.toLowerCase().equals(quitValue)) {
                stringArray[index] = currentStr;
                ++index;
            } else {
                break;
            }
        }
        String[] list1 = new String[10]; // for strings under 10 characters
        String[] list2 = new String[10];
        int countChars;
        int list1Index = 0, list2Index = 0;
        for (String s : stringArray) {
            if (s != null) {
                countChars = s.length();
                if (countChars < 10) {
                    list1[list1Index] = s;
                    ++list1Index;
                } else {
                    list2[list2Index] = s;
                    ++list2Index;
                }
            }
        }
        System.out.println("Smaller - Display list of strings with less than 10 characters" +
                "\nLarger - Display list of strings with 10 or more characters");
        String listChoice = input.nextLine().toLowerCase();
        if (listChoice.equals("smaller")){
            System.out.println("The list of strings with less than 10 characters is: ");
            for (String s : list1) {
                if (s != null) {
                    System.out.println(s);
                }
            }
        } else {
            System.out.println("The list of strings with 10 or more characters is: ");
            for (String s : list2) {
                if (s != null) {
                    System.out.println(s);
                }
            }
        }
    }
}
