package ru.netology.java;


public class PosterManager {

    private String[] films = new String[0];
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 10;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < limit; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
