package com.company.MovieCinema;

import java.util.Scanner;

public class UserInputValidation {
    final static String ESC = "\033[";

    public UserInputValidation() {
    }

    public void clearScreen() {
        System.out.print(ESC + "2J");
    }

    private boolean isStringNumeric(String stringToCheck) {
        for (int i = 0; i < stringToCheck.length(); i++) {
            //Consider one character in a time
            String c = stringToCheck.substring(i, i + 1);

            //Check if char is a number
            if (!(c.equals("0") || c.equals("1") || c.equals("2") || c.equals("3") ||
                    c.equals("4") || c.equals("5") || c.equals("6") || c.equals("7") ||
                    c.equals("8") || c.equals("9"))) {
                return false;
            }
        }

        return true;
    }

    public void pressEnterToContinue() {
        Scanner console = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        console.nextLine();
    }

    public int readIntegerFromUser(int maxNumber, String inputPrompt) {
        Scanner console = new Scanner(System.in);  // Create a scanner object read input from user
        boolean error = true;  //error is true to begin as we have no number from user initialize
        int numberChosen = 0;
        int inputNumber = -1;

        System.out.print("\n" + inputPrompt);
        String input = console.nextLine();
        input = input.trim();   // Remove spaces

        if (input.length() == 0) {
            System.out.print("\nError - you must enter something!\n");
            pressEnterToContinue();
            error = true;
        } else {
            //Check if input is a number first
            boolean inputIsNumber = isStringNumeric(input);

            //If Input is a number check if its a valid number, otherwise tell user we need a number
            if (inputIsNumber) {
                // We know string is a number so convert it to an integer now
                inputNumber = Integer.parseInt(input);

                // Only do more checks if a maximum number to check for has been set (maxNumber <= 0 indicates no check for maximum)
                if (maxNumber > 0) {
                    // Check that the input number is greater than 0 and less than or equal to the maximum provided
                    if ((inputNumber <= maxNumber) && (inputNumber > 0)) {
                        numberChosen = inputNumber;
                        error = false;
                    } else {
                        System.out.print("\nError! Entered number must be between 1 and " + maxNumber + "\n");
                        pressEnterToContinue();
                        error = true;
                    }
                } else {
                    numberChosen = inputNumber;
                    error = false;
                }
            } else {
                // Input string wasn't a number
                System.out.print("\nError! Input must be a number!\n");
                pressEnterToContinue();
                error = true;
            }
        }
        if (error) {
            // There was some error in the input from user, 0 is returned to indicate error
            return 0;
        } else {
            // no error than return the number, guarunteed to be between 1 and maxNumber provided
            return numberChosen;
        }
    }

    public String readStringFromUser(String messagePrompt, boolean emptyStringAllowed) {
        Scanner console = new Scanner(System.in); //  scanner for read input from user
        System.out.print(messagePrompt);
        String inputName = console.nextLine();
        inputName = inputName.trim();   // Remove spaces

        if (!emptyStringAllowed) {
            while (inputName.length() == 0) // If user enters nothing for input saying you input 0 length name
            {
                clearScreen();
                System.out.print("Error - input must be at least one character long.\n");
                System.out.print(messagePrompt);
                inputName = console.nextLine();
                inputName = inputName.trim();   // Remove spaces
            }
        }
        return inputName;
    }

}
