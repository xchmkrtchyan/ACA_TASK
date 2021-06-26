package com.company.MovieCinema;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {
    private Database movieDatabase;

    public Controller() {
        movieDatabase = new Database();
    }

    public static void main(String[] args) {
        Controller movieLibrary = new Controller();
        movieLibrary.runController();
    }

    private void deleteMovie() {
        UserInputValidation userInputValidation = new UserInputValidation();
        String movieTitleToDelete = userInputValidation.readStringFromUser("Enter movie title to delete: ", false);

        // Search for the movie to delete by its title
        ArrayList<Movie> moviesForDelete = movieDatabase.searchForMovie(movieTitleToDelete, "title", 0);

        if (moviesForDelete.size() == 0) //If no matching movie is found
        {
            System.out.print("\nNo movies found matching that title.\n\n");
        } else //Movie was found to delete
        {
            System.out.print("\n");
            moviesForDelete.get(0).displayMovieInformation();  //There will only be one movie element as titles are unique so get it and display it

            try {
                //Set up the confirmation menu with yes or no options
                String deleteMenuTitle = "\nAre you sure you want to delete: " + moviesForDelete.get(0).getName() + " ?\n";
                ArrayList<String> deleteMenuOptions = new ArrayList<String>();
                deleteMenuOptions.add("Yes\n");
                deleteMenuOptions.add("No\n");
                Console confirmDeleteConsole = new Console(deleteMenuTitle, deleteMenuOptions);

                //Initially set this to 0 so while loop will be entered
                int deleteOptionChosen = 0;
                //Keep asking for user to enter option until valid input received (readIntegerFromUser returns 0 for error)
                while (deleteOptionChosen == 0) {
                    userInputValidation.clearScreen();
                    confirmDeleteConsole.displayMenu();
                    // Read which delete option the user wants (1 for yes 2 for no)
                    deleteOptionChosen = userInputValidation.readIntegerFromUser(2, "Please choose an option between 1 and 2: ");
                }

                if (deleteOptionChosen == 1) //User wants to delete the movie
                {
                    movieDatabase.deleteMovie(moviesForDelete.get(0));
                    System.out.print("\nMovie successfully deleted.\n\n");
                } else //User doesn't want to delete the movie
                {
                    System.out.print("\nOk. movie won't be deleted.\n\n");
                }
            } catch (IllegalStateException e) {
                System.out.print("\nError creating menu!\n");
            }
        }
    }

    private void displayFavouriteMovies() {
        UserInputValidation userInputValidation = new UserInputValidation();

        int minFavRating = 0;   // Set to 0 initially so while loop asking for user to enter rating is entered
        while (minFavRating == 0)  // Keep asking user to enter number between 1 and 10
        {
            userInputValidation.clearScreen();
            //readIntegerFromUser returns 0 if number between 1 and 10 is not entered (so loop keeps going)
            minFavRating = userInputValidation.readIntegerFromUser(10, "Please choose a minimum favourite rating between 1 and 10: ");
        }

        ArrayList<Movie> favMovies = movieDatabase.searchForMovie("", "favourite", minFavRating);
        if (favMovies.size() == 0) {
            System.out.print("\nNo movies found above or equal to that rating.\n\n");
        } else {
            System.out.print("\nFavourite Movies:\n\n");

            Iterator<Movie> it = favMovies.iterator();
            while (it.hasNext()) {
                Movie movie = it.next();
                movie.displayMovieInformation();
            }

        }
    }

    private Movie readMovieInformationFromUser() {
        UserInputValidation userInputValidation = new UserInputValidation();

        String messagePromptForUser = "\nPlease enter the movie title: ";
        boolean titleAlreadyExists = true;  // Initially set to true so will enter while and start asking user to enter title
        String title = "";
        while (titleAlreadyExists)  // Keep asking user for a title until one is entered that isn't already in the database
        {
            userInputValidation.clearScreen();
            title = userInputValidation.readStringFromUser(messagePromptForUser, false);
            ArrayList<Movie> moviesMatchingTitle = movieDatabase.searchForMovie(title, "title", 0);
            if (moviesMatchingTitle.size() == 0) {
                titleAlreadyExists = false;  //Movie title doesn't exist in database so exit out of loop
            } else {
                System.out.print("\nError a movie with that title already exists!.\n\n");
                userInputValidation.pressEnterToContinue();
            }
        }

        //Read movie director
        messagePromptForUser = "\nPlease enter the movie director: ";
        String director = userInputValidation.readStringFromUser(messagePromptForUser, false);

        //Read actor 1
        messagePromptForUser = "\nPlease enter the first movie actor if you don't want to enter actor press ENTER: ";
        String actor1 = userInputValidation.readStringFromUser(messagePromptForUser, true);

        //Read actor 2
        messagePromptForUser = "\nPlease enter the second movie actor if you don't want to enter actor press ENTER: ";
        String actor2 = userInputValidation.readStringFromUser(messagePromptForUser, true);

        //Read actor 3
        messagePromptForUser = "\nPlease enter the third movie actor if you don't want to enter actor press ENTER: ";
        String actor3 = userInputValidation.readStringFromUser(messagePromptForUser, true);

        //Read movie rating from user
        messagePromptForUser = "Please enter the movie rating: ";
        int ratingFromUser = 0; // Set to 0 initially so while loop is entered
        while (ratingFromUser == 0) {
            //method returns 0 for error so will keep asking until valid integer is entered
            ratingFromUser = userInputValidation.readIntegerFromUser(10, messagePromptForUser);
        }

        try {
            Movie newMovie = new Movie(title, director, actor1, actor2, actor3, ratingFromUser);
            // Return the new movie object with all the read in information
            return newMovie;
        } catch (IllegalStateException e) {
            System.out.print(e.getMessage());
            return null;
        }
    }

    public void runController() {
        boolean continueProgram = true;
        int optionChosen = 0;

        String menuTitle = "\nMovie Database\n";
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("Search movie\n");
        menuOptions.add("Add a movie\n");
        menuOptions.add("Delete movie\n");
        menuOptions.add("Display Favourite Movies\n");
        menuOptions.add("Exit\n");
        try {
            Console driverConsole = new Console(menuTitle, menuOptions);
            UserInputValidation userInputValidation = new UserInputValidation();
            while (continueProgram) {
                userInputValidation.clearScreen();
                driverConsole.displayMenu();

                //Read the integer the user inputted, 0 is returned by readIntegerFromUser for error
                optionChosen = userInputValidation.readIntegerFromUser(5, "Please choose an option between 1 and 5: ");
                userInputValidation.clearScreen();

                switch (optionChosen) {
                    // Search for movie by title or director
                    case 1:
                        searchForMovie();
                        userInputValidation.pressEnterToContinue();
                        break;

                    // Read a new movie from the user and add it to the database of movies
                    case 2:
                        Movie newMovie = readMovieInformationFromUser();
                        movieDatabase.addMovie(newMovie);
                        break;

                    // Delete a movie from the database, by matching title
                    case 3:
                        deleteMovie();
                        userInputValidation.pressEnterToContinue();
                        break;

                    // Display all movies above and including a minimum rating taken from the user
                    case 4:
                        displayFavouriteMovies();
                        userInputValidation.pressEnterToContinue();
                        break;

                    // Exit the program, save all movies in database to file before finishing
                    case 5:
                        continueProgram = false;
                        movieDatabase.clearAll();
                        break;

                    // Out of bounds option
                    default:
                        System.out.print("\nError! That option does not exist!\n");
                        break;
                }
            }
        } catch (IllegalStateException e) {
            System.out.print("\nError creating menu!\n");
        }
    }

    private void searchForMovie() {

        try {
            //Set up the search menu with two options
            String searchMenuTitle = "\nMovie Search\n";
            ArrayList<String> searchMenuOptions = new ArrayList<String>();
            searchMenuOptions.add("Search by title\n");
            searchMenuOptions.add("Search by director\n");
            Console searchOptionConsole = new Console(searchMenuTitle, searchMenuOptions);

            UserInputValidation userInputValidation = new UserInputValidation();

            int searchOptionChosen = 0;
            while (searchOptionChosen == 0) {
                userInputValidation.clearScreen();
                searchOptionConsole.displayMenu();
                searchOptionChosen = userInputValidation.readIntegerFromUser(2, "Please choose an option between 1 and 2: ");
            }

            // searchKey refers to the field in the Movie object we wish to search over
            String searchKey = "";
            if (searchOptionChosen == 1) {
                searchKey = "title";
            } else {
                searchKey = "director";
            }

            // searchString will be the string the user wants to search for
            String searchString = userInputValidation.readStringFromUser("Enter " + searchKey + " to search for: ", false);
            ArrayList<Movie> foundMovies = movieDatabase.searchForMovie(searchString, searchKey, 0);
            if (foundMovies.size() == 0) {
                System.out.print("\nNo movies found.\n\n");
            } else {
                System.out.print("\n");
                Iterator<Movie> it = foundMovies.iterator();
                while (it.hasNext()) {
                    Movie movie = it.next();
                    movie.displayMovieInformation();
                }
            }
        } catch (IllegalStateException e) {
            System.out.print("\nError creating menu!\n");
        }
    }
}
