package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.ThanksPost;
import com.gratitude.agradecimientos.persistence.entity.EntradaAgradecimiento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ThanksMapper.class, PostMapper.class})
public interface ThanksPostMapper {

    @Mappings({
            @Mapping(source = "id.idAgradecimiento", target = "thanksId"),
            @Mapping(source = "id.idEntrada", target = "postId")
    })
    ThanksPost toThanksPost(EntradaAgradecimiento entradaAgradecimiento);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "entrada", ignore = true),
            @Mapping(target = "agradecimiento", ignore = true)
    })
    EntradaAgradecimiento toEntradaAgradecimiento(ThanksPost thanksPost);
}
