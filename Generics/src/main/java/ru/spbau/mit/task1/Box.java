package ru.spbau.mit.task1;

public interface Box<T> {
    T get();
    void put(T value);
}
