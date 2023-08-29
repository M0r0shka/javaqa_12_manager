package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void getAllFilmsTest() {
        ProductManager manager = new ProductManager();
        manager.saveNewFilm("Film1");
        manager.saveNewFilm("Film2");
        manager.saveNewFilm("Film3");
        manager.saveNewFilm("Film4");

        String[] expected = {"Film1", "Film2", "Film3", "Film4"};
        String[] actual = manager.getAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastAddedFilmsReversedTest() {
        ProductManager manager = new ProductManager(3);
        manager.saveNewFilm("Film1");
        manager.saveNewFilm("Film2");
        manager.saveNewFilm("Film3");
        manager.saveNewFilm("Film4");

        String[] expected = {"Film4", "Film3", "Film2"};
        String[] actual = manager.getLastAddedFilmsReversed();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void getLastAddedFilmsReversedWithDefaultParameter() {
        ProductManager manager = new ProductManager();
        manager.saveNewFilm("Film1");
        manager.saveNewFilm("Film2");
        manager.saveNewFilm("Film3");
        manager.saveNewFilm("Film4");
        manager.saveNewFilm("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.getLastAddedFilmsReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastAddedFilmsReversedIfParameterMoreThanLength() {
        ProductManager manager = new ProductManager(8);
        manager.saveNewFilm("Film1");
        manager.saveNewFilm("Film2");
        manager.saveNewFilm("Film3");
        manager.saveNewFilm("Film4");

        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.getLastAddedFilmsReversed();

        Assertions.assertArrayEquals(expected, actual);
    }

}
