package com.vitah.learnjp.model;


import jakarta.persistence.*;

@Entity
@Table
public class English {
    @Id
    @SequenceGenerator(
            name = "english_sequence",
            sequenceName = "english_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "english_sequence"
    )
    private Long id;
    @Column(
            nullable = false,
            length = 100
    )
    private String english;
    @Column(
            nullable = false,
            length = 100
    )
    private String definition;
    @OneToOne
    private Hiragana hiragana;

    public English() {
    }

    public English(Long id, String english, String definition, Hiragana hiragana) {
        this.id = id;
        this.english = english;
        this.definition = definition;
        this.hiragana = hiragana;
    }

    public English(String english, String definition, Hiragana hiragana) {
        this.english = english;
        this.definition = definition;
        this.hiragana = hiragana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Hiragana getHiragana() {
        return hiragana;
    }

    public void setHiragana(Hiragana hiragana) {
        this.hiragana = hiragana;
    }

    @Override
    public String toString() {
        return "English{" +
                "id=" + id +
                ", english='" + english + '\'' +
                ", definition='" + definition + '\'' +
                ", hiragana=" + hiragana +
                '}';
    }
}
