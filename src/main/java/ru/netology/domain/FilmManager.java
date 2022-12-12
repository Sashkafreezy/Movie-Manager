package ru.netology.domain;

public class FilmManager {
    private String[] movies = new String[0];

    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = 10;
    }


    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultlength;
        if (movies.length < limit) {
            resultlength = movies.length;
        } else {
            resultlength = limit;
        }
        String[] tmp = new String[resultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
