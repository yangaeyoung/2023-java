package com.green.day44;

public class MyOpenApi {
    private MyInfo info;

    public MyOpenApi info(MyInfo info) {
        this.info = info;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s", info);
    }
}
