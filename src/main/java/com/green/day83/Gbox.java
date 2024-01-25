package com.green.day83;

public class Gbox<T> {
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
