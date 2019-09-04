package week6.Chapter8Exercises;

import java.util.Scanner;

public class CategoriseStrings2 {
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
        String[] listNoSpaces = new String[10];
        String[] listOneSpace = new String[10];
        String[] listMoreSpaces = new String[10];
        int indexNoSpaces = 0, indexOneSpace = 0, indexMoreSpaces = 0;
        int countSpaces;
        for (String s : stringArray){
            countSpaces = 0;
            if (s != null){
                for (int i=0; i<s.length(); ++i){
                    if (s.charAt(i) == ' '){
                        ++countSpaces;
                    }
                }
                if (countSpaces == 0){
                    listNoSpaces[indexNoSpaces] = s;
                    ++indexNoSpaces;
                } else if (countSpaces == 1){
                    listOneSpace[indexOneSpace] = s;
                } else if (countSpaces > 1) {
                    listMoreSpaces[indexMoreSpaces] = s;
                }
            }
        }
        System.out.println("Type:" +
                "\n1 - List strings with no spaces" +
                "\n2 - List strings with 1 space" +
                "\n3 - List strings with more than 1 space");
        String userChoice = input.nextLine();
        switch (userChoice) {
            case "1":
                System.out.println("Strings with no spaces: ");
                for (String s : listNoSpaces) {
                    if (s != null) {
                        System.out.println(s);
                    }
                }
                break;
            case "2":
                System.out.println("Strings with 1 space: ");
                for (String s : listOneSpace) {
                    if (s != null) {
                        System.out.println(s);
                    }
                }
                break;
            case "3":
                System.out.println("Strings with more than one space: ");
                for (String s : listMoreSpaces) {
                    if (s != null) {
                        System.out.println(s);
                    }
                }
                break;
            default:
                System.out.println("All strings: ");
                for (String s : stringArray) {
                    if (s != null) {
                        System.out.println(s);
                    }
                }
                break;
        }
    }
}


