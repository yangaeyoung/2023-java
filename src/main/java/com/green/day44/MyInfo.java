package com.green.day44;

public class MyInfo {
    private String title;
    private String description;

    public MyInfo title(String title) {
        this.title = title;
        return this;
    }

    public MyInfo description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return String.format("title: %s\ndescription: %s\n", title, description);
    }
}
