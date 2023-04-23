package com.vitah.learnjp.repository;

import com.vitah.learnjp.model.Hiragana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiraganaRepository extends JpaRepository<Hiragana, Long> {
}
