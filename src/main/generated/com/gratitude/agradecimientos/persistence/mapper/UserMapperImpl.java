package com.gratitude.agradecimientos.persistence.mapper;

import com.gratitude.agradecimientos.domain.Post;
import com.gratitude.agradecimientos.domain.User;
import com.gratitude.agradecimientos.persistence.entity.Entrada;
import com.gratitude.agradecimientos.persistence.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-28T14:16:36-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (AdoptOpenJDK)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        User user = new User();

        if ( usuario.getIdUsuario() != null ) {
            user.setIdUser( usuario.getIdUsuario() );
        }
        user.setName( usuario.getNombre() );
        user.setMail( usuario.getEmail() );
        user.setPosts( entradaListToPostList( usuario.getEntradas() ) );

        return user;
    }

    @Override
    public List<User> toUsers(List<Usuario> usuarios) {
        if ( usuarios == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( toUser( usuario ) );
        }

        return list;
    }

    @Override
    public Usuario toUsuario(User user) {
        if ( user == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setIdUsuario( user.getIdUser() );
        usuario.setNombre( user.getName() );
        usuario.setEmail( user.getMail() );
        usuario.setEntradas( postListToEntradaList( user.getPosts() ) );

        return usuario;
    }

    protected Post entradaToPost(Entrada entrada) {
        if ( entrada == null ) {
            return null;
        }

        Post post = new Post();

        return post;
    }

    protected List<Post> entradaListToPostList(List<Entrada> list) {
        if ( list == null ) {
            return null;
        }

        List<Post> list1 = new ArrayList<Post>( list.size() );
        for ( Entrada entrada : list ) {
            list1.add( entradaToPost( entrada ) );
        }

        return list1;
    }

    protected Entrada postToEntrada(Post post) {
        if ( post == null ) {
            return null;
        }

        Entrada entrada = new Entrada();

        return entrada;
    }

    protected List<Entrada> postListToEntradaList(List<Post> list) {
        if ( list == null ) {
            return null;
        }

        List<Entrada> list1 = new ArrayList<Entrada>( list.size() );
        for ( Post post : list ) {
            list1.add( postToEntrada( post ) );
        }

        return list1;
    }
}
