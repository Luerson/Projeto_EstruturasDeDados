package com.example.projetoed.implementations;

public interface DEQueue<T> {
    public boolean isEmpty();

    public int size();

    public T front();

    public void push(T v);

    public T pop();

    public void clear();
}
