package com.vitah.learnjp.model.dto;

public class GetCard {
    private String hiragana;
    private String romaji;
    private String english;
    private String englishDefinition;

    public GetCard() {
    }

    public GetCard(String hiragana, String romaji, String english, String englishDefinition) {
        this.hiragana = hiragana;
        this.romaji = romaji;
        this.english = english;
        this.englishDefinition = englishDefinition;
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
