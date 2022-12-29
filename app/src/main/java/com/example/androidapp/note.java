package com.example.androidapp;

import android.widget.RadioButton;

import java.util.Date;

public class note {
    private int id;
    private String title;
    private RadioButton button1;
    private RadioButton button2;
    private Date deleted;

    public note(int id, String title, RadioButton button1, RadioButton button2, Date deleted) {
        this.id = id;
        this.title = title;
        this.button1 = button1;
        this.button2 = button2;
        this.deleted = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RadioButton getButton1() {
        return button1;
    }

    public void setButton1(RadioButton button1) {
        this.button1 = button1;
    }

    public RadioButton getButton2() {
        return button2;
    }

    public void setButton2(RadioButton button2) {
        this.button2 = button2;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }
}
