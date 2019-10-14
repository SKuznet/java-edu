package com.edu.lesson8;

public class SyncEx {
    private static final Object key = new Object();

    void getInfo() {
        // logic 1 min
        synchronized (this) {
//        synchronized (key) {
            // sync 2 min
        }
        // logic 1 min
    }

}
