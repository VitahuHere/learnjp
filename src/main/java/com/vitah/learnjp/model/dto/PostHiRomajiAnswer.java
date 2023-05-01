package com.vitah.learnjp.model.dto;

public class PostHiRomajiAnswer {
    private Long id;
    private String romaji;

    public PostHiRomajiAnswer() {
    }

    public PostHiRomajiAnswer(Long id, String romaji) {
        this.id = id;
        this.romaji = romaji;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }
}
