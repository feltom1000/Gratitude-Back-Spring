package com.gratitude.agradecimientos.persistence.crud;

import com.gratitude.agradecimientos.persistence.entity.Agradecimiento;
import org.springframework.data.repository.CrudRepository;

public interface AgradecimientoCRUDRepository extends CrudRepository<Agradecimiento, Integer> {
}
