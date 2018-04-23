package com.example.a16046512.sgholiday;

import android.graphics.drawable.Drawable;

public class Holiday {

        private String event;
        private String date;
        private int res;

    public Holiday(String event, String date, int res) {
        this.event = event;
        this.date = date;
        this.res = res;
    }

    public String getEvent() {
        return event;
    }

    public String getDate() {
        return date;
    }

    public int getRes() {
        return res;
    }



}
