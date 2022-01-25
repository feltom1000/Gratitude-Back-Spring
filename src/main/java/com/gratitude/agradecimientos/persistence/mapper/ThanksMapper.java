package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.Thanks;
import com.gratitude.agradecimientos.persistence.entity.Agradecimiento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ThanksMapper {

    @Mappings({
            @Mapping(source = "descripcion", target = "description")
    })
    Thanks toThanks(Agradecimiento agradecimiento);
    List<Thanks> toManyThanks(List<Agradecimiento> agradecimientos);

    @InheritInverseConfiguration
    Agradecimiento toAgradecimiento(Thanks thanks);
}
