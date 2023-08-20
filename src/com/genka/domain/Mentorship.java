package com.genka.domain;

import java.time.LocalDate;

public class Mentorship extends Content {
    LocalDate date;

    public Mentorship() {
    }

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return XP + 10;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + this.getTitle() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
