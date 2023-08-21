package com.genka.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Student {
    private String name;
    private final Set<Content> subscribedContents = new LinkedHashSet<>();
    private final Set<Content> completedContents = new LinkedHashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedStudents().add(this);
    }

    public void progressInBootcamp() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()) {
            this.completedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double getStudentXP() {
        return this.completedContents
                .stream()
                .mapToDouble(Content::calculateXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(subscribedContents, student.subscribedContents) && Objects.equals(completedContents, student.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }
}
