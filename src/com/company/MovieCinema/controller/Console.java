package com.company.MovieCinema;

import java.util.ArrayList;

public class Console {
    private String consoleTitle;
    private ArrayList<String> consoleOptions;

    public Console(String title, ArrayList<String> options) {
        if ((title.trim().length() == 0) || (options.size() < 2)) {
            throw new IllegalStateException("Must provide non-empty title and at least 2 options");
        }
        consoleTitle = title;
        consoleOptions = options;
    }

    public void addOptionToMenu(String option) // adding new option in console menu
    {
        if (option.trim().length() == 0) {
            throw new IllegalStateException("Must provide non-blank option.\n");
        }
        consoleOptions.add(option);
    }

    public void displayMenu() {
        System.out.print(consoleTitle);
        System.out.print("============================\n");
        for (int i = 0; i < consoleOptions.size(); i++) {
            System.out.print("(" + (i + 1) + "): " + consoleOptions.get(i));
        }
    }

    public String getTitle() {
        return consoleTitle;
    }

    public void setTitle(String title) {
        if (title.trim().length() == 0) {
            throw new IllegalStateException("Must provide non-blank title.\n");
        }
        consoleTitle = title;
    }
}
