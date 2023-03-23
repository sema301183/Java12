package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieCatalog;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager(7);

    private final MovieCatalog first = new MovieCatalog(
            1, 1, "Movie1", "action");
    private final MovieCatalog second = new MovieCatalog(
            2, 2, "Movie2", "action");
    private final MovieCatalog third = new MovieCatalog(
            3, 3, "Movie3", "action");
    private final MovieCatalog four = new MovieCatalog(
            4, 4, "Movie4", "action");
    private final MovieCatalog five = new MovieCatalog(
            5, 5, "Movie5", "action");
    private final MovieCatalog six = new MovieCatalog(
            6, 6, "Movie6", "action");
    private final MovieCatalog seven = new MovieCatalog(
            7, 7, "Movie7", "action");
    private final MovieCatalog eight = new MovieCatalog(
            8, 8, "Movie8", "action");
    private final MovieCatalog nine = new MovieCatalog(
            9, 9, "Movie9", "action");
    private final MovieCatalog ten = new MovieCatalog(
            10, 10, "Movie10", "action");
    private final MovieCatalog eleven = new MovieCatalog(
            11, 11, "Movie11", "action");
    private final MovieCatalog twelve = new MovieCatalog(
            12, 12, "Movie12", "action");

    @BeforeEach
    void prepareManager() {
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        manager.addMovie(twelve);
    }

    @Test
    public void shouldSave() {
        manager.addMovie(first);
        MovieCatalog[] expected = new MovieCatalog[]{
                first,
                twelve,
                eleven,
                ten,
                nine,
                eight,
                seven
        };
        MovieCatalog[] actual = manager.getItems();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        MovieCatalog[] actual = manager.getItems();
        MovieCatalog[] expected = {
                twelve,
                eleven,
                ten,
                nine,
                eight,
                seven,
                six
        };
        assertArrayEquals(expected, actual);
    }

}