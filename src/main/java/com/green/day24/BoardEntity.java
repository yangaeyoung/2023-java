package com.green.day24;

public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnts;
    private String write;
    private String createdAt;
    private String updatedAt;

    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtnts() {
        return ctnts;
    }

    public void setCtnts(String ctnts) {
        this.ctnts = ctnts;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString (){
        return String.format("Iboard: %d, Title: %s, Write: %s, Ctnts: %s, CreatedAt: %s", getIboard(), getTitle(), getCtnts(), getWrite(),getCreatedAt());
    }
}
