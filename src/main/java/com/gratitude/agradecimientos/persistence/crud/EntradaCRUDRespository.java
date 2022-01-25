package com.gratitude.agradecimientos.persistence.crud;

import com.gratitude.agradecimientos.persistence.entity.Entrada;
import org.springframework.data.repository.CrudRepository;

public interface EntradaCRUDRespository extends CrudRepository<Entrada, Integer> {
}
