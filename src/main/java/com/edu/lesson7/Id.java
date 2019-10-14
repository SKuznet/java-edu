package com.edu.lesson7;

public class Id {
    private int id;

    public Id(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
