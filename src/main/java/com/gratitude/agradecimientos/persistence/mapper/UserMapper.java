package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.domain.User;
import com.gratitude.agradecimientos.persistence.entity.Entrada;
import com.gratitude.agradecimientos.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Post.class})
public interface UserMapper {

    @Mappings({
            @Mapping(source = "idUsuario", target = "idUser"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "email", target = "mail"),
            @Mapping(source = "entradas", target = "posts")
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario (User user);



}
