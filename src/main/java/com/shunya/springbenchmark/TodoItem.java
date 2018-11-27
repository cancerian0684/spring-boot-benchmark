package com.shunya.springbenchmark;

import java.util.Date;

public class TodoItem {
    private String title;
    private Date createdAt;

    public TodoItem() {
    }

    public TodoItem(String title, Date createdAt) {
        this.title = title;
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}