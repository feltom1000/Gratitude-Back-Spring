package com.gratitude.agradecimientos.domain.repository;

import com.gratitude.agradecimientos.domain.Thanks;

import java.util.List;

public interface ThanksRepository {
    List<Thanks> getAll();
    Thanks save(Thanks thanks);
}
