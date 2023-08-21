package com.genka.domain;

public class Course extends Content{
    private int duration;

    public Course() {
    }

    public Course(String title, String description, int duration) {
        super(title, description);
        this.duration = duration;
    }

    @Override
    public double calculateXP() {
        return BASE_XP + this.duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + this.getTitle() + '\'' +
                ", description='" + this.getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }
}
