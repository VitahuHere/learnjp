package com.vitah.learnjp.repository;

import com.vitah.learnjp.model.English;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnglishRepository extends JpaRepository<English, Long> {
}