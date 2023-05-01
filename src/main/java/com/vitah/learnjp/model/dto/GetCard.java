package com.vitah.learnjp.model.dto;

public class GetCard {
    private Long id;
    private String hiragana;
    private String romaji;
    private String english;
    private String englishDefinition;

    public GetCard() {
    }

    public GetCard(Long id, String hiragana, String romaji, String english, String englishDefinition) {
        this.id = id;
        this.hiragana = hiragana;
        this.romaji = romaji;
        this.english = english;
        this.englishDefinition = englishDefinition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHiragana() {
        return hiragana;
    }

    public void setHiragana(String hiragana) {
        this.hiragana = hiragana;
    }

    public String getRomaji() {
        return romaji;
    }

    public void setRomaji(String romaji) {
        this.romaji = romaji;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getEnglishDefinition() {
        return englishDefinition;
    }

    public void setEnglishDefinition(String englishDefinition) {
        this.englishDefinition = englishDefinition;
    }
}
