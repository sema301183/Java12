package ru.netology.manager;

import ru.netology.domain.MovieCatalog;

import static java.lang.System.arraycopy;

public class MovieManager {

    private int countFilms = 10;
    private MovieCatalog[] items = new MovieCatalog[countFilms];     // создание пустого массива

    public MovieManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public MovieManager() {
        this.countFilms = 10;
    }

    public void addMovie(MovieCatalog item) {
        int length = items.length + 1;
        MovieCatalog[] tmp = new MovieCatalog[length];
        arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieCatalog[] getItems() {

        MovieCatalog[] draftResult = new MovieCatalog[countFilms];
        int counter = 0;
        // перебираем результаты
        for (int i = 0; i < countFilms; i++) {
            int index = items.length - i - 1;
            if (items[index] != null) {
                // выборка ненулевых значений
                draftResult[counter] = items[index];
                counter += 1;
            }
        }
        // создание массива с нужной длиной
        MovieCatalog[] result = new MovieCatalog[counter];
        arraycopy(draftResult, 0, result, 0, counter);

        return result;
    }
}