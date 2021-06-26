package com.company.MovieCinema;

import java.util.ArrayList;

public class Movie {
    private String name;
    private String director;
    private ArrayList<String> actors;
    private int rating;

    public Movie(String movieTitle, String movieDirector, String movieActor1, String movieActor2, String movieActor3, int movieRating) {
        if ((movieTitle.trim().length() == 0) || (movieTitle == null) ||
                (movieDirector.trim().length() == 0) || (movieDirector == null) ||
                (movieRating < 1) || (movieRating > 10)) {
            throw new IllegalStateException("Title and Director must not be blank. Rating should be between 1 and 10.");
        }
        name = movieTitle;
        director = movieDirector;
        actors = new ArrayList<String>();
        if (movieActor1.length() > 0) {
            actors.add(movieActor1);
        }
        if (movieActor2.length() > 0) {
            actors.add(movieActor2);
        }
        if (movieActor3.length() > 0) {
            actors.add(movieActor3);
        }
        rating = movieRating;
    }

    public void displayMovieInformation() {
        System.out.print("Movie name: " + name + "\n");
        System.out.print("Movie director: " + director + "\n");
        if (actors.size() == 0) {
            System.out.print("No movie actors\n");
        } else {
            for (int i = 0; i < actors.size(); i++) {
                System.out.print("Movie actor " + (i + 1) + ": " + actors.get(i) + "\n");
            }
        }
        System.out.print("Movie rating: " + rating + "\n");
        System.out.print("\n\n");
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public void setActors(String actor1, String actor2, String actor3) {
        if ((actor1.trim().length() == 0) && (actor2.trim().length() == 0) && (actor3.trim().length() == 0)) {
            throw new IllegalArgumentException("Must have at least one non-blank actor to set");
        }
        actors = new ArrayList<String>();
        if (actor1.trim().length() > 0) {
            actors.add(actor1);
        }
        if (actor2.trim().length() > 0) {
            actors.add(actor2);
        }
        if (actor3.trim().length() > 0) {
            actors.add(actor3);
        }
    }

    public void setDirector(String newDirector) {
        if (newDirector.trim().length() == 0) {
            throw new IllegalArgumentException("Director to set must not be blank\n");
        }
        director = newDirector;
    }

    public void setRating(int newRating) {
        if (newRating > 10 || newRating < 1) {
            throw new IllegalArgumentException("Rating must be between 1 and 10\n");
        }
        rating = newRating;
    }

    public void setName(String newTitle) {
        if (newTitle.trim().length() == 0) {
            throw new IllegalArgumentException("Title to set must not be blank\n");
        }
        name = newTitle;
    }
}
