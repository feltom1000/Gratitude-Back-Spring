package com.gratitude.agradecimientos.domain.service;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.domain.repository.ThanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThanksService {
    @Autowired
    private ThanksRepository thanksRepository;

    public List<Thanks> getAll(){
        return thanksRepository.getAll();
    }

    public Optional<Thanks> getThanks(int thanksId){
        return thanksRepository.getThanks(thanksId);
    }

    public Thanks save(Thanks thanks){
        return thanksRepository.save(thanks);
    }

    public boolean deleteById(int thanksId){
        if (getThanks(thanksId).isPresent()){
            thanksRepository.delete(thanksId);
            return true;
        } else {
            return false;
        }
    }

}
