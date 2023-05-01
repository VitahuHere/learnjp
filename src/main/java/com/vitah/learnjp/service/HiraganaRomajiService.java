package com.vitah.learnjp.service;

import com.vitah.learnjp.model.English;
import com.vitah.learnjp.model.Hiragana;
import com.vitah.learnjp.model.dto.GetCard;
import com.vitah.learnjp.model.dto.PostHiRomajiAnswer;
import com.vitah.learnjp.repository.EnglishRepository;
import com.vitah.learnjp.repository.HiraganaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class HiraganaRomajiService {
    private final EnglishRepository englishRepository;
    private final HiraganaRepository hiraganaRepository;

    @Autowired
    public HiraganaRomajiService(EnglishRepository englishRepository, HiraganaRepository hiraganaRepository) {
        this.englishRepository = englishRepository;
        this.hiraganaRepository = hiraganaRepository;
    }

    public List<GetCard> getCards() {
        List<English> englishList = englishRepository.findAll();
        List<GetCard> getCardList = new ArrayList<>();
        for (English english : englishList) {
            GetCard getCard = new GetCard(
                    english.getHiragana().getId(),
                    english.getHiragana().getHiragana(),
                    english.getHiragana().getRomaji(),
                    english.getEnglish(),
                    english.getDefinition()
            );
            getCardList.add(getCard);
        }
        return getCardList;
    }

    public GetCard getRandomCard(){
        long size = englishRepository.count();
        long random = (long) (Math.random() * size + 1);
        English english = englishRepository.findById(random).orElse(null);
        if (english == null) {
            return getRandomCard();
        }
        return new GetCard(
                english.getHiragana().getId(),
                english.getHiragana().getHiragana(),
                english.getHiragana().getRomaji(),
                english.getEnglish(),
                english.getDefinition()
        );
    }

    public void checkAnswer(PostHiRomajiAnswer answer) {
        Hiragana hiragana = hiraganaRepository.findById(answer.getId()).orElse(null);
        if (hiragana == null) {
            return;
        }
    }
}
