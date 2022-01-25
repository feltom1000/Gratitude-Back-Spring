package com.gratitude.agradecimientos.persistence;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.domain.repository.ThanksRepository;
import com.gratitude.agradecimientos.persistence.crud.AgradecimientoCRUDRepository;
import com.gratitude.agradecimientos.persistence.entity.Agradecimiento;
import com.gratitude.agradecimientos.persistence.mapper.ThanksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AgradecimientoRepository implements ThanksRepository {
    @Autowired
    private AgradecimientoCRUDRepository agradecimientoCRUDRepository;
    @Autowired
    private ThanksMapper mapper;

    @Override
    public List<Thanks> getAll() {
        List<Agradecimiento> agradecimientos = (List<Agradecimiento>) agradecimientoCRUDRepository.findAll();
        return mapper.toManyThanks(agradecimientos);
    }

    @Override
    public Optional<Thanks> getThanks(int thanksId) {
        Optional<Agradecimiento> agradecimientos = agradecimientoCRUDRepository.findById(thanksId);
        return agradecimientos.map(agradecimiento -> mapper.toThanks(agradecimiento));
    }

    @Override
    public Thanks save(Thanks thanks) {
        Agradecimiento agradecimiento = mapper.toAgradecimiento(thanks);
        return mapper.toThanks(agradecimientoCRUDRepository.save(agradecimiento));
    }

    @Override
    public void delete(int thanksId) {
        agradecimientoCRUDRepository.deleteById(thanksId);
    }
}
