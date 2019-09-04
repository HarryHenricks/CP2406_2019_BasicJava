package week6.Chapter7Exercises;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = getPassword(input);
        boolean goodPassword = checkPasswordOK(password);
        while (!goodPassword) {
            password = getPassword(input);
            goodPassword = checkPasswordOK(password);
        }
        System.out.println("Your password " + password + " is valid");
    }

    private static String getPassword(Scanner input){

        String password = "";
        System.out.println("Please enter a password that contains at least 2 uppercase letters and 2 lowercase letters and 2 digits: ");

        password = input.nextLine();

        return password;
    }

    private static boolean checkPasswordOK(String password){
        int countUpper = 0, countLower = 0, countDigits = 0;
        char currentChar;
        for (int i=0; i<password.length(); ++i){
            currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar)){
                ++countUpper;
            } else if (Character.isLowerCase(currentChar)){
                ++countLower;
            } else if (Character.isDigit(currentChar)){
                ++countDigits;
            }
        }
        return countUpper >= 2 && countLower >= 2 && countDigits >= 2;
    }
}
