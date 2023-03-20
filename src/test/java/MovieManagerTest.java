import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {
    @Test
    public void test() {

        MovieManager manager = new MovieManager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFor1() {

        MovieManager manager = new MovieManager();

        manager.addMovie("film 1");


        String[] expected = {"film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFor0() {

        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findLast() {


        MovieManager manager = new MovieManager();


        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        manager.addMovie("film 6");
        manager.addMovie("film 7");
        manager.addMovie("film 8");
        manager.addMovie("film 9");
        String[] expected = {"film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();


        Assertions.assertArrayEquals(expected, actual);


    }
}


