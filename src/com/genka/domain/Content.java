package com.genka.domain;

public abstract class Content {
    private String title;
    private String description;

    protected static final double BASE_XP = 10d;

    public Content() {
    }

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calculateXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
