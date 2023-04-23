package com.vitah.learnjp.service;

import com.vitah.learnjp.model.English;
import com.vitah.learnjp.model.dto.GetCard;
import com.vitah.learnjp.repository.EnglishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardsService {
    private final EnglishRepository englishRepository;

    @Autowired
    public CardsService(EnglishRepository englishRepository) {
        this.englishRepository = englishRepository;
    }

    public List<GetCard> getCards() {
        List<English> englishList = englishRepository.findAll();
        List<GetCard> getCardList = new ArrayList<>();
        for (English english : englishList) {
            GetCard getCard = new GetCard(
                    english.getHiragana().getHiragana(),
                    english.getHiragana().getRomaji(),
                    english.getEnglish(),
                    english.getDefinition()
            );
            getCardList.add(getCard);
        }
        return getCardList;
    }
}
