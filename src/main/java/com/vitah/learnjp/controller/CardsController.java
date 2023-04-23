package com.vitah.learnjp.controller;

import com.vitah.learnjp.model.dto.GetCard;
import com.vitah.learnjp.service.CardsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CardsController {
    private final CardsService cardsService;

    public CardsController(CardsService cardsService) {
        this.cardsService = cardsService;
    }

    @RequestMapping("/cards")
    public List<GetCard> getCards() {
        return cardsService.getCards();
    }

}
