package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void addMovieTest() {
        FilmManager manager = new FilmManager();

        //           Film 1 = "Bloodshot",
        //           Film 2 = "Forward",
        //           Film 3 = "Hotel Belgrade",
        //           Film 4 = "Gentlemen",
        //           Film 5 = "The Invisible Man",
        //           Film 6 = "Trolls. The World Tour",
        //           Film 7 = "Number one"


        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTest() {
        //           Film 1 = "Bloodshot",
        //           Film 2 = "Forward",
        //           Film 3 = "Hotel Belgrade",
        //           Film 4 = "Gentlemen",
        //           Film 5 = "The Invisible Man",
        //           Film 6 = "Trolls. The World Tour",
        //           Film 7 = "Number one"

        FilmManager manager = new FilmManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastBelowLimitTest() {
        FilmManager manager = new FilmManager();
        //           Film 1 = "Bloodshot",
        //           Film 2 = "Forward",
        //           Film 3 = "Hotel Belgrade",
        //           Film 4 = "Gentlemen",
        //           Film 5 = "The Invisible Man",
        //           Film 6 = "Trolls. The World Tour",
        //           Film 7 = "Number one"

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");


        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastAboveLimitTest() {
        FilmManager manager = new FilmManager();

        //           Film 1 = "Bloodshot",
        //           Film 2 = "Forward",
        //           Film 3 = "Hotel Belgrade",
        //           Film 4 = "Gentlemen",
        //           Film 5 = "The Invisible Man",
        //           Film 6 = "Trolls. The World Tour",
        //           Film 7 = "Number one"
        //           Film 7 = "Avatar"
        //           Film 8 = "Finding Nemo"
        //           Film 9 = "Home Alone"
        //           Film 10 = "Iron Man"
        //           Film 11 = "LOST"
        //           Film 12 = "Hangover"


        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");
        manager.addMovie("Film 11");
        manager.addMovie("Film 12");

        String[] expected = {"Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }


}
