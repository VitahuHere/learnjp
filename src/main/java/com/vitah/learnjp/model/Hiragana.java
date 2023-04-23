package com.vitah.learnjp.model;


import jakarta.persistence.*;

@Entity
@Table
public class Hiragana {
    @Id
    @SequenceGenerator(
            name = "hiragana_sequence",
            sequenceName = "hiragana_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hiragana_sequence"
    )
    private Long id;

    @Column(
            nullable = false,
            length = 100
    )
    private String hiragana;
    @Column(
            nullable = false,
            length = 100
    )
    private String romaji;

    public Hiragana() {
    }

    public Hiragana(Long id, String hiragana, String romaji) {
        this.id = id;
        this.hiragana = hiragana;
        this.romaji = romaji;
    }

    public Hiragana(String hiragana, String romaji) {
        this.hiragana = hiragana;
        this.romaji = romaji;
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

    @Override
    public String toString() {
        return "Hiragana{" +
                "id=" + id +
                ", hiragana='" + hiragana + '\'' +
                ", romaji='" + romaji + '\'' +
                '}';
    }
}
