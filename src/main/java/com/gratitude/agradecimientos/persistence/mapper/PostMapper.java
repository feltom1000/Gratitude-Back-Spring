package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.persistence.entity.Entrada;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ThanksPostMapper.class})
public interface PostMapper {

    @Mappings({
            @Mapping(source = "idEntrada", target = "postId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "agradecimientos", target= "thanksList")
    })
    Post toPost(Entrada entrada);
    List<Post> toPosts(List<Entrada> entradas);

    @InheritInverseConfiguration
    @Mapping(target = "user", ignore = true)
    Entrada toEntrada(Post post);

}
