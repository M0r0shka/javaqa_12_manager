package ru.netology;

public class ProductManager {

    private String[] filmRepo = new String[0];
    private int lastAddedFilms = 5;

    public ProductManager() {
    }

    public ProductManager(int lastAddedFilms) {
        this.lastAddedFilms = lastAddedFilms;
    }

    public void saveNewFilm(String newFilm) {
        String[] tmp = new String[filmRepo.length + 1];
        for (int i = 0; i < filmRepo.length; i++) {
            tmp[i] = filmRepo[i];
        }
        tmp[tmp.length - 1] = newFilm;
        filmRepo = tmp;
    }

    public String[] getAllFilms() {
        return filmRepo;
    }

    public String[] getLastAddedFilmsReversed() {
        int resultLength;
        if (filmRepo.length < lastAddedFilms) {
            resultLength = filmRepo.length;
        } else {
            resultLength = lastAddedFilms;
        }
        String[] all = getAllFilms();
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
