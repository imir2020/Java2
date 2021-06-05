package ru.progwards.java2.lessons.generics;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] abs;
    private static final int LENGTH = 2;

    public DynamicArray() {//конструктор должен быть по умолчанию.
        abs = (T[]) new Object[LENGTH];

    }


    //данном методе реализовать механизм роста массива, путем создания нового, в 2 раза большего массива, и копирования в него данных из старого массива.
    //Смотреть лекцию по коллекциям и хэш - таблицам.
    void add(T example) {
        for (int i = 0; i < abs.length; i++) {
            if (abs[i] == null) {
                abs[i] = example;
                break;
            }
        }
        if (abs[abs.length - 1] != null) {
            abs = Arrays.copyOf(abs, LENGTH * 2);

        }

    }

    //Нужно установить в метод обработку исключений
    T[] insert(int pos, T element) {
        abs[pos] = element;
        return abs;
    }

    //Нужно установить в метод обработку исключений
    T[] remove(int pos) {
        abs[pos] = null;
        return abs;
    }

    //Нужно установить в метод обработку исключений
    T get(int pos) {
        T element = abs[pos];
        return element;
    }

    int size() {
        return abs.length;//принципе можно подойти к этой проблеме более фундаментально.
    }

    public static void main(String[] args) {
        DynamicArray<Integer> one = new DynamicArray<>();
        one.add(12);
        one.add(13);
        one.add(114);
        one.add(373);
        System.out.println(one.get(3));
        one.size();
        System.out.println(one.size());
        one.insert(1, 19);
        System.out.println(one.insert(1, 19));
    }
}
