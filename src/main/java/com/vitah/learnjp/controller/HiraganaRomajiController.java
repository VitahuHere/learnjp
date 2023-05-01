package com.vitah.learnjp.controller;

import com.vitah.learnjp.model.dto.GetCard;
import com.vitah.learnjp.model.dto.PostHiRomajiAnswer;
import com.vitah.learnjp.service.HiraganaRomajiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin(origins = {"http://localhost:5173"})
public class HiraganaRomajiController {
    private final HiraganaRomajiService hiraganaRomajiService;

    public HiraganaRomajiController(HiraganaRomajiService hiraganaRomajiService) {
        this.hiraganaRomajiService = hiraganaRomajiService;
    }

    @GetMapping
    public List<GetCard> getCards() {
        return hiraganaRomajiService.getCards();
    }

    @GetMapping("/random")
    public GetCard getRandomCard() {
        return hiraganaRomajiService.getRandomCard();
    }

    @PostMapping
    public boolean postAnswer(@RequestBody PostHiRomajiAnswer postHiRomajiAnswer) {
        hiraganaRomajiService.checkAnswer(postHiRomajiAnswer);
        return true;
    }
}
