package com.vitah.learnjp.model;

import com.vitah.learnjp.repository.EnglishRepository;
import com.vitah.learnjp.repository.HiraganaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LangConfig {
    @Bean
    CommandLineRunner commandLineRunner(EnglishRepository englishRepository, HiraganaRepository hiraganaRepository) {
        return args -> {
            Hiragana hiragana_a = new Hiragana(
                    "あ",
                    "a"
            );
            Hiragana hiragana_i = new Hiragana(
                    "い",
                    "i"
            );
            Hiragana hiragana_u = new Hiragana(
                    "う",
                    "u"
            );
            Hiragana hiragana_e = new Hiragana(
                    "え",
                    "e"
            );
            Hiragana hiragana_o = new Hiragana(
                    "お",
                    "o"
            );

            hiraganaRepository.saveAll(
                    List.of(
                            hiragana_a,
                            hiragana_i,
                            hiragana_u,
                            hiragana_e,
                            hiragana_o
                    )
            );

            English english_a = new English(
                    "a",
                    "letter a",
                    hiragana_a
            );
            English english_i = new English(
                    "i",
                    "letter i",
                    hiragana_i
            );
            English english_u = new English(
                    "u",
                    "letter u",
                    hiragana_u
            );
            English english_e = new English(
                    "e",
                    "letter e",
                    hiragana_e
            );
            English english_o = new English(
                    "o",
                    "letter o",
                    hiragana_o
            );

            englishRepository.saveAll(
                    List.of(
                            english_a,
                            english_i,
                            english_u,
                            english_e,
                            english_o
                    )
            );
        };
    }
}
