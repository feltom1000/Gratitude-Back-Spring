package com.gratitude.agradecimientos.domain.repository;

import com.gratitude.agradecimientos.domain.Thanks;

import java.util.List;
import java.util.Optional;

public interface ThanksRepository {
    List<Thanks> getAll();
    Optional<Thanks> getThanks(int thanksId);
    Thanks save(Thanks thanks);
    void delete(int thanksId);
}
