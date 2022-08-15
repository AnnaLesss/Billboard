package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java.PosterManager;

public class PosterManagerTest {
    String film1 = "Бландшот";
    String film2 = "Вперед";
    String film3 = "Отель Белград";
    String film4 = "Джентельмены";
    String film5 = "Человек-невидимка";
    String film6 = "Тролли";
    String film7 = "Номер один";
    String film8 = "Одна";
    String film9 = "Маугли";
    String film10 = "Кукла";


    @Test
    public void TestingFilms() {

        PosterManager manager = new PosterManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        String[] expected = {
                "Бландшот",
                "Вперед",
                "Отель Белград",
                "Джентельмены",
                "Человек-невидимка",
                "Тролли",
                "Номер один",
                "Одна",
                "Маугли",
                "Кукла"
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void TestingFindLast() {
        PosterManager manager = new PosterManager(10);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        String[] expected = {
                "Кукла",
                "Маугли",
                "Одна",
                "Номер один",
                "Тролли",
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград",
                "Вперед",
                "Бландшот",
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void TestingFindLastLimit5() {
        PosterManager manager = new PosterManager(5);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        String[] expected = {
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград",
                "Вперед",
                "Бландшот",
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void TestingFindLastLimitLowerThenLength() {
        PosterManager manager = new PosterManager(4);

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);


        String[] expected = {
                "Человек-невидимка",
                "Джентельмены",
                "Отель Белград",
                "Вперед",
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

