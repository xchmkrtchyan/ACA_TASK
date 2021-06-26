package com.company.MovieCinema;

import java.util.ArrayList;
import java.util.Iterator;

public class Database {
    private ArrayList<Movie> movies;

    public Database() {
        movies = new ArrayList<Movie>();
    }

    public Database(ArrayList<Movie> newMovies) {
        movies = newMovies;
    }

    public ArrayList<Movie> getAllMovies() {
        return movies;
    }

    public void addMovie(Movie newMovie) {
        if (newMovie == null) {
            throw new NullPointerException("Must provide a valid movie object\n");
        }

        movies.add(newMovie);
    }

    public void clearAll() {
        movies.clear();
    }

    public void deleteMovie(Movie movieToDelete) {
        movies.remove(movieToDelete);
    }

    public void displayAllMovieTitles() {
        if (movies.size() == 0) {
            System.out.print("No movies\n");
        } else {
            Iterator<Movie> it = movies.iterator();
            int i = 1;
            while (it.hasNext()) {
                Movie movie = it.next();
                System.out.print("Movie number " + i + "\n");
                System.out.print("===============================\n");
                System.out.print("Title : " + movie.getName() + "\n\n");
                i++;
            }
        }
    }

    public ArrayList<Movie> searchForMovie(String searchString, String searchKey, int minRating) {
        ArrayList<Movie> foundMovies = new ArrayList<Movie>();
        Iterator<Movie> it = movies.iterator();
        String searchStringLower = searchString.toLowerCase();  //conver to lowercase to ensure search is case-insensitive

        while (it.hasNext()) {
            //get the next movie in the database
            Movie movie = it.next();
            String title = movie.getName().toLowerCase();
            String director = movie.getDirector().toLowerCase();

            int rating = movie.getRating();

            if (searchKey.equals("title")) {
                if (title.equals(searchStringLower)) {
                    foundMovies.add(movie);
                }
            } else if (searchKey.equals("director")) {
                if (director.equals(searchStringLower)) {
                    foundMovies.add(movie);
                }
            } else if (searchKey.equals("favourite")) {
                if (rating >= minRating) {
                    foundMovies.add(movie);
                }
            } else {
                System.out.print("\nError! Can not search over that key!\n");
            }
        }
        return foundMovies;
    }
}
