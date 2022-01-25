package com.gratitude.agradecimientos.domain.service;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.domain.repository.ThanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanksService {
    @Autowired
    private ThanksRepository thanksRepository;

    public List<Thanks> getAll(){
        return thanksRepository.getAll();
    }

    public Thanks save(Thanks thanks){
        return thanksRepository.save(thanks);
    }

}
